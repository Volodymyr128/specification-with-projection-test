package com.vbakh.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by volodymyr.bakhmatiuk on 11/30/17.
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan
public class Config {
}
