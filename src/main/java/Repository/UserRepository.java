package Repository;

import Connection.ConnectionProvide;
import entity.Role;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository {
    static ArrayList<User> list = new ArrayList<>();

    public static void findByProjectId(int projectID) {
        String sql = "SELECT * FROM final_exam_5.user\n" +
                "where project_id=? and `role`!='admin'  ;";
        try {
            Connection connection = ConnectionProvide.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, projectID);
            ResultSet resultSet = statement.executeQuery();
            System.out.printf("%-10s|%-10s|%-30s|%-15s|%-10s|%-10s|%-10s|%-10s|%n", "id", "Full name", "Email", "Password", "ExpInYear", "ProjectId", "ProSkill", "Role");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullName = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int expInYear = resultSet.getInt("exp_in_year");
                String proSkill = resultSet.getString("pro_skill");
                int projectid = resultSet.getInt("project_id");
                String role = resultSet.getString("role");
                User user = new User(id, fullName, email, password, expInYear, projectid, proSkill, Role.valueOf(role));

                System.out.printf("%-10s|%-10s|%-30s|%-15s|%-10s|%-10s|%-10s|%-10s|%n", user.getId(), user.getFullname(), user.getEmail(), user.getPassword(), user.getExpInYear(), user.getProjectId(), user.getProSkill(), user.getRole());


            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static User LogInAdmin(String email, String password) {
        String sql = "SELECT * FROM final_exam_5.user\n" +
                "where email=? and `password`=? and `role`='admin' ";
        try {
            Connection connection = ConnectionProvide.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullnamee = resultSet.getString("full_name");
                String pass = resultSet.getString("password");
                String mail = resultSet.getString("email");
                String prokill = resultSet.getString("pro_skill");
                int expinyear = resultSet.getInt("exp_in_year");
                int projectid = resultSet.getInt("project_id");
                String rolle = resultSet.getString("role");
                User user = new User(id, fullnamee, mail, pass, expinyear, projectid, prokill, Role.valueOf(rolle));
                System.out.println(user);
                return user;


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void taoUser(String email, String fullname) {
        String sql = "insert into user ( full_name, email, password) values ( ?, ?, '123456')";
        try {
            Connection connection = ConnectionProvide.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fullname);
            statement.setString(2, email);
            int i = statement.executeUpdate();
            if (i > 0) {
                System.out.println("Tao thanh cong");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
