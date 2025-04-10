public class Magazine implements Resource {
    public String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBookType() {
        return "Magazine";
    }
}
