package office;

import java.util.Comparator;

public class OfficeStaff  {
    protected double cost = 1.0;
    protected String producer = "NoName company";
    protected String name = "General";

    public String getName() {
        return name;
    }

    public OfficeStaff() {
    }

    public OfficeStaff(double cost, String producer) {
        this.cost = cost;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

//    @Override
//    public int compareTo(OfficeStaff o) {
//        return (int) (o.getCost() - this.getCost());
//    }
}
