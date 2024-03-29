/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables;


import com.example.demo.model.com.example.demo.tables.Classicmodels;
import com.example.demo.model.com.example.demo.tables.Keys;
import com.example.demo.model.com.example.demo.tables.tables.records.CustomersRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Customers extends TableImpl<CustomersRecord> {

    private static final long serialVersionUID = 1008967826;

    /**
     * The reference instance of <code>classicmodels.customers</code>
     */
    public static final Customers CUSTOMERS = new Customers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomersRecord> getRecordType() {
        return CustomersRecord.class;
    }

    /**
     * The column <code>classicmodels.customers.customerNumber</code>.
     */
    public final TableField<CustomersRecord, Integer> CUSTOMERNUMBER = createField("customerNumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.customerName</code>.
     */
    public final TableField<CustomersRecord, String> CUSTOMERNAME = createField("customerName", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.contactLastName</code>.
     */
    public final TableField<CustomersRecord, String> CONTACTLASTNAME = createField("contactLastName", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.contactFirstName</code>.
     */
    public final TableField<CustomersRecord, String> CONTACTFIRSTNAME = createField("contactFirstName", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.phone</code>.
     */
    public final TableField<CustomersRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.addressLine1</code>.
     */
    public final TableField<CustomersRecord, String> ADDRESSLINE1 = createField("addressLine1", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.addressLine2</code>.
     */
    public final TableField<CustomersRecord, String> ADDRESSLINE2 = createField("addressLine2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>classicmodels.customers.city</code>.
     */
    public final TableField<CustomersRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.state</code>.
     */
    public final TableField<CustomersRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>classicmodels.customers.postalCode</code>.
     */
    public final TableField<CustomersRecord, String> POSTALCODE = createField("postalCode", org.jooq.impl.SQLDataType.VARCHAR.length(15), this, "");

    /**
     * The column <code>classicmodels.customers.country</code>.
     */
    public final TableField<CustomersRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.customers.salesRepEmployeeNumber</code>.
     */
    public final TableField<CustomersRecord, Integer> SALESREPEMPLOYEENUMBER = createField("salesRepEmployeeNumber", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>classicmodels.customers.creditLimit</code>.
     */
    public final TableField<CustomersRecord, BigDecimal> CREDITLIMIT = createField("creditLimit", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this, "");

    /**
     * Create a <code>classicmodels.customers</code> table reference
     */
    public Customers() {
        this("customers", null);
    }

    /**
     * Create an aliased <code>classicmodels.customers</code> table reference
     */
    public Customers(String alias) {
        this(alias, CUSTOMERS);
    }

    private Customers(String alias, Table<CustomersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customers(String alias, Table<CustomersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Classicmodels.CLASSICMODELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomersRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomersRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomersRecord>>asList(Keys.KEY_CUSTOMERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CustomersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CustomersRecord, ?>>asList(Keys.CUSTOMERS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customers as(String alias) {
        return new Customers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(String name) {
        return new Customers(name, null);
    }
}
