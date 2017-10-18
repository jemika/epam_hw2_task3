import office.OfficeStaff;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SortJuniorByCost implements Comparator<OfficeStaff> {

    @Override
    public int compare(OfficeStaff o1, OfficeStaff o2) {
        return (int) (o2.getCost() - o1.getCost());
    }
}

class SortJuniorByNameLength implements Comparator<OfficeStaff> {

    @Override
    public int compare(OfficeStaff o1, OfficeStaff o2) {
        return  (o2.getName().length() - o1.getName().length());
    }
}

public class Junior {
    SortJuniorByCost sortJuniorByCost = new SortJuniorByCost();
    SortJuniorByNameLength sortJuniorByNameLength = new SortJuniorByNameLength();
    private ArrayList<OfficeStaff> equipment;

    public Junior() {
        equipment = new ArrayList<>();
    }

    public void addThing(OfficeStaff officeStaff){
        this.equipment.add(officeStaff);
    }

    public void removeThing(OfficeStaff officeStaff){
        this.equipment.remove(officeStaff);
    }
    @Override
    public String toString() {
        return ("Junior has " + equipment);
    }

    public double totalCost(){
        double result = 0;
        for (OfficeStaff officeStaff : equipment){
            result += officeStaff.getCost();
        }
        return result;
    }
    public void sortByCost(){
        Collections.sort(equipment, sortJuniorByCost);
    }
    public void sortByNameLength(){
        Collections.sort(equipment, sortJuniorByNameLength);
    }
}


