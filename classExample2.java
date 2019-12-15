/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

/**
 *
 * @author praga
 */
public class classExample2{
    public static void main(String args[]){
        
        classAccess2 arya = new classAccess2("Arya", 90); //whole copy of class in object
        classAccess2 arun = new classAccess2("Arun", 13);
        classAccess2 alex = new classAccess2("Alex", 95);
        arya.print();
        arun.print();
        alex.print();
    }
}

class classAccess2{
    String name;
    int mark;
    
    classAccess2(String n, int m){
        name = n;
        mark = m;    
    }
    
    void print(){
        System.out.println("Name: " + name + " Mark: " + mark);
    }
}
