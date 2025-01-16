package com.example.SHD_backend.SHD_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "devices")
public class Device {
    @Id
    private String id;
    private String name;
    private String type;
    private boolean status; // On/Off
    private double energyUsage; // kWh
    private String lastUpdated;
    private List<EnergyLog> usageHistory;

    // Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(double energyUsage) {
        this.energyUsage = energyUsage;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<EnergyLog> getUsageHistory() {
        return usageHistory;
    }

    public void setUsageHistory(List<EnergyLog> usageHistory) {
        this.usageHistory = usageHistory;
    }

    public Device(String name, String type, boolean status, double energyUsage, String lastUpdated, List<EnergyLog> usageHistory) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.energyUsage = energyUsage;
        this.lastUpdated = lastUpdated;
        this.usageHistory = usageHistory;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", energyUsage=" + energyUsage +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", usageHistory=" + usageHistory +
                '}';
    }
}
