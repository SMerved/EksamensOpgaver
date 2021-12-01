import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> ordListe=new ArrayList<>();
        ArrayList<String> nyOrdListe;
        ordListe.add("Hello");
        ordListe.add("World");
        Ordleg ordleg=new Ordleg();
        nyOrdListe=ordleg.gentagOrd(ordListe, 3);
        for (int i=0;i<nyOrdListe.size();i++){
            System.out.println(nyOrdListe.get(i));
        }
    }
}
