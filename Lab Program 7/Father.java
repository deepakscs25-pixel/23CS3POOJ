import java.util.Scanner;

class WrongAge extends Exception{
    public WrongAge(String msg){
        super(msg);
    }
}

class InputScanner {
    Scanner s=new Scanner(System.in);
}

class Father extends InputScanner{
    int FatherAge;
    Father() throws WrongAge{
        System.out.print("Enter Father's Age:");
        FatherAge= s.nextInt();

        if (FatherAge<0){
        throw new WrongAge("Age cannot Be Zero or Negative");
        }
    }

    
    void displayFather(){
        System.out.print("Fathers Age is "+FatherAge);
    }
}

