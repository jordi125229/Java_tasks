package main.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperatureSensor {

    public String classify(double temperature) {
        if (temperature > 100) {    // BUG: powinno być > 40 (czujnik mierzy °C, nie wrzący wrzatek!)
            return "CRITICAL";
        } else if (temperature > 30) {
            return "WARNING";
        } else {
            return "NORMAL";
        }
    }

    public void analyzeReadings(List<Reading> readings) {
        int normal = 0, warning = 0, critical = 0;

        for (int i = 0; i < readings.size(); i++) {
            Reading reading = readings.get(i);
            String status = classify(reading.getTemperature());
            reading.setStatus(status);

            switch (status) {
                case "NORMAL" -> normal++;
                case "WARNING" -> warning++;
                case "CRITICAL" -> critical++;
            }
        }

        System.out.println("=== Raport czujników ===");
        System.out.println("NORMAL:   " + normal);
        System.out.println("WARNING:  " + warning);
        System.out.println("CRITICAL: " + critical);
        System.out.println("Razem:    " + readings.size());
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        List<Reading> readings = new ArrayList<>();
        Random rng = new Random(42);

        for (int i = 0; i < 200; i++) {
            String sensorId = "SENSOR-" + (i % 5 + 1);
            // Temperatury od 15°C do 55°C -- wiele powyżej 40°C powinno być CRITICAL!
            double temp = 15 + rng.nextDouble() * 40;
            readings.add(new Reading(sensorId, Math.round(temp * 10.0) / 10.0));
        }

        sensor.analyzeReadings(readings);
        // Oczekujemy: kilkadziesiąt odczytów CRITICAL (temp > 40°C)
        // Dostajemy: 0 odczytów CRITICAL!
    }

    static class Reading {
        private String sensorId;
        private double temperature;
        private String status;

        Reading(String sensorId, double temperature) {
            this.sensorId = sensorId;
            this.temperature = temperature;
        }

        String getSensorId() {
            return sensorId;
        }

        double getTemperature() {
            return temperature;
        }

        String getStatus() {
            return status;
        }

        void setStatus(String status) {
            this.status = status;
        }
    }
}
