package ir.maktab32.java.projects.homework4.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Benz", "Blue", 2014));
        cars.add(new Car("Toyota", "Black",2010));
        cars.add(new Car("Hyundai", "Silver", 2018));

        Collections.sort(cars);
        System.out.println("Sorted by Model:");
        for (Car car : cars)
            System.out.println(car);

        System.out.println();

        CompareTitles compareTitles = new CompareTitles();

        Collections.sort(cars, compareTitles);
        System.out.println("Sorted by Title:");
        for (Car car : cars)
            System.out.println(car);
    }
}
