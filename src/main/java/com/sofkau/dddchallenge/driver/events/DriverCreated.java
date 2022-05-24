package com.sofkau.dddchallenge.driver.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddchallenge.driver.values.Name;

public class DriverCreated extends DomainEvent {


    private final Name name;

    public DriverCreated(Name name) {
        super("sofkau.driver.drivercreated");
        this.name = name;
    }
}
