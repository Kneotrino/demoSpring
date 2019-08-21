/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.pojos;


import com.example.demo.model.com.example.demo.tables.tables.interfaces.ICustomers;

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
public class Customers implements ICustomers {

    private static final long serialVersionUID = -1667574025;

    private final Integer    customernumber;
    private final String     customername;
    private final String     contactlastname;
    private final String     contactfirstname;
    private final String     phone;
    private final String     addressline1;
    private final String     addressline2;
    private final String     city;
    private final String     state;
    private final String     postalcode;
    private final String     country;
    private final Integer    salesrepemployeenumber;
    private final BigDecimal creditlimit;

    public Customers(Customers value) {
        this.customernumber = value.customernumber;
        this.customername = value.customername;
        this.contactlastname = value.contactlastname;
        this.contactfirstname = value.contactfirstname;
        this.phone = value.phone;
        this.addressline1 = value.addressline1;
        this.addressline2 = value.addressline2;
        this.city = value.city;
        this.state = value.state;
        this.postalcode = value.postalcode;
        this.country = value.country;
        this.salesrepemployeenumber = value.salesrepemployeenumber;
        this.creditlimit = value.creditlimit;
    }

    public Customers(
        Integer    customernumber,
        String     customername,
        String     contactlastname,
        String     contactfirstname,
        String     phone,
        String     addressline1,
        String     addressline2,
        String     city,
        String     state,
        String     postalcode,
        String     country,
        Integer    salesrepemployeenumber,
        BigDecimal creditlimit
    ) {
        this.customernumber = customernumber;
        this.customername = customername;
        this.contactlastname = contactlastname;
        this.contactfirstname = contactfirstname;
        this.phone = phone;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.postalcode = postalcode;
        this.country = country;
        this.salesrepemployeenumber = salesrepemployeenumber;
        this.creditlimit = creditlimit;
    }

    @Override
    public Integer getCustomernumber() {
        return this.customernumber;
    }

    @Override
    public String getCustomername() {
        return this.customername;
    }

    @Override
    public String getContactlastname() {
        return this.contactlastname;
    }

    @Override
    public String getContactfirstname() {
        return this.contactfirstname;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

    @Override
    public String getAddressline1() {
        return this.addressline1;
    }

    @Override
    public String getAddressline2() {
        return this.addressline2;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getPostalcode() {
        return this.postalcode;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public Integer getSalesrepemployeenumber() {
        return this.salesrepemployeenumber;
    }

    @Override
    public BigDecimal getCreditlimit() {
        return this.creditlimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Customers (");

        sb.append(customernumber);
        sb.append(", ").append(customername);
        sb.append(", ").append(contactlastname);
        sb.append(", ").append(contactfirstname);
        sb.append(", ").append(phone);
        sb.append(", ").append(addressline1);
        sb.append(", ").append(addressline2);
        sb.append(", ").append(city);
        sb.append(", ").append(state);
        sb.append(", ").append(postalcode);
        sb.append(", ").append(country);
        sb.append(", ").append(salesrepemployeenumber);
        sb.append(", ").append(creditlimit);

        sb.append(")");
        return sb.toString();
    }
}