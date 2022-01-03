import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> ordListe=new ArrayList<>();;
        ArrayList<String> nyOrdListe = new ArrayList<>();
        ordListe.add("Hello");
        ordListe.add("World");
        Ordleg ordleg=new Ordleg();
        try {
            nyOrdListe=ordleg.gentagOrd(ordListe, 3);
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }
        for (int i=0;i<nyOrdListe.size();i++){
            System.out.println(nyOrdListe.get(i));
        }
    }
}
