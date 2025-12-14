package KI302.Bylen.Lab6;

/**
 * Клас Book представляє книгу з назвою та ціною.
 * Реалізує інтерфейс Comparable для порівняння книг за ціною.
 */
public class Book implements Comparable<Book> {
    private String title;  // назва книги
    private double price;  // ціна книги

    /**
     * Конструктор для створення книги.
     * @param title назва книги
     * @param price ціна книги
     */
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * Порівнює книги за ціною.
     * @param other інша книга для порівняння
     * @return від'ємне число, якщо this < other; 0, якщо рівні; додатне, якщо this > other
     */
    @Override
    public int compareTo(Book other) {
        return Double.compare(this.price, other.price);
    }

    /**
     * Повертає рядкове представлення книги.
     * @return рядок у форматі "назва ($ціна)"
     */
    @Override
    public String toString() {
        return title + " ($" + price + ")";
    }

    /**
     * Перевіряє рівність двох книг за назвою та ціною.
     * @param obj об'єкт для порівняння
     * @return true, якщо книги однакові, інакше false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return Double.compare(price, other.price) == 0 && title.equals(other.title);
    }

    /**
     * Повертає хеш-код книги для використання в колекціях.
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return title.hashCode() * 31 + Double.hashCode(price);
    }
}
