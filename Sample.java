class Sample{
    public static void main(String args[])
    {
        int x=10; 
        int y=20;
        if(x<y) System.out.println("x is less than y");
        x=x*2;
        if(x==y) System.out.println("x is equal to y");
        x=x*2;
        if(x>y) System.out.println("x is now greater than y ");
        if(x==y) System.out.println("you wont see this");
        else System.out.println("Not equal now");
    }
}