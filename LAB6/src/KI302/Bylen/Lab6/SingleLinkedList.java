package KI302.Bylen.Lab6;

/**
 * Параметризований клас, що реалізує однов’язний список.
 * Підтримує додавання, видалення, пошук мінімального елемента та вивід списку.
 * @param <T> тип елементів списку, який реалізує інтерфейс Comparable
 */
public class SingleLinkedList<T extends Comparable<T>> {
    private class Node {
        T data;       // дані вузла
        Node next;    // посилання на наступний вузол
        Node(T data) { this.data = data; }
    }

    private Node head; // голова списку

    /**
     * Додає елемент у кінець списку.
     * @param value елемент для додавання
     */
    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) head = newNode;
        else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    /**
     * Видаляє перше входження елемента зі списку.
     * @param value елемент для видалення
     */
    public void remove(T value) {
        if (head == null) return;
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     * Знаходить мінімальний елемент у списку.
     * @return елемент з найменшим значенням
     * @throws IllegalStateException якщо список порожній
     */
    public T findMin() {
        if (head == null) throw new IllegalStateException("Список порожній");

        T min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data.compareTo(min) < 0) min = current.data;
            current = current.next;
        }
        return min;
    }

    /**
     * Виводить всі елементи списку у консоль.
     */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
