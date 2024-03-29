/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.pojos;


import com.example.demo.model.com.example.demo.tables.tables.interfaces.IProducts;

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
public class Products implements IProducts {

    private static final long serialVersionUID = 331615061;

    private final String     productcode;
    private final String     productname;
    private final String     productline;
    private final String     productscale;
    private final String     productvendor;
    private final String     productdescription;
    private final Short      quantityinstock;
    private final BigDecimal buyprice;
    private final BigDecimal msrp;

    public Products(Products value) {
        this.productcode = value.productcode;
        this.productname = value.productname;
        this.productline = value.productline;
        this.productscale = value.productscale;
        this.productvendor = value.productvendor;
        this.productdescription = value.productdescription;
        this.quantityinstock = value.quantityinstock;
        this.buyprice = value.buyprice;
        this.msrp = value.msrp;
    }

    public Products(
        String     productcode,
        String     productname,
        String     productline,
        String     productscale,
        String     productvendor,
        String     productdescription,
        Short      quantityinstock,
        BigDecimal buyprice,
        BigDecimal msrp
    ) {
        this.productcode = productcode;
        this.productname = productname;
        this.productline = productline;
        this.productscale = productscale;
        this.productvendor = productvendor;
        this.productdescription = productdescription;
        this.quantityinstock = quantityinstock;
        this.buyprice = buyprice;
        this.msrp = msrp;
    }

    @Override
    public String getProductcode() {
        return this.productcode;
    }

    @Override
    public String getProductname() {
        return this.productname;
    }

    @Override
    public String getProductline() {
        return this.productline;
    }

    @Override
    public String getProductscale() {
        return this.productscale;
    }

    @Override
    public String getProductvendor() {
        return this.productvendor;
    }

    @Override
    public String getProductdescription() {
        return this.productdescription;
    }

    @Override
    public Short getQuantityinstock() {
        return this.quantityinstock;
    }

    @Override
    public BigDecimal getBuyprice() {
        return this.buyprice;
    }

    @Override
    public BigDecimal getMsrp() {
        return this.msrp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Products (");

        sb.append(productcode);
        sb.append(", ").append(productname);
        sb.append(", ").append(productline);
        sb.append(", ").append(productscale);
        sb.append(", ").append(productvendor);
        sb.append(", ").append(productdescription);
        sb.append(", ").append(quantityinstock);
        sb.append(", ").append(buyprice);
        sb.append(", ").append(msrp);

        sb.append(")");
        return sb.toString();
    }
}
