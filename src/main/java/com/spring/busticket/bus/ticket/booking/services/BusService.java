package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.sqlschema.Bus;


import java.util.List;
import java.util.Optional;

public interface BusService {
    String addBus(List<Bus> busList);


    List<Bus> getBus();

    String deleteBus(int busId);

//    String updatePhoneNo(Bus busNum);

}
