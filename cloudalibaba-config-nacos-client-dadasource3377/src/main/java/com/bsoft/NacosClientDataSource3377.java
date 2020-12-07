package com.bsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.bsoft.dao")
@EnableDiscoveryClient
public class NacosClientDataSource3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientDataSource3377.class,args);
    }
}
