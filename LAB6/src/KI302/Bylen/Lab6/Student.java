package KI302.Bylen.Lab6;

/**
 * Клас Student представляє студента з ім'ям та оцінкою.
 * Реалізує інтерфейс Comparable для порівняння студентів за оцінкою.
 */
public class Student implements Comparable<Student> {
    private String name; // ім'я студента
    private int grade;   // оцінка студента

    /**
     * Конструктор для створення нового студента.
     * @param name ім'я студента
     * @param grade оцінка студента
     */
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    /**
     * Порівнює студентів за оцінкою.
     * @param other інший студент для порівняння
     * @return від'ємне число, якщо this < other; 0, якщо рівні; додатне, якщо this > other
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.grade, other.grade);
    }

    /**
     * Повертає рядкове представлення студента.
     * @return рядок у форматі "ім'я (grade: оцінка)"
     */
    @Override
    public String toString() {
        return name + " (grade: " + grade + ")";
    }

    /**
     * Перевіряє рівність двох студентів за ім'ям та оцінкою.
     * @param obj об'єкт для порівняння
     * @return true, якщо студенти однакові, інакше false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return grade == other.grade && name.equals(other.name);
    }

    /**
     * Повертає хеш-код студента для використання в колекціях.
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + grade;
    }
}
