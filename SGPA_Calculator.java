import java.util.Scanner;

public class SGPA_Calculator {
    public static void main(String[] args){
        System.out.println("SGPA Calculation Program");
        Student student1 = new Student();
        
        student1.getStudentDetails();
        student1.getMarks();
        student1.computeSGPA();
        student1.displayDetails();
    }
}

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}
class Student{
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject subject[];


Student(){
    subject =new Subject[8];
    for(int i=0;i<8;i++){
        subject[i] =new Subject();
    }
    s=new Scanner(System.in);
}

void getStudentDetails(){
    System.out.print("Enter name: ");
    this.name=s.nextLine();
    System.out.print("Enter usn: ");
    this.usn=s.nextLine();
}

void getMarks(){
    for(int i=0;i<8;i++){
        System.out.print("Enter marks for Subject:"+(i+1)+ ": ");
        subject[i].subjectMarks=s.nextInt();
        System.out.print("Enter credits for Subject"+(i+1)+": ");
        subject[i].credits=s.nextInt();
        
        if(subject[i].subjectMarks > 100){
            System.out.println("Error: Marks cannot exceed 100. Please start over.");
            return;
        }
        subject[i].grade=(subject[i].subjectMarks/10)+1;
        if(subject[i].grade == 11){
            subject[i].grade=10;
        }
        if(subject[i].grade <=4){
            subject[i].grade=0;
        }
    }
}
void computeSGPA(){
    double effectiveScore =0;
    int totalCredits = 0;
    
    for(int i =0;i<8;i++){
        effectiveScore += (subject[i].grade * subject[i].credits);
        totalCredits += subject[i].credits;
    }
    this.SGPA = effectiveScore / totalCredits;
}
void displayDetails(){
    System.out.println("\nStudent Details");
    System.out.println("Name: "+ this.name);
    System.out.println("USN: "+this.usn);
    System.out.printf("SGPA: %.2f\n",this.SGPA);
}
}
