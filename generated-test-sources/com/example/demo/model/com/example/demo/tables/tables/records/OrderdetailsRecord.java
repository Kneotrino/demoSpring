/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.records;


import com.example.demo.model.com.example.demo.tables.tables.Orderdetails;
import com.example.demo.model.com.example.demo.tables.tables.interfaces.IOrderdetails;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OrderdetailsRecord extends UpdatableRecordImpl<OrderdetailsRecord> implements Record5<Integer, String, Integer, BigDecimal, Short>, IOrderdetails {

    private static final long serialVersionUID = -391265117;

    /**
     * Setter for <code>classicmodels.orderdetails.orderNumber</code>.
     */
    public void setOrdernumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.orderdetails.orderNumber</code>.
     */
    @Override
    public Integer getOrdernumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>classicmodels.orderdetails.productCode</code>.
     */
    public void setProductcode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.orderdetails.productCode</code>.
     */
    @Override
    public String getProductcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>classicmodels.orderdetails.quantityOrdered</code>.
     */
    public void setQuantityordered(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.orderdetails.quantityOrdered</code>.
     */
    @Override
    public Integer getQuantityordered() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>classicmodels.orderdetails.priceEach</code>.
     */
    public void setPriceeach(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.orderdetails.priceEach</code>.
     */
    @Override
    public BigDecimal getPriceeach() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>classicmodels.orderdetails.orderLineNumber</code>.
     */
    public void setOrderlinenumber(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>classicmodels.orderdetails.orderLineNumber</code>.
     */
    @Override
    public Short getOrderlinenumber() {
        return (Short) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, BigDecimal, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, BigDecimal, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Orderdetails.ORDERDETAILS.ORDERNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Orderdetails.ORDERDETAILS.PRODUCTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Orderdetails.ORDERDETAILS.QUANTITYORDERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Orderdetails.ORDERDETAILS.PRICEEACH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Orderdetails.ORDERDETAILS.ORDERLINENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrdernumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProductcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getQuantityordered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPriceeach();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getOrderlinenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderdetailsRecord value1(Integer value) {
        setOrdernumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderdetailsRecord value2(String value) {
        setProductcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderdetailsRecord value3(Integer value) {
        setQuantityordered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderdetailsRecord value4(BigDecimal value) {
        setPriceeach(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderdetailsRecord value5(Short value) {
        setOrderlinenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderdetailsRecord values(Integer value1, String value2, Integer value3, BigDecimal value4, Short value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IOrderdetails from) {
        setOrdernumber(from.getOrdernumber());
        setProductcode(from.getProductcode());
        setQuantityordered(from.getQuantityordered());
        setPriceeach(from.getPriceeach());
        setOrderlinenumber(from.getOrderlinenumber());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderdetailsRecord
     */
    public OrderdetailsRecord() {
        super(Orderdetails.ORDERDETAILS);
    }

    /**
     * Create a detached, initialised OrderdetailsRecord
     */
    public OrderdetailsRecord(Integer ordernumber, String productcode, Integer quantityordered, BigDecimal priceeach, Short orderlinenumber) {
        super(Orderdetails.ORDERDETAILS);

        set(0, ordernumber);
        set(1, productcode);
        set(2, quantityordered);
        set(3, priceeach);
        set(4, orderlinenumber);
    }
}
