class Reverse{
public static void main(String args[]){
String str = "Hello World";
char vow[]={'a','e','i','o','u'};
int vowelLength=vow.length;
char ch[]=str.toCharArray();
int length=str.length()-1;
for(int i=length;i>=0;i--){ //str loop => Fuulll string

for(int j=0;j<vowelLength;j++){
if(ch[i]==vow[j]){
System.out.print(ch[i]);
}
}

}

}
}
