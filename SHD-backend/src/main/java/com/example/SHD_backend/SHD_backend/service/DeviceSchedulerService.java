package com.example.SHD_backend.SHD_backend.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DeviceSchedulerService {
    @Scheduled(fixedRate = 60000) // Run every minute
    public void automateDevices() {
        // Example: Turn off devices that are inactive for a long time
        System.out.println("Running scheduled automation...");
    }
}
