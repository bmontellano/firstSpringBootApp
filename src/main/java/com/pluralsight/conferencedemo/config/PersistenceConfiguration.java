//COMMENTING THIS FILE OUT
//UNNECESSARY CONFIGURATION
//WE CAN USE THIS AS A TEMPLATE
/* 
package com.pluralsight.conferencedemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
    @Value("${spring.datasource.url}")
    private String dbURL;
    @Value("${spring.datasource.username}")
    private String dbUserName;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    //SpringContext will find this DataSource and use it instead
    //We need to add @Bean
    //Body of this method is where config happens
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder<?> dsBuilder = DataSourceBuilder.create();
        dsBuilder.url(dbURL);
        dsBuilder.username(dbUserName);
        dsBuilder.password(dbPassword);
        //Below is to check successful injection
        //System.out.println("My custom DataSource bean has been initialized and set");
        return dsBuilder.build();
    }
    
}

*/ 

