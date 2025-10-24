import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, double duration, Director director, ArrayList<Actor> actors, String musicAuthor, String librettoText) {
        super(title, duration, director, actors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow() {
    }

    public void printLIbretto(Object musicalShow) { //РАСПЕЧАТАТЬ ТЕКСТ ЛИБРЕТТО
        System.out.println(musicalShow.librettoText);


    }
}

