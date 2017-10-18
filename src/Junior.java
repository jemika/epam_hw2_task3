import java.util.ArrayList;
import java.util.List;

public class Junior {
    private ArrayList<Object> equipment;

    public Junior() {
        equipment = new ArrayList<>();
    }

    public void addThing(Object object){
        this.equipment.add(object);
    }

    public void removeThing(Object object){
        this.equipment.remove(object);
    }
    @Override
    public String toString() {
        return ("Junior has " + equipment);
    }
}
