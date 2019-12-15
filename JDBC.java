package First;
import java.sql.*;
import java.util.Scanner;
    public static void forName(String className)throws ClassNotFoundException  {}
public class JDBC {
    Class.forName("com.mysql.jdbc.Driver"); 
      Connection con;
      Statement st;
      ResultSet rs;
      Connection con=DriverManager.getConnection(  
 "jdbc:mysql://localhost:3306/praga","root","root");  
    //String driver="oracle.jdbc.driver.OracleDriver";
    //String dburl="jdbc:oracle:thin:@localhost:1521:XE";
    //String uname="system";
    //String pass="vignesh";
    public void dbconnect(){
    try{
    Class.forName(driver);
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","vignesh");
    //con=DriverManager.getConnection(dburl,uname,pass);
        System.out.println("Database Connected.........");


    }catch(Exception e){
        System.out.println("Exception:"+e);
    }
    }
    public void create(){
        try{
        st=con.createStatement();
        String sql="CREATE TABLE TEST5(ID INTEGER,NAME VARCHAR(20))";
        st.executeUpdate(sql);
            System.out.println("........Table Created......");
        }catch(Exception e){
            System.out.println("Exception:"+e);
        }
    }
    public void insert(){
        try{
        st=con.createStatement();
        String sql="INSERT INTO TEST5 VALUES(100,'VIGNESH')";
        st.executeUpdate(sql);
        sql="INSERT INTO TEST5 VALUES(101,'RAJMAAA')";
        st.executeUpdate(sql);
        System.out.println(".....Data inserted.....");
        }catch(Exception e){
            System.out.println("Exception:"+e);
        }
    }
    public void view(){
    
        try{
        //Creating Statement
        st=con.createStatement();
        String sql="select * from test5";
        rs=st.executeQuery(sql);
        //System.out.println("Creating");
            System.out.println("Table Contents:");
        //Extract data from ResultSet
        while(rs.next()){
                    //System.out.println("Creating Statement");

        int id=rs.getInt("id");
            System.out.println("ID:"+id);
        String name=rs.getString("name");
            System.out.println("Name:"+name);
        }
        rs.close();
            
        }catch(Exception e){
            System.out.println("Exception:"+e);
        }
    }
    public void update(){
    try{
        st=con.createStatement();
        String sql="UPDATE TEST5 SET ID = 200 WHERE NAME ='VIGNESH'";
        st.executeUpdate(sql);
        System.out.println("Updated......");
    }catch(Exception e){
        System.out.println("Exception:"+e);
    }    
    }
    public void delete(){
    try{
        st=con.createStatement();
        String sql="DELETE FROM TEST5 WHERE NAME ='RAJMAAA'";
        st.executeUpdate(sql);
        System.out.println(".....DELETED......");
    }catch(Exception e){
        System.out.println("Exception:"+e);
    }    
    }
    public static void main(String[] args) {
        JDBC ob = new JDBC();
         ob.dbconnect();
         System.out.println("1.Create \n 2.Insert \n 3.View \n4.Update \n 5.Delete \n 6.Exit");
        Scanner sc = new Scanner(System.in);
        int v=1;
        while(v==1){
        int m;

        m=sc.nextInt();
      
        switch(m)
        {
            case 1:    
                ob.create();
                break;
            case 2:
                ob.insert();
                ob.view();
                break;
            case 3:
                ob.view();
                break;
            case 4:
                ob.update();
                ob.view();
                break;
            case 5:
                ob.delete();
                ob.view();
                break;
            case 6:
                System.exit(0);
                
        }
        System.out.println("Press 1 to continue or 0 to exit....");
        v=sc.nextInt();
        
        }System.exit(0);
    }
}    

