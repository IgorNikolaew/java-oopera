import java.util.ArrayList;

public class Theatre {
    private static ArrayList<Actor> allActorsOfTheatre = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Здравствуйте! Наш театр начинает работу.");

        // Создаем актеров
        Actor actor1 = new Actor("Борис", "Михайлов", Gender.Муж, 170);
        Actor actor2 = new Actor("Иван", "Толстой", Gender.Муж, 175);
        Actor actor3 = new Actor("Анна", "Филлипова", Gender.Жен, 165);

        allActorsOfTheatre.add(actor1);
        allActorsOfTheatre.add(actor2);
        allActorsOfTheatre.add(actor3);

        // Создаем режиссеров
        Director director1 = new Director("Питер", "Брук", Gender.Муж, 178, 3);
        Director director2 = new Director("Вячеслав", "Бутусов", Gender.Муж, 168, 5);

        // Создаем спектакли
        Show showOne = new Show("Обычный спектакль", 100, director1, new ArrayList<>());
        Opera operaOne = new Opera("Травиата", 120, director2, new ArrayList<>(),
                "Джузеппе Верди", "Текст либретто оперы Травиата...", 12);
        Ballet balletOne = new Ballet("Лебединое озеро", 90, director1, new ArrayList<>(),
                "Пётр Чайковский", "Текст либретто балета Лебединое озеро...", "Мариус Петипа");

        // Распределяем актеров по спектаклям
        System.out.println("\n--- Распределение актеров ---");
        showOne.addActorToShow(actor1);
        showOne.addActorToShow(actor2);

        operaOne.addActorToShow(actor2);
        operaOne.addActorToShow(actor3);

        balletOne.addActorToShow(actor1);
        balletOne.addActorToShow(actor3);

        // Выводим списки актеров
        System.out.println("\n--- Списки актеров по спектаклям ---");
        showOne.printActorsOfShow();
        operaOne.printActorsOfShow();
        balletOne.printActorsOfShow();

        // Замена актера
        System.out.println("\n--- Замена актера ---");
        showOne.replaceActor(actor3, "Толстой"); // Заменяем существующего
        showOne.replaceActor(actor1, "Несуществующий"); // Пробуем заменить несуществующего

        // Выводим обновленный список
        System.out.println("\n--- Обновленный список актеров ---");
        showOne.printActorsOfShow();

        // Выводим либретто
        System.out.println("\n--- Либретто ---");
        operaOne.printLibretto();
        balletOne.printLibretto();

        // Информация о режиссерах
        System.out.println("\n--- Информация о режиссерах ---");
        showOne.printDirectorInfo();
        operaOne.printDirectorInfo();
        balletOne.printDirectorInfo();
    }
}