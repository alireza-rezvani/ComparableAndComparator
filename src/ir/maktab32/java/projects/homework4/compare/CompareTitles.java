package ir.maktab32.java.projects.homework4.compare;

import java.util.Comparator;

class CompareTitles implements Comparator<Car> {
    @Override
    public int compare(Car car, Car t1) {
        return car.getTitle().compareTo(t1.getTitle());
    }
}
