package office;

public class Pen extends OfficeStaff {
    private String type = "ball";
    private String color = "blue";
    private boolean automatic = false;


    public Pen() {
        this.name = "Pen";
    }

    public Pen(String type, String color, boolean automatic) {
        this.name = "Pen";
        this.type = type;
        this.color = color;
        this.automatic = automatic;

    }

    public Pen(double cost, String producer, String type, String color, boolean automatic) {
        this.cost = cost;
        this.producer = producer;
        this.name = "Pen";
        this.type = type;
        this.color = color;
        this.automatic = automatic;
    }



    public Pen(double cost, String producer) {
        super(cost, producer);
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    @Override
    public String toString() {
        return "\nPen (" +
                "cost=" + cost +
                ", producer='" + producer +
                ", type='" + type +
                ", color='" + color +
                ", automatic=" + automatic + ")";
    }


}
