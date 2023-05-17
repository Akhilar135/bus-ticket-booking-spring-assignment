package com.spring.busticket.bus.ticket.booking.controllers;

import com.spring.busticket.bus.ticket.booking.services.BusService;
import com.spring.busticket.bus.ticket.booking.sqlschema.Bus;
import com.spring.busticket.bus.ticket.booking.sqlschema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BusController {
@Autowired
    private BusService busService;

@PostMapping("/addBus")
public String addBus(@RequestBody List<Bus> bus)
{
    return busService.addBus(bus);
}
    @GetMapping("/getBusList/{busId}")
    public Optional<Bus> getBusList(@PathVariable int busId){
        Optional<Bus> bus = busService.getBusList(busId);
        if (user == null){
            throw new RuntimeException("User not found"+ userId);
        }
        else {
            return user;
        }


}
