package twu.tdd.exercise;

/**
 * Created by jcarrillo on 30/11/16.
 */
public class Dollar {

    public int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){

//        amount *= multiplier;
//        return null;
        return new Dollar(amount*multiplier);
    }

    public boolean equals(Object object){
//        return true;
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
