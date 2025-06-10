abstract class Payment{
    abstract void pay();
}

class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Paid using Credit Card");
    }
}

class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Paid using UPI");
    }
}

public class Bank{
    public static void main(String[] args){
        CreditCard cc = new CreditCard();
        cc.pay();

        UPI upi = new UPI();
        upi.pay();
    }
}