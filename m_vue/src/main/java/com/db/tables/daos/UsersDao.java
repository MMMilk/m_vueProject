/*
 * This file is generated by jOOQ.
*/
package com.db.tables.daos;


import com.db.tables.Users;
import com.db.tables.records.UsersRecord;

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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class UsersDao extends DAOImpl<UsersRecord, com.db.tables.pojos.Users, Integer> {

    /**
     * Create a new UsersDao without any configuration
     */
    public UsersDao() {
        super(Users.USERS, com.db.tables.pojos.Users.class);
    }

    /**
     * Create a new UsersDao with an attached configuration
     */
    @Autowired
    public UsersDao(Configuration configuration) {
        super(Users.USERS, com.db.tables.pojos.Users.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.db.tables.pojos.Users object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.db.tables.pojos.Users> fetchById(Integer... values) {
        return fetch(Users.USERS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.db.tables.pojos.Users fetchOneById(Integer value) {
        return fetchOne(Users.USERS.ID, value);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<com.db.tables.pojos.Users> fetchByUsername(String... values) {
        return fetch(Users.USERS.USERNAME, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.db.tables.pojos.Users> fetchByPassword(String... values) {
        return fetch(Users.USERS.PASSWORD, values);
    }
}
