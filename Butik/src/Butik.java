import javax.management.InvalidApplicationException;
import javax.management.InvalidAttributeValueException;

public class Butik {
    public int køb(int pris,int betaling) throws InvalidAttributeValueException, InvalidApplicationException {
        int byttepenge;
        if(pris<0 || betaling<0){
            throw new InvalidAttributeValueException("Negativt parameter tal");
        }
        if(betaling<pris){
            throw new InvalidApplicationException("Betaling er lavere end pris");
        }
        else {
            byttepenge = betaling - pris;
        }
        return byttepenge;
    }
    public String byttepenge(int byttepenge){
        int hundrede=0, halvtreds=0, tyve=0, ti=0, fem=0, to=0, en=0;
        while(byttepenge>=100){
            byttepenge=byttepenge-100;
            hundrede++;
        }
        while(byttepenge>=50){
            byttepenge=byttepenge-50;
                    halvtreds++;
        }
        while(byttepenge>=20){
            byttepenge=byttepenge-20;
            tyve++;
        }
        while(byttepenge>=10){
            byttepenge=byttepenge-10;
            ti++;
        }
        while(byttepenge>=5){
            byttepenge=byttepenge-5;
            fem++;
        }
        while(byttepenge>=2){
            byttepenge=byttepenge-2;
            to++;
        }
        while(byttepenge>=1){
            byttepenge=byttepenge-1;
            en++;
        }
        return hundrede+" 100-kroner sedler "+halvtreds+" 50-kroner sedler "+tyve+" 20-kroner mønter "+ti+" 10-kroner mønter "+fem+" 5-kroner mønter "+to+" 2-kroner mønter "+en+" 1-kroner mønter";
    }
}
