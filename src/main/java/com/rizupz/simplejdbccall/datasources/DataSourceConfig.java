package com.rizupz.simplejdbccall.datasources;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/test");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("utppsps2xbox");
        return dataSourceBuilder.build();
    }
}

/*
keyword:
spring boot 2 mysql datasource example

ref:
https://www.baeldung.com/spring-boot-configure-data-source-programmatic
https://github.com/eugenp/tutorials/blob/master/persistence-modules/spring-boot-persistence/src/main/java/com/baeldung/springbootdatasourceconfig/application/datasources/DataSourceConfig.java
multiple datasource: https://howtodoinjava.com/spring-boot2/datasource-configuration/

sql20
https://www.baeldung.com/java-sql2o
https://github.com/eugenp/tutorials/blob/master/persistence-modules/persistence-libraries/src/test/java/com/baeldung/persistence/sql2o/Sql2oIntegrationTest.java

jdbc example
https://www.mkyong.com/spring-boot/spring-boot-jdbc-examples/
https://github.com/mkyong/spring-boot/blob/master/spring-jdbc/src/main/resources/application.properties
 */