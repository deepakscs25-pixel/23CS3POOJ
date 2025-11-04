import java.util.Scanner;

class account
{
    String name;
    int accno;
    String type;
    double balance;

    public account( String n,int a, String t, double b)
    {
        name=n;
        accno=a;
        type=t;
        balance=b;
    }

    void deposit(double amt)
    {
        balance+=amt;
    }

    void display()
    {
        System.out.println("account name :"+name);
        System.out.println("account number :"+accno);
        System.out.println("account type :"+type);
        System.out.println("account balance :"+balance);
    }
}

class sav_acct extends account
{
    sav_acct(String n,int a,double b)
    {
        super(n, a,"savings", b);
    }

    void interest()
    {
        double r=0.05;
        balance+=balance*r;
    }

    void withdraw(double amt)
    {
        if (amt<=balance)
        {
            balance-=amt;
        }
        else{
            System.out.println("insufficient balance!!!");
        }
    }
}

class cur_acct extends account
{

    public cur_acct(String n, int a,double b)
    {
        super(n,a,"current",b);
    }

    void withdraw(double amt)
    {
        if (amt<=balance)
        {
            balance-=amt;
        }
        else{
            System.out.println("insufficient balance!!!");
        }  
        checkminbalance();      
    }

    void checkminbalance()
    {
        double min=1000;
        if (balance<min){
            balance-=100;
            System.out.println("service charge imposed !!!");
        }
    }
    
}

public class Bank 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter account name :");
        String name=s.nextLine();

        System.out.println("enter account number :");
        int accno=s.nextInt();

        System.out.println("enter account type :");
        char ch=s.next().charAt(0);

        System.out.println("enter account balance :");
        double balance=s.nextDouble();

        if (ch=='s' || ch=='S')
        {
            sav_acct s1=new sav_acct(name,accno,balance);

            s1.display();
            s1.interest();
            System.out.println("enter deposit ammount :");
            s1.deposit(s.nextDouble());

            System.err.println("enter withdraw ammount :");
            s1.withdraw(s.nextDouble());

            s1.display();
        }
        else
        {
            cur_acct c1=new cur_acct(name, accno, balance);

            c1.display();
            System.out.println("enter deposit ammount :");
            c1.deposit(s.nextDouble());

            System.err.println("enter withdraw ammount :");
            c1.withdraw(s.nextDouble());

            c1.display();


        }



    }
    
}
