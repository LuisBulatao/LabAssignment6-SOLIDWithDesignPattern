public class MagazineBorrow implements ResourceBorrow{

    @Override
    public void bookBorrow(Student student, Resource resource) {
        System.out.println(student.getName() + " is borrowing the Magazine: " + resource.getTitle());
    }
}
