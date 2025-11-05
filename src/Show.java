import java.util.ArrayList;

public class Show {
    protected String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля '" + title + "': " + director.toString());
    }

    public void printActorsOfShow() {
        System.out.println("Актеры, участвующие в спектакле '" + title + "':");
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            System.out.println((i + 1) + ". " + actor.toString());
        }
    }

    public boolean addActorToShow(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актер " + actor.name + " " + actor.surname + " уже есть в спектакле!");
            return false;
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor.name + " " + actor.surname + " успешно добавлен в спектакль");
            return true;
        }
    }

    public boolean replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер " + surnameToReplace + " заменен на " + newActor.name + " " + newActor.surname);
                return true;
            }
        }
        System.out.println("Предупреждение: Актер с фамилией '" + surnameToReplace + "' не найден в спектакле!");
        return false;
    }
}