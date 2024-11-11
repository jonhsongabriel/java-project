
package jonhson.project.maeven.model;

import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import  java.util.ArrayList;
import  java.util.List;

import  jonhson.project.maeven.model.User;


public class UserDatabase {

    //Déclaration de la connection dans le base des donnée 
    private static final String URL="jdbc:mysql://localhost/8099/java";
    private static final String USER="root";
    private static final String PASSWORD="";

    //Connection a la base des donnée 
    public Connection getConnection() throws  Exception{
        return  DriverManager.getConnection(URL,USER,PASSWORD);
    }
    public void addUser(User user) throws Exception {
        String sql = "INSERT INTO users (nom, prenom, age, adresse, contact, email) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getNom());
            stmt.setString(2, user.getPrenom());
            stmt.setInt(3, user.getAge());
            stmt.setString(4, user.getAdresse());
            stmt.setString(5, user.getContact());
            stmt.setString(6, user.getEmail());
            stmt.executeUpdate();
        }
    }


public List<User> getAllUsers() throws Exception {
    List<User> users = new ArrayList<>();
    String sql = "SELECT * FROM users";
    try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            User user = new User();
            user.setNom(rs.getString("nom"));
            user.setPrenom(rs.getString("prenom"));
            user.setAge(rs.getInt("age"));
            user.setAdresse(rs.getString("adresse"));
            user.setContact(rs.getString("contact"));
            user.setEmail(rs.getString("email"));
            users.add(user);
        }
    }
    return users;
}
public void addUser(org.eclipse.jetty.server.Authentication.User user2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addUser'");
}
}