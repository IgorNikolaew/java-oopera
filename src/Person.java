public class Person {
    final String name; //не буду пока что final ставить, чтобы была возможность редактирования ошибок, уже введенных режиссеров
    final String surname;
    final String gender;
    int height;


    public Person(String name, String surname, String gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }
}
