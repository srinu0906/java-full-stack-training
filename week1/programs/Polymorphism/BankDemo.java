abstract class RBI {
    abstract void deposit(double n);
    abstract void withdraw(double n);    
}

class SBI extends RBI {
    double amount = 0.0;

    @Override
    void deposit(double n){
        amount += n;
        System.err.println("Amount Deposited: "+n);
        System.err.println("Total amount :"+amount);
    }

    @Override
    void withdraw(double n){
        if (n >= amount){
            amount -= n;
            System.err.println("Amount debited: "+n);
            System.err.println("Total amount :"+amount);
        }
        else{
            System.err.println("Cannot withdraw");
        }
    }
}

class ICICI extends RBI {
    double amount = 0.0;

    @Override
    void deposit(double n){
        amount += n;
        System.err.println("Amount Deposited: "+n);
        System.err.println("Total amount :"+amount);
    }

    @Override
    void withdraw(double n){
        if (n <= amount){
            amount -= n;
            System.err.println("Amount debited: "+n);
            System.err.println("Total amount :"+amount);
        }
        else{
            System.err.println("Cannot withdraw");
        }
    }
}

public class BankDemo {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.deposit(600000.0);
        sbi.withdraw(20000.0);

        ICICI icici = new ICICI();
        icici.deposit(600000.0);
        icici.withdraw(20000.0);
    }
    
}
