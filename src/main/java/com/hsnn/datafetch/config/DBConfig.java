package com.hsnn.datafetch.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by admin on 2017/6/1.
 */
@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "com.hsnn.datafetch.database")
@MapperScan("com.hsnn.datafetch.database.mapper")
public class DBConfig implements EnvironmentAware {

    @Autowired
    private Environment env;

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
    public DataSource dataSource()  {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("db.driver.class"));
        ds.setUrl(env.getProperty("db.url"));
        ds.setUsername(env.getProperty("db.username"));
        ds.setPassword(env.getProperty("db.password"));
//        ds.setInitialSize(env.getProperty("db.proxool.initialSize",Integer.class, 1));
//        ds.setMaxActive(env.getProperty("db.proxool.maxActive", Integer.class, 5));
        return ds;
    }

//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        factoryBean.setMapperLocations(new Resource[]{new ClassPathResource("com.hsnn.datafetch.database/mapper/TskTokenMapper.xml")});
//        return factoryBean;
//    }
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//        configurer.setBasePackage("com.hsnn.datafetch.database.mapper");
////        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        return configurer;
//    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.hsnn.datafetch.database.mapper");
        return sessionFactory;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }


//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
}
