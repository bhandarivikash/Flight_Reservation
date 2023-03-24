package com.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight.Entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
