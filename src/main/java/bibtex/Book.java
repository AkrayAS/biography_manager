package bibtex;

public class Book {
    private String nameID;
    private String address;
    private String author;
    private String edition;
    private String editor;
    private String month;
    private int number;
    private String publisher;
    private int series;
    private String title;
    private int volume;
    private int year;

    public Book(String nameID, String author, String publisher, String title, int year) {
        this.nameID = nameID;
        this.author = author;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String publisher, String title, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String edition, String publisher, String title, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String publisher, String title, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.edition = edition;
        this.editor = editor;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, String publisher, String title, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.edition = edition;
        this.editor = editor;
        this.month = month;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, String title, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.edition = edition;
        this.editor = editor;
        this.month = month;
        this.number = number;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, int series, String title, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.edition = edition;
        this.editor = editor;
        this.month = month;
        this.number = number;
        this.publisher = publisher;
        this.series = series;
        this.title = title;
        this.year = year;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, int series, String title, int volume, int year) {
        this.nameID = nameID;
        this.address = address;
        this.author = author;
        this.edition = edition;
        this.editor = editor;
        this.month = month;
        this.number = number;
        this.publisher = publisher;
        this.series = series;
        this.title = title;
        this.volume = volume;
        this.year = year;
    }

    public String getNameID() {
        return this.nameID;
    }

    @Override
    public String toString() {
        return "@book{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  address={" + this.address + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  number={" + this.number + "}," + "\n" +
                "  edition={" + this.edition + "}," + "\n" +
                "  title={" + this.title + "}," + "\n" +
                "  volume={" + this.volume + "}," + "\n" +
                "  editor={" + this.editor + "}," + "\n" +
                "  series={" + this.series + "}," + "\n" +
                "  publisher={" + this.publisher + "}," + "\n" +
                "  year={" + this.year + "}" + "\n" +
                "}";
    }
}
