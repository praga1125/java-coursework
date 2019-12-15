package First;

public class PrimeNumber {
public static void main(String args[]){
    int n = 1; //10
    int counter = 0;
    if(n == 1){
        System.out.println(n + " is composite number."); //ToDo
    }else{
        for(int i=1;i<=n;i++){
        
        if(n%i == 0){
            counter = counter + 1;
        }
    }
    if(counter == 2) {
        System.out.println(n + " is prime number.");
    }else{
        System.out.println(n + " is not prime number.");
    }
    }
    
}    
}

/*
Prime Number:

n=7
int primeCounter = 0
1...n => n%i == 0 {primeCounter  = primeCounter +1}
primeCounter == 2 => Prime


*/