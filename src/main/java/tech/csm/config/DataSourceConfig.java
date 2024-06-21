package tech.csm.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder ds=DataSourceBuilder.create();
		ds.driverClassName("com.mysql.cj.jdbc.Driver");
		ds.url("jdbc:mysql://localhost:3306/doctors_pen");
		ds.username("root");
		ds.password("root");
		return ds.build();
	}
	
	

}
