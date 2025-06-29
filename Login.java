
import java.awt.Component;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Login {
    ConnectionToDB con = new ConnectionToDB();
    Connection con_obj = con.EstablishConnection();
    Statement stmt = null; //insert , update , delete
    PreparedStatement pstmt = null; //select
    ResultSet res = null;
    String name,pwd;
    public void login(String username, String password) {
    try {
        
        String sql = "SELECT * FROM Employee WHERE Username = ? AND Password = ?";
        pstmt = con_obj.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);

        res = pstmt.executeQuery();

        if (res.next()) {
            String role = res.getString("role"); // Either "Owner" or "Cashier"
            JOptionPane.showMessageDialog(null, "Login successful! Role: " + role);

            if (role.equalsIgnoreCase("Owner")) {
                OwnerDashbaordform odf = new OwnerDashbaordform();
                odf.setVisible(true);
                
            } else if (role.equalsIgnoreCase("Cashier")) {
                CashierDashboard cd = new CashierDashboard();
                cd.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
        }

        res.close();
        pstmt.close();
        con_obj.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error.");
    }
}

}
