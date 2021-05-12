package com.wanderoliveira.components;

import com.wanderoliveira.cars.Car;
import lombok.*;
import lombok.extern.java.Log;

@Setter
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Log
public class TripComputer {
    private Car car;
    private Car trip;

    public void showFuelLevel() {
        log.info("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            log.info("Car is started");
        } else {
            log.info("Car isn't started");
        }
    }
}
