package lessonClassesAndObjects;

public class main {
    public static void main(String[] args) {
        author authorOfBook = new author("Хмельницкий", "Алексей");
        book myBook = new book("How i learn JAVA", authorOfBook, 2000);
    }
}