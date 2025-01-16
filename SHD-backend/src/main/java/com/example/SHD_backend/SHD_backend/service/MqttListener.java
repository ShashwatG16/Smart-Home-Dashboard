package com.example.SHD_backend.SHD_backend.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class MqttListener {
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
