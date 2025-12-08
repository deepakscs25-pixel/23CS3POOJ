class Synch {
    public static void main(String[] args) {
        new CollegeThread("BMS College of Engineering", 10000); // 10 seconds
        new CollegeThread("CSE", 2000);                         // 2 seconds
    }
}

class CollegeThread implements Runnable {
    Thread t;
    String message;
    int delay;

    CollegeThread(String msg, int time) {
        message = msg;
        delay = time;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
              // continue displaying repeatedly
                System.out.println(message);
                Thread.sleep(delay);
        } 
        catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

