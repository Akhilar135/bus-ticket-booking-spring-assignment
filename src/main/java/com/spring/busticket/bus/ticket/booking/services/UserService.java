package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.sqlschema.TicketBooking;
import com.spring.busticket.bus.ticket.booking.sqlschema.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    String addUser(List<User> userList);

    Optional<User> getUserList(int userId);

    String deleteUser (int userId);
}
