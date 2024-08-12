package com.ahmete.week07.day01.sinavSoruCozumu.databases;

import com.ahmete.week07.day01.sinavSoruCozumu.entities.Reservation;
import com.ahmete.week07.day01.sinavSoruCozumu.utility.DatabaseManager;
import com.ahmete.week07.day01.sinavSoruCozumu.utility.enums.EReservationStatus;

import java.util.ArrayList;
import java.util.List;

public class ReservationDB extends DatabaseManager<Reservation> {
	public List<Reservation> findPendingByCustomerId(int customerId){
		List<Reservation> reservationList = new ArrayList<>();
		for (Reservation reservation : veriListesi){
			if (reservation.getReservationStatus().equals(EReservationStatus.PENDING)&&reservation.getCustomerId()==customerId){
				reservationList.add(reservation);
			}
		}
		return reservationList;
	}
}