import java.util.HashMap;
import java.util.Map;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Resource book = new Book("Ny First in Java");
        Resource magazine = new Magazine("Java for Beginners");

        Map<String, ResourceBorrow> resourceTypes = new HashMap<>();
        resourceTypes.put("Book", new BookBorrow());
        resourceTypes.put("Magazine", new MagazineBorrow());

        Library library = new Library(resourceTypes);

        Student student = new Student("Luis Joshua D. Bulatao");

        library.borrowResource(student, book);
        library.borrowResource(student, magazine);
    }
}