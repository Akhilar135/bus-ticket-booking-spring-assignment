package com.spring.busticket.bus.ticket.booking.dao;

import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao  extends CrudRepository<TicketBooking, Integer> {
}
