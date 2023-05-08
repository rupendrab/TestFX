
public class Account {
    double balance;
    
    public Account(double balance) {
        super();
        this.balance = balance;
    }
    
    public void changeBalance(double amt, CalculateBalance calc) {
        balance = calc.calc(balance, amt);
    }
    
    public void debit(double amt) {
        changeBalance(amt, (a, b) -> {return a - b;});
    }

    public void credit(double amt) {
        changeBalance(amt, (a, b) -> {return a + b;});
    }
    
    public void addInterest(double pct) {
        changeBalance(pct, (a, b) -> {return a * (1 + b/100);});
    }
    
    public static void main(String[] args) {
        Account account = new Account(10);
        account.credit(100);
        System.out.println(account.balance);
        account.debit(50);
        System.out.println(account.balance);
        account.addInterest(10);
        System.out.println(account.balance);
    }

}
