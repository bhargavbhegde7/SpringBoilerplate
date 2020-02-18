package com.bhegde.tryapp;

import com.bhegde.tryapp.filter.TestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        /*System.out.println("Hello, WOrld!");
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(()->{
                System.out.println("Inside the thread");
                try {
                        Thread.sleep(5000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        });
            //service.shutdown();
            System.out.println("after submission");*/

        }


    @Bean
    FilterRegistrationBean myFilterRegistration2 () {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new TestFilter("MyFilter-2"));
        frb.setUrlPatterns(Arrays.asList("/user/*"));
        return frb;
    }

    @Bean
    FilterRegistrationBean myFilterRegistration1 () {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new TestFilter("MyFilter-1"));
        frb.setUrlPatterns(Arrays.asList("/users"));
        return frb;
    }


}
