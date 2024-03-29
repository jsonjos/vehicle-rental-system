package com.project.vehicle_rental_system.payment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Payment_ID")
    private Integer paymentId;

    @Column(name = "Payment_flag")
    private Boolean paymentStatus;


}
