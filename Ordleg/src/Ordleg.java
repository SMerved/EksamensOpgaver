import java.util.ArrayList;

public class Ordleg {
    public ArrayList<String> gentagOrd(ArrayList<String> ordListe, int k) {
        ArrayList<String> nyOrdListe = new ArrayList<>();
        for (int i = 0; i < ordListe.size(); i++) {
            for (int j = 0; j < k; j++) {
                nyOrdListe.add(ordListe.get(i));
            }

        }
            return nyOrdListe;
    }
}
