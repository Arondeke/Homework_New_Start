package lessonClassesAndObjects;

public class book {
    private String name;
    private author authorOfBook;
    private int year;

    public book(String name, author authorOfBook, int year) {
        this.name = name;
        this.authorOfBook = authorOfBook;
    }

    public String getName() {
        return this.name;
    }

    public author getAuthorOfBook() {
        return this.authorOfBook;
    }

    public void setYear(int year) {
        this.year = year;
    }
}