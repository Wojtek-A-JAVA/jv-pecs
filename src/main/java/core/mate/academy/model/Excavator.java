package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorLength;
    private int excavatorHeight;
    private String excavatorType;

    public Excavator() {
        super(null, null);
    }

    public Excavator(String name, String color, int excavatorLength,
                     int excavatorHeight, String excavatorType) {
        super(name, color);
        this.excavatorLength = excavatorLength;
        this.excavatorHeight = excavatorHeight;
        this.excavatorType = excavatorType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
