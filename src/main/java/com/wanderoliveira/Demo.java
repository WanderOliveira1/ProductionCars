package com.wanderoliveira;

import com.wanderoliveira.builders.CarBuilder;
import com.wanderoliveira.builders.CarManualBuilder;
import com.wanderoliveira.builders.Director;
import lombok.ToString;
import lombok.extern.java.Log;


@Log
@ToString
public class Demo {

    public static void main(String[] args) {
        var director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
       var builder = new CarBuilder();
        director.constructSUV(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        var car = builder.getResult();
        log.info("Car built:\n" + car.getCarType());


        var manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        var carSemi = manualBuilder.getResult();
        log.info("\nCar semi-Automatic built:\n" + carSemi.print());

        // Director may know several building recipes.
        director.constructCityCar(manualBuilder);
        var carAutomatic = manualBuilder.getResult();
        log.info("\nCar automatic built:\n" + carAutomatic.print());

        // Director may know several building recipes.
        director.constructSUV(manualBuilder);
        var carManual = manualBuilder.getResult();
        log.info("\nCar manual built:\n" + carManual.print());
    }
}
