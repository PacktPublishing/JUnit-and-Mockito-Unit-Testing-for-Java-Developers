package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class MyDao {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public MyDao(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.dataSource = dataSource;
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void doQuery() {
        jdbcTemplate.execute("select 1 from dual");
    }

}
