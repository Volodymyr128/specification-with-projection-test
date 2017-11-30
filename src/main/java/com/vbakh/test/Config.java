package com.vbakh.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import th.co.geniustree.springdata.jpa.repository.support.JpaSpecificationExecutorWithProjectionImpl;

/**
 * Created by volodymyr.bakhmatiuk on 11/30/17.
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(repositoryBaseClass = JpaSpecificationExecutorWithProjectionImpl.class)
@ComponentScan
public class Config {
}
