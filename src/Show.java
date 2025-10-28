import java.util.ArrayList;
import java.util.Scanner;

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

    void removeActor() { /// метод для удаления актера из спектакля
            System.out.println("Удалить актера из спска спектакля  " + title);

            for (Actor actor : listOfActors) {
                int i = 1;
                System.out.println(i + ". " + actor.name + " " + actor.surname);
                i++;
            }
            System.out.println("Введите номер актера, которого нужно удалить из списка ... ");
            Scanner scanner = new Scanner();
            int numberToRemove = scanner.nextInt();
            listOfActors.remove(numberToRemove-1);
            System.out.println("Актер " +listOfActors.get(numberToRemove-1)  + "был удален из списка");

        }

        void replaceActor() { //метод для замены актера в спктакле. Одного на другого.
            System.out.println("Заменить актера в спектакле  " + title);

            for (Actor actor : listOfActors) {
                int i = 1;
                System.out.println(i + ". " + actor.name + " " + actor.surname);
                i++;
            }
            System.out.println("Введите номер актера, которого нужно заменить ... ");
            Scanner scanner = new Scanner();
            int numberToReplace = scanner.nextInt();
            listOfActors.remove(numberToReplace-1);


            System.out.println("Список всех акктеров театра.");

            for (Actor actor : Theatre.allActorsOfTheatre ) {
                int i = 1;
                System.out.println(i + ". " + actor.name + " " + actor.surname);
                i++;
            }

            System.out.println("Введите номер актера для добавления в спекакль: ");
            int whoAdd = scanner.nextInt();

            listOfActors.add(Theatre.allActorsOfTheatre.get(whoAdd-1));







       }


    }






    


