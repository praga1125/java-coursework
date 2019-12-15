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
public class classExample {
    public static void main(String args[]){
        classAccess object = new classAccess();
        object.print();
        object.print();
        object.print();
        classB objectB = new classB();
        objectB.print();
        objectB.print();
    }
}

class classAccess{
    int a = 10;
    void print(){
        System.out.println("The number is: " + a);
    }
}

class classB{
    int a = 15;
    void print(){
        System.out.println("The number is: " + a);
    }
}