package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        jdbcTemplate.query("select name, department from employees", new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                String name = rs.getString("name");
                String dept = rs.getString("department");

                System.out.println(String.format("Name = [%s], Dept = [%s]", name, dept));
            }
        });
    }

}
