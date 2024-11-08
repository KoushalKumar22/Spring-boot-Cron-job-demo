package com.example.Cron.job.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {

    // Task that runs every 10 seconds using a cron expression
    @Scheduled(cron = "*/10 * * * * *")
    public void executeTask(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        String currentTime = LocalDateTime.now().format(formatter);
        System.out.println("Scheduled task executed automatically at: "+currentTime);
    }
}
