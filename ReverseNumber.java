package First;
public class ReverseNumber {
public static void main(String args[]){
    int n=125;
    int reminder;
    int divider;
    int reverseNum = 0;
    int sum = 0;
    while(n>0){
        reminder = n % 10;
        sum = sum + reminder; //5+2+1 = 8
        n = n/10; //12 ,1
        //reverseNum = (reverseNum*10) + reminder; //0 + 5 = 5 , 50+2 = 52, 521
        
        
    }
}    
}

