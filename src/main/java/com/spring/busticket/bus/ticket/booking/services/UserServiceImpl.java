package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.dao.UserDao;
import com.spring.busticket.bus.ticket.booking.sqlschema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public String addUser(List<User> userList) {
        userDao.saveAll(userList);
        return "user successfully registered";
    }
    @Override
    public Optional<User> getUserList(int userId) {
        return userDao.findById(userId);
    }

    @Override
    public String deleteUser(int userId) {
        userDao.deleteById(userId);
        return "user deleted";
    }
}
