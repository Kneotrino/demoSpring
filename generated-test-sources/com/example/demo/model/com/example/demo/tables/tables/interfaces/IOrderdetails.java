/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.interfaces;


import java.io.Serializable;
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
public interface IOrderdetails extends Serializable {

    /**
     * Getter for <code>classicmodels.orderdetails.orderNumber</code>.
     */
    public Integer getOrdernumber();

    /**
     * Getter for <code>classicmodels.orderdetails.productCode</code>.
     */
    public String getProductcode();

    /**
     * Getter for <code>classicmodels.orderdetails.quantityOrdered</code>.
     */
    public Integer getQuantityordered();

    /**
     * Getter for <code>classicmodels.orderdetails.priceEach</code>.
     */
    public BigDecimal getPriceeach();

    /**
     * Getter for <code>classicmodels.orderdetails.orderLineNumber</code>.
     */
    public Short getOrderlinenumber();
}
