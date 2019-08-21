package com.example.demo;

import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	//Test Mongo Driver
//	@Test
	public void contextLoads() {
		System.out.printf("hello");
		// Creating a Mongo client
//		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		MongoClient mongoClient = MongoClients.create();

		// Creating Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "myDb",
				"password".toCharArray());
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase("myDb");
		System.out.println("Credentials ::"+ credential);
	}

	@Test
	public void generateMysqlJooq()
	{
		System.out.println("DemoApplicationTests.generateMysqlJooq");
		Configuration configuration = new Configuration()
				.withJdbc(new Jdbc()
						.withDriver("com.mysql.jdbc.Driver")
						.withUrl("jdbc:mysql://localhost:3306/classicmodels")
						.withUser("root")
						.withPassword("admin"))
				.withGenerator(new Generator()
						.withName("org.jooq.util.DefaultGenerator")
						.withDatabase(new Database()
								.withName("classicmodels")
								.withIncludes(".*")
								.withSchemata(new Schema().withInputSchema("your_schema"))
						)
						.withTarget(new Target()
								.withPackageName("jooq.generate")
								.withDirectory("src/main/java")));
		try {
			GenerationTool.generate(configuration);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void redisDriverTest() {
		System.out.println("Redis Test");
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		//check whether server is running or not
		System.out.println("Server is running: "+jedis.ping());

		String s = jedis.get("user:123");
		System.out.println("s = " + s);

		//store data in redis list
		jedis.lpush("tutorial-list", "Redis");
		jedis.lpush("tutorial-list", "Mongodb");
		jedis.lpush("tutorial-list", "Mysql");
		// Get the stored data and print it
		List<String> list = jedis.lrange("tutorial-list", 0 ,5);

		for(int i = 0; i<list.size(); i++) {
			System.out.println("Stored string in redis:: "+list.get(i));
		}
	}
}
