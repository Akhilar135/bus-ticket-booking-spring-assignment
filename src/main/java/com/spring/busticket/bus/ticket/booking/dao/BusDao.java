package com.spring.busticket.bus.ticket.booking.dao;

import com.spring.busticket.bus.ticket.booking.sqlschema.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusDao extends CrudRepository<Bus, Integer> {

}
