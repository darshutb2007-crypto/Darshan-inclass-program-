package TaskManager;
import java.sql.*;
public class CreateDataBase {
public static void main(String[]args) throws Exception{
    Connection c=DBConnection.getConnection();
    String database="Create database if not exists Task";
    Statement s=c.createStatement();
    System.out.println("Database Created");
    s.executeUpdate(database);



}
}
