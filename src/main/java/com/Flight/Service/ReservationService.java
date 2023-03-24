package com.Flight.Service;

import com.Flight.Dto.ReservationRequest;
import com.Flight.Entities.Reservation;

public interface ReservationService {
	
	Reservation bookFlight(ReservationRequest request); 

}
