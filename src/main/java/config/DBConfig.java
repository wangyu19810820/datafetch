package config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by admin on 2017/6/1.
 */
@Configuration
@ComponentScan(basePackages = "service.jdbc")
@PropertySource("classpath:db.properties")
public class DBConfig {

    @Autowired
    Environment env;

//    @Bean
//    public DataSource dataSource() throws Exception {
//        Properties properties = new Properties();
//        properties.put("maxActive", "100");
//        properties.put("maxIdle", "30");
//        properties.put("maxWait", "10000");
//        properties.put("url", "jdbc:mock:");
//        properties.put("filters", "stat");
//        properties.put("validationQuery", "SELECT 1");
//        properties.put("jdbcUrl", "jdbc:mysql://127.0.0.1:3306/center_purch_mgr_bg?useUnicode=true&characterEncoding=utf8&useOldAliasMetadataBehavior=true&zeroDateTimeBehavior=convertToNullaa");
//        properties.put("driverClassName", "com.mysql.jdbc.Driver");
//        properties.put("username", "root");
//        properties.put("password", "1111");
//        return DruidDataSourceFactory.createDataSource(properties);
//    }

    @Bean
    public DataSource dataSource() throws Exception {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("db.driver.class"));
        ds.setUrl(env.getProperty("db.url"));
        ds.setUsername(env.getProperty("db.username"));
        ds.setPassword(env.getProperty("db.password"));
        ds.setInitialSize(env.getProperty("db.proxool.initialSize",Integer.class, 1));
        ds.setMaxActive(env.getProperty("db.proxool.maxActive", Integer.class, 5));
        return ds;
    }

//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
}
