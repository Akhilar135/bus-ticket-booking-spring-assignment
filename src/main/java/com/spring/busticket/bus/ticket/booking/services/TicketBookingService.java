package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;

import java.util.List;

public interface TicketBookingService {
    String seatBooking(List<TicketBooking> bookingList);

    List <TicketBooking> getBookingList();

    String deleteBooking (int bookingId);
}
