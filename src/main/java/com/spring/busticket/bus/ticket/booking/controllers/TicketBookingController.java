package com.spring.busticket.bus.ticket.booking.controllers;

import com.spring.busticket.bus.ticket.booking.services.TicketBookingService;
import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping("/bookTicket")
    public String addTicket( @RequestBody List<TicketBooking> ticket){
        return ticketBookingService.addTicket(ticket);
    }

    @GetMapping("/getTicket")
    public List<TicketBooking> getTicket(){
        return ticketBookingService.getTicket();
    }
    @DeleteMapping("deleteTicket/{bookingId}")
    public String deleteTicket(@PathVariable int bookingId){
        return ticketBookingService.deleteTicket(bookingId);
    }
}
