package com.spring.busticket.bus.ticket.booking.sqlschema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bus {

    @Id
    @GeneratedValue
    private int busId;
    private String busName;

}
