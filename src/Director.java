public class Director extends Person{ //КЛАСС РЕЖИССЕР НА ОСНОВЕ КЛАССА Person

    int numberOfShows;

    public Director(String name, String surname, String gender, int height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
    }
    }
