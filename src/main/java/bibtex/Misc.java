package bibtex;

public class Misc {
    private String nameID;
    private String author;
    private String month;
    private String title;
    private int year;

    public Misc(String nameID, String title) {
        this.nameID = nameID;
        this.title = title;
    }

    public Misc(String nameID, String author, String title) {
        this.nameID = nameID;
        this.author = author;
        this.title = title;
    }

    public Misc(String nameID, String author, String month, String title) {
        this.nameID = nameID;
        this.author = author;
        this.month = month;
        this.title = title;
    }

    public Misc(String nameID, String author, String month, String title, int year) {
        this.nameID = nameID;
        this.author = author;
        this.month = month;
        this.title = title;
        this.year = year;
    }

    public String getNameID() {
        return this.nameID;
    }

    @Override
    public String toString() {
        return "@misc{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  title={" + this.title + "}," + "\n" +
                "  year={" + this.year + "}" + "\n" +
                "}";
    }
}
