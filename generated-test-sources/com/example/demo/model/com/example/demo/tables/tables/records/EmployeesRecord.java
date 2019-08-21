/*
 * This file is generated by jOOQ.
*/
package com.example.demo.model.com.example.demo.tables.tables.records;


import com.example.demo.model.com.example.demo.tables.tables.Employees;
import com.example.demo.model.com.example.demo.tables.tables.interfaces.IEmployees;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class EmployeesRecord extends UpdatableRecordImpl<EmployeesRecord> implements Record8<Integer, String, String, String, String, String, Integer, String>, IEmployees {

    private static final long serialVersionUID = 1676703086;

    /**
     * Setter for <code>classicmodels.employees.employeeNumber</code>.
     */
    public void setEmployeenumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.employees.employeeNumber</code>.
     */
    @Override
    public Integer getEmployeenumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>classicmodels.employees.lastName</code>.
     */
    public void setLastname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.employees.lastName</code>.
     */
    @Override
    public String getLastname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>classicmodels.employees.firstName</code>.
     */
    public void setFirstname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.employees.firstName</code>.
     */
    @Override
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>classicmodels.employees.extension</code>.
     */
    public void setExtension(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.employees.extension</code>.
     */
    @Override
    public String getExtension() {
        return (String) get(3);
    }

    /**
     * Setter for <code>classicmodels.employees.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>classicmodels.employees.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>classicmodels.employees.officeCode</code>.
     */
    public void setOfficecode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>classicmodels.employees.officeCode</code>.
     */
    @Override
    public String getOfficecode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>classicmodels.employees.reportsTo</code>.
     */
    public void setReportsto(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>classicmodels.employees.reportsTo</code>.
     */
    @Override
    public Integer getReportsto() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>classicmodels.employees.jobTitle</code>.
     */
    public void setJobtitle(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>classicmodels.employees.jobTitle</code>.
     */
    @Override
    public String getJobtitle() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Employees.EMPLOYEES.EMPLOYEENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Employees.EMPLOYEES.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Employees.EMPLOYEES.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Employees.EMPLOYEES.EXTENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Employees.EMPLOYEES.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Employees.EMPLOYEES.OFFICECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Employees.EMPLOYEES.REPORTSTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Employees.EMPLOYEES.JOBTITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployeenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExtension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOfficecode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getReportsto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getJobtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value1(Integer value) {
        setEmployeenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value2(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value4(String value) {
        setExtension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value6(String value) {
        setOfficecode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value7(Integer value) {
        setReportsto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value8(String value) {
        setJobtitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IEmployees from) {
        setEmployeenumber(from.getEmployeenumber());
        setLastname(from.getLastname());
        setFirstname(from.getFirstname());
        setExtension(from.getExtension());
        setEmail(from.getEmail());
        setOfficecode(from.getOfficecode());
        setReportsto(from.getReportsto());
        setJobtitle(from.getJobtitle());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeesRecord
     */
    public EmployeesRecord() {
        super(Employees.EMPLOYEES);
    }

    /**
     * Create a detached, initialised EmployeesRecord
     */
    public EmployeesRecord(Integer employeenumber, String lastname, String firstname, String extension, String email, String officecode, Integer reportsto, String jobtitle) {
        super(Employees.EMPLOYEES);

        set(0, employeenumber);
        set(1, lastname);
        set(2, firstname);
        set(3, extension);
        set(4, email);
        set(5, officecode);
        set(6, reportsto);
        set(7, jobtitle);
    }
}
