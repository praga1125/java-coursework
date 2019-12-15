package First;
public class uppercase {
    public static void main(String args[]){
        String str ="hello this is from netbeans";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
        arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase();
        System.out.print(arr[i] + " ");
        }
    } 
}
