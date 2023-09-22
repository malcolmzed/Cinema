package Theatre;

import java.util.ArrayList;


public class Theatre {

    public int theatreId;
    public String name;
    // + Address etc

    public
    Theatre(int theatreId, String name) {
        this.theatreId = theatreId;
        this.name = name;
    }

    private static ArrayList<Theatre> theTheatres = new ArrayList<Theatre>();

    static public Theatre createTheatre(Theatre theatreIn) {
        // within the argument, the Id is ignored
        // and a new Id is created and returned
        // in this simple exercise I do not worry about duplicates


        int newId = theTheatres.size() + 1;

        Theatre newTheatre = theatreIn;
        newTheatre.theatreId = newId;

        theTheatres.add(newTheatre);
        return newTheatre;
    }

    // in a real system would also need Getters

}

