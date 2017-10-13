package office;

public class OfficeInspector {
    OfficeStaff officeStaff = new OfficeStaff();
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen("ball", "green", true);
        Pen pen3 = new Pen(13.3, "pilot", "gele", "red", true);

        System.out.println(pen1.toString());
        System.out.println(pen2.toString());
        System.out.println(pen3.toString());
    }

    @Override
    public String toString() {
        return "OfficeInspector{" +
                "officeStaff=" + officeStaff +
                '}';
    }
}
