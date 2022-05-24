package com.sofkau.dddchallenge.driver.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.dddchallenge.driver.values.Capacity;
import com.sofkau.dddchallenge.driver.values.Mileage;
import com.sofkau.dddchallenge.driver.values.Model;
import com.sofkau.dddchallenge.driver.values.TruckID;

public class Truck extends Entity<TruckID> {

    private Model model;

    private Mileage mileage;

    private Capacity capacity;

    public Truck(TruckID entityId) {
        super(entityId);
    }
}
