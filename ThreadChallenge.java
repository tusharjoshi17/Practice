
class ATM
{
synchronized void checkBalance(String name)
{
    System.out.print(name +" checking ");
    System.out.println("Balance");
}
synchronized void withdraw(String name,float amount)
{
    System.out.print(name);
    System.out.println(amount);
}
}

class Customers extends Thread
{
    ATM atm;
    String name;
    float amount;

    Customers(String n, ATM a, float amt)
    {
     name=n;
     atm=a;
     amount=amt;
    }

    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }
    public void run()
    {
        useATM();
    }
}

public class ThreadChallenge
{
    public static void main(String[] args)
    {
    ATM atm = new ATM();
    Customers c1 = new Customers("Tushar",atm,100);
        Customers c2 = new Customers("Raj",atm,200);
        c1.start();
        c2.start();
    }
}
