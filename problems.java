// reverse 

import java.io.*;
import java.util.*;
class count{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  int num = obj.nextInt();
  String rev = "";
  int count = 0;
  while(num > 0){
    if(num == 0){
       break;
    } else {
        rev += num % 10;
         num = num /10;
        count++;
    }
}
System.out.println(" reverse number  is  :"+rev);
System.out.println("number of digits are :"+count);
}
}

//--------------------------------


import java.io.*;
import java.util.*;
import java.lang.*;
class count{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  System.out.println("enter number one ");
  int a = obj.nextInt();
  System.out.println("enter number two ");
  int b = obj.nextInt();
  System.out.println("enter the operation");
  char operator = obj.next().charAt(0);
  switch(operator) {
   case '+':
       System.out.println("addition of number :" + (a+b));
       break;
    case '-':
       System.out.println("addition of number :" + (a-b));
       break;
    case '*':
       System.out.println("addition of number :" + (a*b));
       break;
    case '/':
       System.out.println("addition of number :" + (a/b));
       break;
    case '%':
       System.out.println("addition of number :" + (a%b));
       break;
  }
}
}

//----------------------------------------

import java.util.*;
class train{
    int train_Id;
    String arrival_Time, departure_Time;  
    train(int trainId, String arrivalTime,String departureTime){
        this.train_Id = trainId;
        this.arrival_Time = arrivalTime;
        this.departure_Time = departureTime; 
    }
    
    void put_details() {
        System.out.println("The train id is :"+ this.train_Id);
        System.out.println("The train arrival time is :"+ this.arrival_Time);
        System.out.println("The train departure time is :"+ this.departure_Time);
    }
}

class main{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  System.out.println("enter the id of the train : ");
  int id = obj.nextInt();
  System.out.println("enter the arrival time of the train : ");
  String arrival = obj.next();
  System.out.println("enter the departure time of the train : ");
  String departure = obj.next();
  train obj1 = new train(id, arrival, departure);
  obj1.put_details();
}
}

//-----------------------------------------

import java.util.*;
class factorial{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  int num = obj.nextInt();
  int fact = 1;
  while(num > 0) {
      fact *= num;
      num--;
  }
  System.out.println("The factorial value is : " + fact);
}
}

//-----------------------------------------

import java.util.*;
class SumOfNumber{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  int num = obj.nextInt();
  int r = 0;
  for(int i = 1; i < num; i++) {
      r += i;
  }
  System.out.println("The sum of value is : " + r);
}
}

//-----------------------------------------------

import java.util.*;
class square{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  int range1 = obj.nextInt();
  int range2 = obj.nextInt();
  for(int i = range1; i < range2 ;i++){
  System.out.println("The square of each values  :" + Math.sqrt(i));
  }
}
}
//------------------------------------------------

import java.util.*;
class employee{
    int emp_Id, salary;
    String emp_name;  
    void get_data(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the employee id");
        this.emp_Id = obj.nextInt();
        System.out.println("enter the name of the employee");
        this.emp_name = obj.next();
        System.out.println("enter the salary of employee");
        this.salary = obj.nextInt(); 
    }
    
    void put_data() {
        System.out.println("The employee id is :"+ this.emp_Id);
        System.out.println("The employee name is :"+ this.emp_name);
        System.out.println("The employee salary is :"+ this.salary);
    }
}

class main{
public static void main(String args[]){
  employee obj = new employee();
  obj.get_data();
  obj.put_data();
  employee obj1 = new employee();
  obj1.get_data();
  obj1.put_data();
  employee obj2 = new employee();
  obj2.get_data();
  obj2.put_data();
  employee obj3 = new employee();
  obj3.get_data();
  obj3.put_data();
}
}

//--------------------------------------

import java.util.*;
class main{
public static void main(String args[]){
  Scanner obj = new Scanner(System.in);
  int range = obj.nextInt();
  do{
      System.out.println(range);
      range--;
  } while(range > 0);
  
}
}

//---------------------------------------

import java.util.*;
class main{
public static void main(String args[]){
   for(int i = 50; i < 500; i++){
        if(i%5 == 0) {
            System.out.println(i);
        }
  }
  }
}

//--------------------------------------

import java.util.*;
class phone {
    String ph_name,ph_brand;
    int ph_price;
    phone(String name, String brand, int price) {
        this.ph_name = name;
        this.ph_brand = brand;
        this.ph_price = price;
    }
    void display(){
        System.out.println("The phone name is : "+this.ph_name);
        System.out.println("The phone brand is : "+this.ph_brand);
        System.out.println("The phone price is : "+this.ph_price);
    }
    void features(){
        String ram = "4Gb", storage = "128GB";
        System.out.println("The phone ram is : "+ram);
        System.out.println("The phone storage is : "+storage);
    }
}

class main{
public static void main(String args[]){
    phone obj = new phone("iphonex", "iphone", 100000);
    obj.display();
    obj.features();
  }
}
//-------------------------------------





