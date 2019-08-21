/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.records;


import com.example.demo.model.com.example.demo.tables.tables.Productlines;
import com.example.demo.model.com.example.demo.tables.tables.interfaces.IProductlines;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class ProductlinesRecord extends UpdatableRecordImpl<ProductlinesRecord> implements Record4<String, String, String, byte[]>, IProductlines {

    private static final long serialVersionUID = -410753907;

    /**
     * Setter for <code>classicmodels.productlines.productLine</code>.
     */
    public void setProductline(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.productlines.productLine</code>.
     */
    @Override
    public String getProductline() {
        return (String) get(0);
    }

    /**
     * Setter for <code>classicmodels.productlines.textDescription</code>.
     */
    public void setTextdescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.productlines.textDescription</code>.
     */
    @Override
    public String getTextdescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>classicmodels.productlines.htmlDescription</code>.
     */
    public void setHtmldescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.productlines.htmlDescription</code>.
     */
    @Override
    public String getHtmldescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>classicmodels.productlines.image</code>.
     */
    public void setImage(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.productlines.image</code>.
     */
    @Override
    public byte[] getImage() {
        return (byte[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Productlines.PRODUCTLINES.PRODUCTLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Productlines.PRODUCTLINES.TEXTDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Productlines.PRODUCTLINES.HTMLDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return Productlines.PRODUCTLINES.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProductline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTextdescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getHtmldescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductlinesRecord value1(String value) {
        setProductline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductlinesRecord value2(String value) {
        setTextdescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductlinesRecord value3(String value) {
        setHtmldescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductlinesRecord value4(byte... value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductlinesRecord values(String value1, String value2, String value3, byte[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IProductlines from) {
        setProductline(from.getProductline());
        setTextdescription(from.getTextdescription());
        setHtmldescription(from.getHtmldescription());
        setImage(from.getImage());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductlinesRecord
     */
    public ProductlinesRecord() {
        super(Productlines.PRODUCTLINES);
    }

    /**
     * Create a detached, initialised ProductlinesRecord
     */
    public ProductlinesRecord(String productline, String textdescription, String htmldescription, byte[] image) {
        super(Productlines.PRODUCTLINES);

        set(0, productline);
        set(1, textdescription);
        set(2, htmldescription);
        set(3, image);
    }
}
