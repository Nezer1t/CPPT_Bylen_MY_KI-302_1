package KI302.Bylen.Lab6;

/**
 * Головний клас-драйвер для демонстрації роботи з однов’язним списком.
 * Створює списки студентів та книг, показує додавання, видалення, пошук мінімального елемента та вивід.
 */
public class KI_304BylenLab6 {
    public static void main(String[] args) {
        // Студенти
        SingleLinkedList<Student> students = new SingleLinkedList<>();
        students.add(new Student("Andriy", 85));
        students.add(new Student("Oleh", 73));
        students.add(new Student("Katya", 91));

        System.out.println("Student list:");
        students.display();
        System.out.println("Lowest grade: " + students.findMin());

        // Видалення студента
        System.out.println("\nRemoving student 'Oleh (grade: 73)'...");
        students.remove(new Student("Oleh", 73));
        System.out.println("Updated student list:");
        students.display();
        System.out.println("New lowest grade: " + students.findMin());

        System.out.println("\n======================\n");

        // Книги
        SingleLinkedList<Book> books = new SingleLinkedList<>();
        books.add(new Book("Java Basics", 45.5));
        books.add(new Book("C# Advanced", 38.0));
        books.add(new Book("Python Guide", 52.3));

        System.out.println("Book list:");
        books.display();
        System.out.println("Cheapest book: " + books.findMin());

        // Видалення книги
        System.out.println("\nRemoving book 'C# Advanced ($38.0)'...");
        books.remove(new Book("C# Advanced", 38.0));
        System.out.println("Updated book list:");
        books.display();
        System.out.println("New cheapest book: " + books.findMin());
    }
}

