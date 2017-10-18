package office;

public class NoteBook extends  OfficeStaff{
    private int paperQuantity = 48;

    public NoteBook(double cost, String producer, int paperQuantity) {
        this.cost = cost;
        this.producer = producer;
        this.name = "NoteBook";
        this.paperQuantity = paperQuantity;
    }

    public NoteBook(int paperQuantity) {
        this.name = "NoteBook";
        this.paperQuantity = paperQuantity;
    }

    public NoteBook() {
        this.name = "NoteBook";
    }

    public int getPaperQuantity() {
        return paperQuantity;
    }

    @Override
    public String toString() {
        return "\nNoteBook (" +
                "cost=" + cost +
                ", paperQuantity=" + paperQuantity  +
                ", producer='" + producer + ")";
    }
}
