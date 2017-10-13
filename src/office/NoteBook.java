package office;

public class NoteBook extends  OfficeStaff{
    private int paperQuantity;

    public NoteBook(double cost, String producer, int paperQuantity) {
        super(cost, producer);
        this.paperQuantity = paperQuantity;
    }

    public NoteBook(int paperQuantity) {
        this.paperQuantity = paperQuantity;
    }

    public NoteBook() {
    }

}
