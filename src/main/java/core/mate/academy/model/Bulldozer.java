package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeLength;
    private int ripperLength;
    private String bulldozerType;

    public Bulldozer() {
        super(null, null);
    }

    public Bulldozer(String name, String color, int bladeLength,
                     int ripperLength, String bulldozerType) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.ripperLength = ripperLength;
        this.bulldozerType = bulldozerType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
