package office;

public class NoteBook extends  OfficeStaff{
    private int paperQuantity = 48;

    public NoteBook(double cost, String producer, int paperQuantity) {
        super(cost, producer);
        this.paperQuantity = paperQuantity;
    }

    public NoteBook(int paperQuantity) {
        this.paperQuantity = paperQuantity;
    }

    public NoteBook() {
    }

    public int getPaperQuantity() {
        return paperQuantity;
    }

    @Override
    public String toString() {
        return "\nNoteBook ("+
                "paperQuantity=" + paperQuantity +
                ", cost=" + cost +
                ", producer='" + producer + ")";
    }
}
