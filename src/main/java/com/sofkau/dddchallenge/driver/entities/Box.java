package com.sofkau.dddchallenge.driver.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.dddchallenge.driver.values.BoxID;

public class Box extends Entity<BoxID> {

    public Box(BoxID entityId) {
        super(entityId);
    }
}
