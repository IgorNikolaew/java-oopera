import java.util.ArrayList;

public class Ballet extends MusicalShow {


    String choreographer;

    public Ballet(String title, double duration, Director director, ArrayList<Actor> actors, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet() {

    }
}