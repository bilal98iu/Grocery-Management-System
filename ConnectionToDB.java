import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionToDB {
    Connection con = null;
    public Connection EstablishConnection()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\bilal\\OneDrive\\Desktop\\OOPDB\\EmployeeDB.accdb");
            //JOptionPane.showMessageDialog(null, "Connected");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
}