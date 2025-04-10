public class Book implements Resource {
    public String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBookType() {
        return "Book";
    }
}
