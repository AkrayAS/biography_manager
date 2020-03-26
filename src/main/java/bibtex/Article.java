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
        new Article(nameID, author, journal);
        this.month = month;
    }

    public Article(String nameID, String author, String journal, String month, int number) {
        new Article(nameID, author, journal, month);
        this.number = number;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages) {
        new Article(nameID, author, journal, month, number);
        this.pages = pages;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages, String title) {
        new Article(nameID, author, journal, month, number, pages);
        this.title = title;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages, String title, int volume) {
        new Article(nameID, author, journal, month, number, pages, title);
        this.volume = volume;
    }

    public Article(String nameID, String author, String journal, String month, int number, int pages, String title, int volume, int year) {
        new Article(nameID, author, journal, month, number, pages, title, volume);
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
