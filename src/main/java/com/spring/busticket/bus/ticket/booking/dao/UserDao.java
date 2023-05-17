package com.spring.busticket.bus.ticket.booking.dao;

import com.spring.busticket.bus.ticket.booking.sqlschema.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}
