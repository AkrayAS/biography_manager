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
        new Book(nameID, author, publisher, title, year);
        this.address = address;
    }

    public Book(String nameID, String address, String author, String edition, String publisher, String title, int year) {
        new Book(nameID, address, address, publisher, title, year);
        this.edition = edition;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String publisher, String title, int year) {
        new Book(nameID, address, author, edition, publisher, title, year);
        this.editor = editor;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, String publisher, String title, int year) {
        new Book(nameID, address, author, edition, editor, publisher, title, year);
        this.month = month;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, String title, int year) {
        new Book(nameID, address, author, edition, editor, month, publisher, title, year);
        this.number = number;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, int series, String title, int year) {
        new Book(nameID, address, author, edition, editor, month, number, publisher, title, year);
        this.series = series;
    }

    public Book(String nameID, String address, String author, String edition, String editor, String month, int number, String publisher, int series, String title, int volume, int year) {
        new Book(nameID, address, author, edition, editor, month, number, publisher, series, title, year);
        this.volume = volume;
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
