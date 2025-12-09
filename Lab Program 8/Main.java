class BMSPrinter extends Thread{
    public void run(){
        try {
           for(int i=0;i<3;i++){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

class CSEPrinter extends Thread{
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class Main{
    public static void main(String args[]){
        BMSPrinter t1=new BMSPrinter();
        CSEPrinter t2=new CSEPrinter();

        t1.start();
        t2.start();

    }
}