import office.NoteBook;
import office.Pen;

public class Inspector {
    public static void main(String[] args) {
        Junior junior = new Junior();

        Pen pen1 = new Pen();
        Pen pen2 = new Pen("ball", "green", true);
        Pen pen3 = new Pen(13.3, "pilot", "gele", "red", true);

        NoteBook noteBook1 = new NoteBook();
        NoteBook noteBook2 = new NoteBook(12);
        NoteBook noteBook3 = new NoteBook(50.0, "Russia", 96);

        junior.addThing(pen3);
        junior.addThing(noteBook3);
        junior.addThing(pen2);
        System.out.println(junior.toString());
        junior.removeThing(pen2);
        System.out.println("-----after remove some pen-----");
        System.out.println(junior.toString());

    }
}
