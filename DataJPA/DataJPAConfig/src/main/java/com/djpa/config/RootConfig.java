package com.djpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(PersistencyConfig.class)
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.djpa.service" })
public class RootConfig {

}
