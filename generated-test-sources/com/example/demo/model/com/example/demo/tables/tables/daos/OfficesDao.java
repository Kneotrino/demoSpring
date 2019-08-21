/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.daos;


import com.example.demo.model.com.example.demo.tables.tables.Offices;
import com.example.demo.model.com.example.demo.tables.tables.records.OfficesRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class OfficesDao extends DAOImpl<OfficesRecord, com.example.demo.model.com.example.demo.tables.tables.pojos.Offices, String> {

    /**
     * Create a new OfficesDao without any configuration
     */
    public OfficesDao() {
        super(Offices.OFFICES, com.example.demo.model.com.example.demo.tables.tables.pojos.Offices.class);
    }

    /**
     * Create a new OfficesDao with an attached configuration
     */
    @Autowired
    public OfficesDao(Configuration configuration) {
        super(Offices.OFFICES, com.example.demo.model.com.example.demo.tables.tables.pojos.Offices.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.example.demo.model.com.example.demo.tables.tables.pojos.Offices object) {
        return object.getOfficecode();
    }

    /**
     * Fetch records that have <code>officeCode IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByOfficecode(String... values) {
        return fetch(Offices.OFFICES.OFFICECODE, values);
    }

    /**
     * Fetch a unique record that has <code>officeCode = value</code>
     */
    public com.example.demo.model.com.example.demo.tables.tables.pojos.Offices fetchOneByOfficecode(String value) {
        return fetchOne(Offices.OFFICES.OFFICECODE, value);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByCity(String... values) {
        return fetch(Offices.OFFICES.CITY, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByPhone(String... values) {
        return fetch(Offices.OFFICES.PHONE, values);
    }

    /**
     * Fetch records that have <code>addressLine1 IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByAddressline1(String... values) {
        return fetch(Offices.OFFICES.ADDRESSLINE1, values);
    }

    /**
     * Fetch records that have <code>addressLine2 IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByAddressline2(String... values) {
        return fetch(Offices.OFFICES.ADDRESSLINE2, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByState(String... values) {
        return fetch(Offices.OFFICES.STATE, values);
    }

    /**
     * Fetch records that have <code>country IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByCountry(String... values) {
        return fetch(Offices.OFFICES.COUNTRY, values);
    }

    /**
     * Fetch records that have <code>postalCode IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByPostalcode(String... values) {
        return fetch(Offices.OFFICES.POSTALCODE, values);
    }

    /**
     * Fetch records that have <code>territory IN (values)</code>
     */
    public List<com.example.demo.model.com.example.demo.tables.tables.pojos.Offices> fetchByTerritory(String... values) {
        return fetch(Offices.OFFICES.TERRITORY, values);
    }
}