package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.dao.TicketBookingDao;
import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketBookingServiceImpl implements TicketBookingService{
    @Autowired
    private TicketBookingDao ticketBookingDao;
    @Override
    public String seatBooking(List<TicketBooking> bookingList) {
        ticketBookingDao.saveAll(bookingList);
        return "successfully booked";
    }

    @Override
    public List<TicketBooking> getBookingList() {
        return (List<TicketBooking>) ticketBookingDao.findAll();
    }

    @Override
    public String deleteBooking(int bookingId) {
        ticketBookingDao.deleteById(bookingId);
        return "booking cancelled";
    }
}
