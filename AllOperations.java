package TaskManager;
import java.sql.*;
public class AllOperations {
public static final Connection c=DBConnection.getConnection();
public static void AddTask(){
String s="insert into TOdolist values(?,?,?)";
try{
PreparedStatement ps=c.prepareStatement(s);
//First Row
ps.setInt(1,101);
ps.setString(2,"Intership Application");
ps.setString(3,"InProgress");
ps.executeUpdate();
//Second Row
ps.setInt(1,102);
ps.setString(2,"Java Certification Course");
ps.setString(3,"Not Completed");
ps.executeUpdate();
//Third Row
ps.setInt(1,103);
ps.setString(2,"Registration for Hackthon");
ps.setString(3,"Completed");
ps.executeUpdate();
System.out.println("Inserted rows");

}
catch(SQLException e){
    e.printStackTrace();
}
}
public static void UpdateTask(){
    String query="update TOdolist set status=? where id=?";
try{
    PreparedStatement ps=c.prepareStatement(query);
   ps.setString(1,"Completed");
   ps.setInt(2,2);
   ps.executeUpdate();
}
catch(Exception e){
    e.printStackTrace();
}
}
public static void DeleteTask(){
    String query="delete from TOdolist where id=?";
    try{
    PreparedStatement ps=c.prepareStatement(query);
   ps.setInt(1,3);

   ps.executeUpdate();
}
catch(Exception e){
    e.printStackTrace();
}
}
public static void main(String[] args){
    AddTask();
}
}
