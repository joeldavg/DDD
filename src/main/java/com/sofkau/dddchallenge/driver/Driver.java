package com.sofkau.dddchallenge.driver;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.dddchallenge.driver.entities.Box;
import com.sofkau.dddchallenge.driver.entities.Truck;
import com.sofkau.dddchallenge.driver.events.DriverCreated;
import com.sofkau.dddchallenge.driver.values.DriverID;
import com.sofkau.dddchallenge.driver.values.Name;
import com.sofkau.dddchallenge.driver.values.PhoneNumber;
import com.sofkau.dddchallenge.driver.values.YearOfExperience;

import java.util.Set;

public class Driver extends AggregateEvent<DriverID> {

    protected Set<Box> boxes;

    protected Truck truck;

    protected Name name;

    protected PhoneNumber phoneNumber;

    protected YearOfExperience yearOfExperience;

    public Driver(DriverID entityId, Name name) {
        super(entityId);
        appendChange(new DriverCreated(name)).apply();
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Name getName() {
        return name;
    }

    public Truck getTruck() {
        return truck;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
