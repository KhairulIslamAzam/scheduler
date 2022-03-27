package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
public class SchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerApplication.class, args);

    System.out.println("current time: "+new Date());
    }

//    @Scheduled(fixedRate = 2000L)
//    void someJob(){
//    System.out.println("now job is: "+new Date());
//    }

//    @Scheduled(fixedDelay = 2000L)
//    void someJob() throws InterruptedException {
//        System.out.println("now job is: "+new Date());
//        Thread.sleep(2000L);
//    }

//    @Scheduled(initialDelay = 2000L, fixedRate = 2000L)
//    void someJob(){
//        System.out.println("job is: "+new Date());
//    }


    //to see corn tab in web link: cronntab.guru
    @Scheduled(cron = "0 12 13 * * *")
    void someJob(){
        System.out.println("now job is: "+new Date());
    }
}
