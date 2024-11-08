package com.example.Cron.job.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class controller {

    @GetMapping("/test")
    public String testRun(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentTime = LocalDateTime.now().format(formatter);
        String mesaage="Manual test run at: "+ currentTime;
        System.out.println(mesaage);
        return mesaage;
    }
}
