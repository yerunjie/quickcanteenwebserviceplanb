package com.quickcanteen.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.quickcanteen.mapper")
@EnableTransactionManagement
public class PersistenceConfig {

}