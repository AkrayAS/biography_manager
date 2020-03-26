package bibtex;

public class Article {
    private String nameID;
    private String author;
    private String journal;
    private String month;
    private int number;
    private int pages;
    private String title;
    private int volume;
    private int year;

    public Article(String nameID, String author, String journal) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
    }

    public Article(String nameID, String author, String journal, String month) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
        this.month = month;
    }

    public Article(String nameID, String author, String journal, String month, int number) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
        this.month = month;
        this.number = number;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
        this.month = month;
        this.number = number;
        this.pages = pages;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages, String title) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
        this.month = month;
        this.number = number;
        this.pages = pages;
        this.title = title;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages, String title, int volume) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
        this.month = month;
        this.number = number;
        this.pages = pages;
        this.title = title;
        this.volume = volume;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages, String title, int volume, int year) {
        this.nameID = nameID;
        this.author = author;
        this.journal = journal;
        this.month = month;
        this.number = number;
        this.pages = pages;
        this.title = title;
        this.volume = volume;
        this.year = year;
    }

    public String getNameID() {
        return this.nameID;
    }

    @Override
    public String toString() {
        return "@article{" + this.nameID +"," + "\n" +
                "  author={" + this.author + "}," + "\n" +
                "  journal={" + this.journal + "}," + "\n" +
                "  month={" + this.month + "}," + "\n" +
                "  number={" + this.number + "}," + number + "\n" +
                "  pages={" + this.pages + "}," + pages + "\n" +
                "  title={" + this.title + "}," + title + "\n" +
                "  volume={" + this.volume + "}," + volume + "\n" +
                "  year={" + this.year + "}" + year + "\n" +
                "}";
    }

}
