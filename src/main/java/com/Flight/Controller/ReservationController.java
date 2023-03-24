package com.Flight.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight.Dto.ReservationRequest;
import com.Flight.Entities.Reservation;
import com.Flight.Service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;

	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservationId = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationId", reservationId.getId());
		return "ConfirmReservation";
	}
}

