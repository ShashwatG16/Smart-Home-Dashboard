package com.example.SHD_backend.SHD_backend.model;

import java.util.HashMap;
import java.util.Map;

public class EnergyLog {
    private String timestamp;
    private double energyUsed;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(double energyUsed) {
        this.energyUsed = energyUsed;
    }

    public EnergyLog(String timestamp, double energyUsed) {
        this.timestamp = timestamp;
        this.energyUsed = energyUsed;
    }

    public Map<String, Double> getEnergyTrends() {
        // Example: Calculate energy usage per day
        Map<String, Double> trends = new HashMap<>();
        // Logic for aggregating energy usage
        return trends;
    }


    @Override
    public String toString() {
        return "EnergyLog{" +
                "timestamp='" + timestamp + '\'' +
                ", energyUsed=" + energyUsed +
                '}';
    }
}
