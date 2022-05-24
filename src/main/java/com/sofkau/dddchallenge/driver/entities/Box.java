package com.sofkau.dddchallenge.driver.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.dddchallenge.driver.values.Address;
import com.sofkau.dddchallenge.driver.values.BoxID;
import com.sofkau.dddchallenge.driver.values.Recipient;
import com.sofkau.dddchallenge.driver.values.Sender;

public class Box extends Entity<BoxID> {

    private Address address;

    private Sender sender;

    private Recipient recipient;

    public Box(BoxID entityId) {
        super(entityId);
    }
}
