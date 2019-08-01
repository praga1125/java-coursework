class last{
  public void finalize(){
      System.out.println(" garbage is collected");
}
  public static void main(String args[]){
   last n=new last();
   last m=new last();
   last o=new last();
   n=null;
   m=null;
   o=null;
   System.gc();
}
}
