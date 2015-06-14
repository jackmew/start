package com.zestiria.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zespri
 * @version 2015/06/07
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App 
{
    public static void main( String[] args )throws Exception {
    	System.out.println("run");
        SpringApplication.run(App.class, args);
    }
}
