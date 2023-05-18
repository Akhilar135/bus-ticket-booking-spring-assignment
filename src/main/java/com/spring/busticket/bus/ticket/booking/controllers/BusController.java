package com.spring.busticket.bus.ticket.booking.controllers;

import com.spring.busticket.bus.ticket.booking.services.BusService;
import com.spring.busticket.bus.ticket.booking.sqlschema.Bus;
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
    @GetMapping("/getBus")
    public List<Bus> getBus(){
        return busService.getBus();
    }

    @DeleteMapping("/removeBus/{busId}")
    public String deleteBus(@PathVariable int busId){
        return busService.deleteBus(busId);
    }

//    @PutMapping("/updatePhone")
//    public String (Bus bus){
//        return busService.updatePhoneNo(bus);
//    }



}
