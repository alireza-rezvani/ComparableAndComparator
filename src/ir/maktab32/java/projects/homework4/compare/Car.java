package ir.maktab32.java.projects.homework4.compare;

class Car implements Comparable<Car>{
    private String title;
    private String color;
    private int model;

    public Car(String title, String color, int model) { 
        this.title = title;
        this.color = color;
        this.model = model;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public int getModel() {
        return model;
    }

    @Override
    public String toString() {
        return title + "\t" + color + "\t" + model;
    }

    public int compareTo(Car car) {
        return this.model - car.model;
    }
}
