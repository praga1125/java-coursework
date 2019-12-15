package First;
class Parent{
    int a = 10;
    public int b = 20;
    protected int c = 30;
    private int d = 40;
    
    void print(String a){
        System.out.println("Print Method of Parent: "+ a);
    }
    
    Parent(){
        System.out.println("Constructor of Parent");
    }
    
    public int getD(){
        return this.d;
    }
    
    public void setD(int d){
        this.d = d;
    }
}

public class Child extends Parent{
    Child(){
        System.out.println("Constructor of Child");
    }
    @Override
    void print(String a){
        System.out.println("Print Method of Child: "+ a);
        super.print("From Super");
    }
    
    public static void main(String args[]){
        Child obj = new Child();
        obj.print("praga");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.getD());
    }
}
