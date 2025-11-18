class Son extends Father{
    int SonAge;

    Son() throws WrongAge{
        System.out.print("Enter Son's Age:");
        SonAge=s.nextInt();

        if(SonAge<0){
            throw new WrongAge("Son's Age can not be Negative or Zero");
        }
        else if(SonAge>=FatherAge){
            throw new WrongAge("Son's Age cannot be greater than Fathers Age");
        }
    }

    void display(){
        super.displayFather();
        System.out.println("\nSon's Age is:"+SonAge);
    }
}

