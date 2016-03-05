/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;


import edu.csueb.cs3520.bean.Car;
import java.util.ArrayList;

/**
 *
 * @author thiagoloschi
 */
public class CarUtils {
    private final String PATH = "include/img/";
    private ArrayList<Car> cars = new ArrayList();
    //public Car(int id, String name, String description, Double cost, String pict, boolean available) 

    public CarUtils() {
        addCar(new Car(1,"Honda ","Odyssey","The Odyssey has room for up to eight passengers to sit comfortably, and is also fuel-efficient."
                + " 248-hp 3.5-liter V-6 19/28 mpg,",65.00,PATH+"odyssey.jpg",true));
        addCar(new Car(2,"Kia","Sedona","With room for eight and a long list of safety features, "
                + "the Sedona is powered by a 276-hp, 3.3-liter V-6 17/22 mpg",75.00,PATH+"sedona.jpg",true));
        addCar(new Car(3,"Dodge","Gran Caravan","The Grand Caravan gets credit for starting the whole "
            + "minivan craze, the sole powertrain is a 283-hp 3.6-liter V-6 with front-wheel drive and "
            + "a six-speed automatic. 17/25 mpg",50.00,PATH+"caravan.jpg",true));
        addCar(new Car(4,"Kia","Sorento","The Sorento , with utility and rugged good looks, comes with "
        + "a 290-hp V-6 engine. There is also a third-row seating. 17/23 mpg", 120.00,PATH+"sorento2.jpg",true));
        addCar(new Car(5,"Jeep","Gran Cherokee","",130.00,PATH+"cherokee.jpg",true));
        addCar(new Car(6,"Land Rover","Range Rover","The Supercharged model’s V-8 is fortified to 510 hp, fed to an"
                + " eight-speed automatic transmission and a four-wheel-drive system that features more adjustments "
                + "than a chiropractor. 13/19 mpg",280.00,PATH+"rangerover.jpg",true));
        addCar(new Car(7,"Ford","Mustang","The Camaro coupe and convertible follow the typical muscle-car recipe, "
                + "beautiful and powerful: 335-hp 3.6-liter V-6! ",60.00,PATH+"mustang.jpg",true));
        addCar(new Car(8,"Chevrolet","Camaro","The iconic Mustang, preserves a legacy that defines American "
                + "motoring:  300-hp 3.7-liter V-6. 15/25 mpg",80.00,PATH+"camaro2.jpg",true));
        addCar(new Car(9,"Chevrolet","Corvette","",250.00,PATH+"corvette.jpg",true));
    }
     
    public boolean addCar(Car car){
        cars.add(car);
        return true;
    }
    
    public Car getCar(int id){
        for (Car car : cars) {
            if(car.getId()==id)
                return car;
        }
        return null;
    }
    
}
