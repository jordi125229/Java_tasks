package com.example.reservation.reservation;

public interface EventPublisher {

    void publish(String eventType, String details);
}