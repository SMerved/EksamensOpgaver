import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;

public class Ordleg {
    public ArrayList<String> gentagOrd(ArrayList<String> ordListe, int k) throws InvalidAttributeValueException {
        if (k<=0){
            throw new InvalidAttributeValueException("k er et ikke gyldigt tal");
        }
        if (ordListe==null){
            throw new InvalidAttributeValueException("Ordliste arrayet er null");
        }
        ArrayList<String> nyOrdListe = new ArrayList<>();
        for (int i = 0; i < ordListe.size(); i++) {
            for (int j = 0; j < k; j++) {
                nyOrdListe.add(ordListe.get(i));
            }

        }
            return nyOrdListe;
    }
}
