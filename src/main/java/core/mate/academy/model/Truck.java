package core.mate.academy.model;

public class Truck extends Machine {
    private int year;
    private int truckLength;
    private int horsePower;

    public Truck() {
        super(null, null);
    }

    public Truck(String name, String color, int year, int truckLength, int horsePower) {
        super(name, color);
        this.year = year;
        this.truckLength = truckLength;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
