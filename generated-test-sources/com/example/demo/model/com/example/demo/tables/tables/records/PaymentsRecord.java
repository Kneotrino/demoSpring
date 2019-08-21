/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.records;


import com.example.demo.model.com.example.demo.tables.tables.Payments;
import com.example.demo.model.com.example.demo.tables.tables.interfaces.IPayments;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PaymentsRecord extends UpdatableRecordImpl<PaymentsRecord> implements Record4<Integer, String, LocalDateTime, BigDecimal>, IPayments {

    private static final long serialVersionUID = -998660754;

    /**
     * Setter for <code>classicmodels.payments.customerNumber</code>.
     */
    public void setCustomernumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.payments.customerNumber</code>.
     */
    @Override
    public Integer getCustomernumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>classicmodels.payments.checkNumber</code>.
     */
    public void setChecknumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.payments.checkNumber</code>.
     */
    @Override
    public String getChecknumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>classicmodels.payments.paymentDate</code>.
     */
    public void setPaymentdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.payments.paymentDate</code>.
     */
    @Override
    public LocalDateTime getPaymentdate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>classicmodels.payments.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.payments.amount</code>.
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, LocalDateTime, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, LocalDateTime, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Payments.PAYMENTS.CUSTOMERNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Payments.PAYMENTS.CHECKNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return Payments.PAYMENTS.PAYMENTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Payments.PAYMENTS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCustomernumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getChecknumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getPaymentdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentsRecord value1(Integer value) {
        setCustomernumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentsRecord value2(String value) {
        setChecknumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentsRecord value3(LocalDateTime value) {
        setPaymentdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentsRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentsRecord values(Integer value1, String value2, LocalDateTime value3, BigDecimal value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IPayments from) {
        setCustomernumber(from.getCustomernumber());
        setChecknumber(from.getChecknumber());
        setPaymentdate(from.getPaymentdate());
        setAmount(from.getAmount());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentsRecord
     */
    public PaymentsRecord() {
        super(Payments.PAYMENTS);
    }

    /**
     * Create a detached, initialised PaymentsRecord
     */
    public PaymentsRecord(Integer customernumber, String checknumber, LocalDateTime paymentdate, BigDecimal amount) {
        super(Payments.PAYMENTS);

        set(0, customernumber);
        set(1, checknumber);
        set(2, paymentdate);
        set(3, amount);
    }
}