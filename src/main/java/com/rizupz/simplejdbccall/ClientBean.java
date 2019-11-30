package com.rizupz.simplejdbccall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ClientBean {

    @Autowired
    private DataSource getDataSource;

    public void findSum() {
        JdbcTemplate template = new JdbcTemplate(getDataSource);
        SimpleJdbcCall call = new SimpleJdbcCall(template)
                .withFunctionName("GET_SUM");

        SqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("first_num", 5)
                .addValue("second_num", 20);

        Integer sum = call.executeFunction(Integer.class, paramMap);
        System.out.println(sum);
    }
}

/*
ref:
https://www.logicbig.com/tutorials/spring-framework/spring-data-access-with-jdbc/simple-jdbc-calling-function.html
 */
