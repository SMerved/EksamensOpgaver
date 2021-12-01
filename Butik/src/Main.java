import javax.management.InvalidApplicationException;
import javax.management.InvalidAttributeValueException;

public class Main {
    public static void main(String[] args) {
        Butik butik = new Butik();
        int byttepenge=0;
        try {
            byttepenge=butik.køb(150, 786);
        }
        catch(InvalidAttributeValueException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidApplicationException e2){
            System.out.println(e2.getMessage());
        }
        System.out.println(butik.byttepenge(byttepenge));
    }
}
