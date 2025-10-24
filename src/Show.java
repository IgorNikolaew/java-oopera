import java.util.ArrayList;

public class Show {
    String title;
    double duration;
    Director director;
    ArrayList<Actor> listOfActors;


    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActorsOfShow() { //Печатает список артистов
        System.out.println("Аткеры, учавствующие в спектакле: ");

        for (Actor actor : listOfActors) {
            int i = 1;
            System.out.println(i + ". " + actor.name + " " + actor.surname + " Рост: " + actor.height + " см");
            i++;

        }
    }

    void addActorToShow(Actor actor) { //Добавляет уже существующего актера в список актеров спектакля
        if (listOfActors.contains(actor)) {
            System.out.println("Этот артист уже есть в списке");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor.name + " " + actor.surname + " успешно добавлен в спектакль");
        }
    }

    void removeActor() {
            System.out.println("Удалить актера из спска спектакля. " + title);

            for (Actor actor : listOfActors) {
                int i = 1;
                System.out.println(i + ". " + actor.name + " " + actor.surname);
                i++;
            }
            System.out.println("Введите номер актера, которого нужно удалить из списка ... ");
            int number

        }
    }






    


