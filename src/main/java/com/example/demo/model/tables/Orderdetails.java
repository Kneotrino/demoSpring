/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.tables;


import com.example.demo.model.Classicmodels;
import com.example.demo.model.Keys;
import com.example.demo.model.tables.records.OrderdetailsRecord;

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
public class Orderdetails extends TableImpl<OrderdetailsRecord> {

    private static final long serialVersionUID = 1209763343;

    /**
     * The reference instance of <code>classicmodels.orderdetails</code>
     */
    public static final Orderdetails ORDERDETAILS = new Orderdetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderdetailsRecord> getRecordType() {
        return OrderdetailsRecord.class;
    }

    /**
     * The column <code>classicmodels.orderdetails.orderNumber</code>.
     */
    public final TableField<OrderdetailsRecord, Integer> ORDERNUMBER = createField("orderNumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetails.productCode</code>.
     */
    public final TableField<OrderdetailsRecord, String> PRODUCTCODE = createField("productCode", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetails.quantityOrdered</code>.
     */
    public final TableField<OrderdetailsRecord, Integer> QUANTITYORDERED = createField("quantityOrdered", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetails.priceEach</code>.
     */
    public final TableField<OrderdetailsRecord, BigDecimal> PRICEEACH = createField("priceEach", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetails.orderLineNumber</code>.
     */
    public final TableField<OrderdetailsRecord, Short> ORDERLINENUMBER = createField("orderLineNumber", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>classicmodels.orderdetails</code> table reference
     */
    public Orderdetails() {
        this("orderdetails", null);
    }

    /**
     * Create an aliased <code>classicmodels.orderdetails</code> table reference
     */
    public Orderdetails(String alias) {
        this(alias, ORDERDETAILS);
    }

    private Orderdetails(String alias, Table<OrderdetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Orderdetails(String alias, Table<OrderdetailsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<OrderdetailsRecord> getPrimaryKey() {
        return Keys.KEY_ORDERDETAILS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderdetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderdetailsRecord>>asList(Keys.KEY_ORDERDETAILS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrderdetailsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderdetailsRecord, ?>>asList(Keys.ORDERDETAILS_IBFK_1, Keys.ORDERDETAILS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Orderdetails as(String alias) {
        return new Orderdetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Orderdetails rename(String name) {
        return new Orderdetails(name, null);
    }
}