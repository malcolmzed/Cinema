package Cinemas;

import Cinemas.Theatre.Theatre;
import Cinemas.Film.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CinemaTest {

    private static final String name1 = "Theatre number 1 York";
    private static final String name2 = "Theatre number 2 Bath";
    @Test
    public void checkTheatres() {
        Theatre theatre1 = new Theatre(0, name1);
        Theatre theatre2 = new Theatre(0, name2);

        int id1 = Theatre.createTheatre(theatre1).theatreId;
        int id2 = Theatre.createTheatre(theatre2).theatreId;

        String storedName1 = Theatre.getTheatreName(id1);
        String storedName2 = Theatre.getTheatreName(id2);

        assertEquals(name1, storedName1);
        assertEquals(name2, storedName2);
    }

    private static final String title1 = "film number 1 Horror";
    private static final String title2 = "film number 2 Comedy";
    @Test
    public
    void checkFilms() {
        Film film1 = new Film(0, title1);
        Film film2 = new Film(0, title2);

        int id1 = Film.createFilm(film1);
        int id2 = Film.createFilm(film2);

        String storedTitle1 = Film.getFilmTitle(id1);
        String storedTitle2 = Film.getFilmTitle(id2);

        assertEquals(title1, storedTitle1);
        assertEquals(title2, storedTitle2);
    }

}

