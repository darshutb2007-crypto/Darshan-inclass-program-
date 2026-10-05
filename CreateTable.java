package TaskManager;
import java.sql.*;
public class CreateTable {
   public static void main(String[]args) throws Exception{
    Connection c=DBConnection.getConnection();
    String database="""
    Create table if not exists TOdolist(
    id int primary key,
    Task VARCHAR(200),
    status VARCHAR(50)
    )
    """;
    Statement s=c.createStatement();
    System.out.println("Table Created");
    s.executeUpdate(database);



}

}
