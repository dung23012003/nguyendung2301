package devmaster.edu.vn.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import devmaster.edu.vn.beans.UserAccount;

public class LoginUtils {

    public static UserAccount findUser(Connection conn, String userName, String password) throws SQLException {
        String sql = "SELECT a.USER_NAME, a.Password, a.Gender FROM User_Account a WHERE a.User_Name = ? AND a.Password = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }

    public static UserAccount findUser(Connection conn, String userName) throws SQLException {
        String sql = "SELECT a.USER_NAME, a.Password, a.Gender FROM User_Account a WHERE a.User_Name = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            String password = rs.getString("Password");
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }
}