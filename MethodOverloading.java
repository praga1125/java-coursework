package First;

public class MethodOverloading {
    void print(String n){
        System.out.println("String: "+n);
    }
    void print(int n){
        System.out.println(n);
    }
    void print (String a,int s ){
        System.out.println(a+s);
    }
    public static void main (String arg[]){
        MethodOverloading obj  = new MethodOverloading();
        String a = "12223dddd";
        obj.print(a);
    }
}
