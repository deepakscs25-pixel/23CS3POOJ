import java.util.Scanner;
import static java.lang.Math.sqrt; 
class quadratic {
    public static void main(String args[])
    {
        
        Scanner n=new Scanner(System.in);
        double a,b,c;
        double d;
        System.out.println("Enter the value for a: ");
        a=n.nextInt();
        if(a==0){
            System.out.println("Not a quadratic equation. Please enter a non-zero value for 'a'.");
            return;
        }
        
        System.out.println("Enter the value for b: ");
        b=n.nextInt();
        System.out.println("Enter the value for b:" );
        c=n.nextInt();
        
        d=b*b - 4*a*c;
        System.out.println("Output: "+d);
        if(d==0){
            double r1= (-b)/(2*a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root 1 and Root 2: "+r1);
        }
        else if(d>0){
            double r1=((-b) + (Math.sqrt(d)))/(2*a);
            double r2=((-b) - (Math.sqrt(d)))/(2*a);
            System.out.println("Roots are Real and different.");
            System.out.println("Root 1:"+r1);
            System.out.println("Root 2:"+r2);
        }
        else if (d<0) {
            System.out.println("Roots are imaginary.");
            double real=(-b)/(2*a);
            double imaginary=Math.sqrt(-d)/(2*a);
            System.out.println("Root 1:"+real);
            System.out.println("Root 2:"+imaginary);
        }
    }
}