package com.project.vehicle_rental_system.vehicle;

import com.project.vehicle_rental_system.booking.Booking;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Vehicle {
    @Id
    @Column(name = "Vehicle_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vehicleId;

    @Column(name = "Model_Name")
    private String modelName;

    @Column(name = "Model_Year")
    private Integer modelYear;

    @Column(name = "Availability")
    private Boolean isAvailable;

    @Column(name = "Vehicle_Rent")
    private Double rent;

    @Column(name = "Vehicle_Location")
    private String vehicleLocation;

    @OneToMany
    private List<Booking> vehicleBookingList;

}
