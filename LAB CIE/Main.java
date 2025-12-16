interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
    void display();
}

class Rectangle implements Resizable{
    int width;
    int height;
    
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    
    public void resizeHeight(int height) {
       this.height=height;
    }

    public void resizeWidth(int width){
        this.width=width;
    }

    public void display(){
        System.out.print("Value of Width:"+width);
        System.out.print("\nValue of Height:"+height+"\n");
    }
}

class Main{
    public static void main(String[] args) {
        Resizable r=new Rectangle (3,4);
        r.display();
        r.resizeHeight(6);
        r.resizeWidth(8);
        r.display();
    }

}
