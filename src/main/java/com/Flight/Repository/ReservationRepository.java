package com.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
