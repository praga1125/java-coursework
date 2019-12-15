package First;

import java.util.*;
import java.sql.*;  
class jdbc1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/praga?useSSL=false","praga","pragadeeshwaran");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");  
con.close();  
}
catch(Exception e){ System.out.println(e);}  
}  
} 

