package com.spring.busticket.bus.ticket.booking.sqlschema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="ticket_booking")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketBooking {
    @Id
    @GeneratedValue
    private int bookingId;
    private int seatNo;
    private int bookingPrice;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;




}
