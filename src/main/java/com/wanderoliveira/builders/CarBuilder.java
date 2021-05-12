package com.wanderoliveira.builders;

import com.wanderoliveira.cars.Car;
import com.wanderoliveira.cars.CarType;
import com.wanderoliveira.components.Engine;
import com.wanderoliveira.components.GPSNavigator;
import com.wanderoliveira.components.Transmission;
import com.wanderoliveira.components.TripComputer;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    @Override
    public void setCarType(CarType type) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {

    }
}
