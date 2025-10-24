import java.util.Objects;

public class Actor extends Person {

    public Actor(String name, String surname, String gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        // Проверяем, является ли объект тем же самым (по ссылке)
        if (this == o) return true;
        // Проверяем, является ли объект null или другого класса
        if (o == null || getClass() != o.getClass()) return false;

        // Вызываем equals родительского класса Person
        // Предполагая, что в Person уже реализована корректная логика сравнения
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // Используем те же поля, что и в equals
        return Objects.hash(name, surname, gender, height);
    }
}