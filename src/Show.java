import java.util.ArrayList;

public class Show {
    String title;
    double duration;
    Director director;
    ArrayList<Actor> actors;



    public Show(String title, double duration, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }

    public Show() {
    }
}
