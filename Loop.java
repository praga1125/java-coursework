class Loop{
public static void main(String args[]){
for(int i=0;i<5;i++){
System.out.println(i);
}

int a[]=new int[3];
a[0]=10;
a[1]=20;
a[2]=30;

String strArr[] = {"Hello","World","!!!"};
for(int temp : a){
System.out.println(temp*10);
}

for(String str: strArr){
System.out.print(str+" ");
}

}

}
