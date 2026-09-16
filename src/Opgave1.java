public class Opgave1 {
    static double balance;
    String accountName;

    public static void deposit(double amount){
        balance = balance + amount;
    }

   public static void withdraw(double amount){
        balance = balance - amount;
   }

   public static void checkBalance(){
       System.out.println("Balance: "+ balance);
   }


    void main(){
        accountName = "Patrick";

        // deposit penge
        deposit(100);

        // Withdraw penge
        withdraw(50);

        // Check kontoen
        checkBalance();

    }
}
