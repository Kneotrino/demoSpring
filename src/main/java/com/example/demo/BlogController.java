package com.example.demo;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

@RestController
public class BlogController {

    @RequestMapping("/")
    public String index() {

        Connection conn = null;
        String userName = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        Result<Record> result = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);

//            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            DSLContext pretty = DSL.using(conn, new Settings().withRenderFormatted(true));

            result = pretty.select().from("customers").limit(10).fetch();

            for (Record r : result) {
                stringBuilder.append(r.formatJSON());
            }
            conn.close();
        } catch (Exception e) {
            // You'll probably want to handle the exceptions in a real app
            // Don't ever do this silence catch(Exception e) thing. I've seen this in
            // live code and it is horrendous.
            e.printStackTrace();
        }




        return result.formatJSON();

//        return "Hello World.java " + new Date().toString();
    }

    @RequestMapping("/Custumer")
    public String Custumer() {

        return "Hello World.java";
    }
}