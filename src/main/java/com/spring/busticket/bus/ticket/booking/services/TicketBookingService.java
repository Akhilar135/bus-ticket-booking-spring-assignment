package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;

import java.util.List;

public interface TicketBookingService {
    String addTicket(List<TicketBooking> ticket);

    List <TicketBooking> getTicket();

    String deleteTicket (int bookingId);
}
