/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.pojos;


import com.example.demo.model.com.example.demo.tables.tables.interfaces.IOrderdetails;

import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Orderdetails implements IOrderdetails {

    private static final long serialVersionUID = 1771544194;

    private final Integer    ordernumber;
    private final String     productcode;
    private final Integer    quantityordered;
    private final BigDecimal priceeach;
    private final Short      orderlinenumber;

    public Orderdetails(Orderdetails value) {
        this.ordernumber = value.ordernumber;
        this.productcode = value.productcode;
        this.quantityordered = value.quantityordered;
        this.priceeach = value.priceeach;
        this.orderlinenumber = value.orderlinenumber;
    }

    public Orderdetails(
        Integer    ordernumber,
        String     productcode,
        Integer    quantityordered,
        BigDecimal priceeach,
        Short      orderlinenumber
    ) {
        this.ordernumber = ordernumber;
        this.productcode = productcode;
        this.quantityordered = quantityordered;
        this.priceeach = priceeach;
        this.orderlinenumber = orderlinenumber;
    }

    @Override
    public Integer getOrdernumber() {
        return this.ordernumber;
    }

    @Override
    public String getProductcode() {
        return this.productcode;
    }

    @Override
    public Integer getQuantityordered() {
        return this.quantityordered;
    }

    @Override
    public BigDecimal getPriceeach() {
        return this.priceeach;
    }

    @Override
    public Short getOrderlinenumber() {
        return this.orderlinenumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orderdetails (");

        sb.append(ordernumber);
        sb.append(", ").append(productcode);
        sb.append(", ").append(quantityordered);
        sb.append(", ").append(priceeach);
        sb.append(", ").append(orderlinenumber);

        sb.append(")");
        return sb.toString();
    }
}
