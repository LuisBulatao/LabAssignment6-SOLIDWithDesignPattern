import java.util.*;
public class Library {
    private final Map<String, ResourceBorrow> resourceTypes = new HashMap<>();

    public Library(Map<String, ResourceBorrow> resourceTypes) {
        this.resourceTypes.putAll(resourceTypes);
    }

    public void borrowResource(Student student, Resource resource) {
        String resourceType = resource.getBookType();

        if (!resourceTypes.containsKey(resourceType)) {
            throw new IllegalArgumentException("Invalid book type: " + resourceType);
        }

        ResourceBorrow resourceBorrow = resourceTypes.get(resourceType);
        resourceBorrow.bookBorrow(student, resource);
    }
}
