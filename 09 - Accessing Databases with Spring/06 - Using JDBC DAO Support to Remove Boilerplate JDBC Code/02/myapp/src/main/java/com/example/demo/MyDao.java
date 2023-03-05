package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class MyDao extends JdbcDaoSupport {

    @Autowired
    public MyDao(DataSource dataSource) {
        setDataSource(dataSource);
    }

    @PostConstruct
    public void doQuery() {
        String result = getJdbcTemplate().queryForObject("select 1 from dual", String.class);
        System.out.println("result = " + result);
    }

}
