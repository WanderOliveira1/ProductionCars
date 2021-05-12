package com.wanderoliveira.components;

import lombok.*;
import lombok.extern.java.Log;

@Setter
@Builder
@Getter
@AllArgsConstructor
@Log
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            log.info("Cannot go(), you must start engine first!");
        }
    }
}
