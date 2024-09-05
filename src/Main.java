public class Main {
    public static void main(String[] args) {

        Author a1 = new Author("Лев", "Толстой");
        Author a2 = new Author("Антон", "Чехов");

        System.out.println("a1.getName() = " + a1.getName());
        System.out.println("a2.getName() = " + a2.getName());
        System.out.println("a1.getSurname() = " + a1.getSurname());
        System.out.println("a2.getSurname() = " + a2.getSurname());

        Book b1 = new Book("Анна Каренина", a1, 1877);
        Book b2 = new Book("Свадьба", a2, 1889);

        System.out.println("b1.getTitle() = " + b1.getTitle());
        System.out.println("b1.getAuthor() = " + b1.getAuthor());

        System.out.println("b1.getPublishingYear() = " + b1.getPublishingYear());
        b1.setPublishingYear(1800);
        System.out.println("b1.getPublishingYear() = " + b1.getPublishingYear());
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
    }
}