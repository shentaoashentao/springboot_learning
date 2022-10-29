package com.shentao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.shentao")
@PropertySource("claspath:jdbc.properties")
public class SpringConfig {
}
