import javax.management.InvalidApplicationException;
import javax.management.InvalidAttributeValueException;

public class Main {
    public static void main(String[] args) {
        Butik butik = new Butik();
        int byttepenge=0;
        try {
            byttepenge=butik.køb(150, 100);
        }
        catch(InvalidAttributeValueException | InvalidApplicationException e){
            System.out.println(e.getMessage());
        }
        System.out.println(butik.byttepenge(byttepenge));
    }
}
