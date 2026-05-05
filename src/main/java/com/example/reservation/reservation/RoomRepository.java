package com.example.reservation.reservation;

import java.util.Optional;

public interface RoomRepository {

    Optional<Room> findById(String roomId);
}