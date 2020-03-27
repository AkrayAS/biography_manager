package bibtex;

public class Masterthesis {
    private String nameID;
    private String author;
    private String month;
    private String title;
    private int year;
    private String address;

    public Masterthesis(String nameID, String author, String title, int year) {
        this.nameID = nameID;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public Masterthesis(String nameID, String author, String month, String title, int year) {
        new Masterthesis(nameID, author, title, year);
        this.month = month;
    }

    public Masterthesis(String nameID, String author, String month, String title, int year, String address) {
        new Masterthesis(nameID, author, month, title, year);
        this.address = address;
    }

    public String getNameID() {
        return this.nameID;
    }

    @Override
    public String toString() {
        return "@masterthesis{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  title={" + this.title + "}," + "\n" +
                "  year={" + this.year + "}" + "\n" +
                "  address={" + this.address + "}" + "\n" +
                "}";
    }
}
