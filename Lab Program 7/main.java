
public class main{
    public static void main(String[] args) {
        try {
            
            Son obj= new Son();
            obj.display();
        }
        catch(WrongAge e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}