package com.flightapp.user.service;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;


@Configuration
@ConfigurationProperties("oracle")
public class AppConfig {

	private String username;
	private String password;
	private String url;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Bean
	public DataSource dataSource() throws SQLException {
		PoolDataSource datasource = PoolDataSourceFactory.getPoolDataSource();
		datasource.setUser(username);
		datasource.setPassword("root");
		datasource.setURL("jdbc:oracle:thin:@localhost:1521/orcl");
		datasource.setConnectionFactoryClassName("oracle.jdbc.OracleDriver");
		datasource.setFastConnectionFailoverEnabled(true);
		datasource.setInitialPoolSize(10);
		datasource.setMinPoolSize(20);
		datasource.setMaxPoolSize(50);
		datasource.setMaxIdleTime(300);
		
		return datasource;
	}

}
