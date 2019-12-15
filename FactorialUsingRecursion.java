package First;
public class FactorialUsingRecursion {
    static int fact = 1;
    static int factorial(int n){
       fact = fact * n;
       if(n-1 >= 1){
           factorial(n-1);
       }
       return fact;
    }
    public static void main(String args[]){
        int n = 5;
        
        int number = factorial(n);
        System.out.println(number);
    }
}
/*
Factorial: 
1*2*3...
n - Factorial
n=5 
1*2..*5 = 5*4*..*1
int fact = 1
for(int i=1;i<=n;i++){
    fact = fact * i;
}

recursion:

//Function that call itself is called recursion.

n=5

fact = 1
void factorial(n){
    fact = fact * n // 1*5 = 5 // 5*4 //
    if(n-1 >= 1) 
    factorial(n-1);
}
*/
