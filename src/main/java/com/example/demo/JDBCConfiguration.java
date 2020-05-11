package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCConfiguration {

	@Bean(name="datasource1")
	public DataSource getDataSource() {
		DataSourceBuilder datasourceBuilder = DataSourceBuilder.create();
		datasourceBuilder.driverClassName("org.postgresql.Driver");
		datasourceBuilder.url("jdbc:postgresql://localhost:5432/postgres");
		datasourceBuilder.username("postgres");
		datasourceBuilder.password("xyz123");
		return datasourceBuilder.build();
	}
}
