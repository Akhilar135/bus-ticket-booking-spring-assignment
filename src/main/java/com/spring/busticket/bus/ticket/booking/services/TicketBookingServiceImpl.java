package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.dao.TicketBookingDao;
import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TicketBookingServiceImpl implements TicketBookingService{
    @Autowired
    private TicketBookingDao ticketBookingDao;
    @Override
    public String addTicket(List<TicketBooking> ticket) {
        ticketBookingDao.saveAll(ticket);
        return "successfully booked ticket";
    }

    @Override
    public List<TicketBooking> getTicket() {
        return (List<TicketBooking>) ticketBookingDao.findAll();
    }

    @Override
    public String deleteTicket(int bookingId) {
        ticketBookingDao.deleteById(bookingId);
        return "booking cancelled";
    }
}
