package com.spring.busticket.bus.ticket.booking.services;

import com.spring.busticket.bus.ticket.booking.dao.BusDao;
import com.spring.busticket.bus.ticket.booking.sqlschema.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BusServiceImpl implements BusService {
    @Autowired
    private BusDao busDao;
    @Override
    public String addBus(List<Bus> busList) {
        busDao.saveAll(busList);
        return "Successfully added the bus";
    }

    public List<Bus> busList() {
        return null;
    }

    @Override
    public List<Bus> getBus() {
      return (List<Bus>)busDao.findAll();
    }

//    @Override
//    public List<Bus> getbusList() {
//        return (List<Bus>)busDao.findAll();
//    }


    @Override
    public String deleteBus(int busId) {
        busDao.deleteById(busId);
        return "Bus deleted";
    }

//    @Override
//    public String updatePhoneNo(Bus busNum) {
//        busDao.save(busNum);
//            return "Phone number updated";
//    }

}
