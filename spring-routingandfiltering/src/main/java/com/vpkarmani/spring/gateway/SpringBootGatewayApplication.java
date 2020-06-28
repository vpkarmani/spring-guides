package com.vpkarmani.spring.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.vpkarmani.spring.gateway.filter.PreFilter;

@EnableZuulProxy
@SpringBootApplication
public class SpringBootGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootGatewayApplication.class, args);
  }

  @Bean
  public PreFilter simpleFilter() {
    return new PreFilter();
  }

}