package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.User;

public class UserService implements UserDAO{
	 @Override
	    public User login(String email, String pass) {
	        User user = null;
	        Connection conn = SingeletonConnection.getConnection();
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from utili WHERE email LIKE ? and pass like ?");
	            ps.setString(1,email);
	            ps.setString(2,pass);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                user = new User();
	                user.setId(rs.getInt("id_utili"));
	                user.setEmail(rs.getString("email"));
	                user.setNom(rs.getString("nom"));
	                user.setPrenom(rs.getString("prenom"));
	                user.setPass(rs.getString("pass"));
	                user.setRole(rs.getInt("role"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return user;
	    }

	    @Override
	    public List<User> findAll() {
	        List<User> userList = new ArrayList<User>();
	        Connection conn = SingeletonConnection.getConnection();
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from utili");
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                User user = new User();
	                user.setId(rs.getInt("id_utili"));
	                user.setEmail(rs.getString("email"));
	                user.setNom(rs.getString("nom"));
	                user.setPrenom(rs.getString("prenom"));
	                user.setPass(rs.getString("pass"));
	                user.setRole(rs.getInt("role"));
	                userList.add(user);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return userList;
	    }

	    @Override
	    public void saveUser(User user) {
	        Connection connection = SingeletonConnection.getConnection();
	        try {

	            String query = "INSERT INTO utili (nom,prenom,email,pass) VALUES (?,?,?,?)";
	            PreparedStatement ps = connection.prepareStatement(query);
	            ps.setString(1,user.getNom());
	            ps.setString(2,user.getPrenom());
	            ps.setString(3,user.getEmail());
	            ps.setString(4,user.getPass());
	            int resultSet = ps.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    
	    @Override
	    public void deleteUserById(int id) {
	        Connection connection = SingeletonConnection.getConnection();
	        try {

	            String query = "DELETE FROM utili WHERE id_utili = ?";
	            PreparedStatement ps = connection.prepareStatement(query);
	            ps.setInt(1,id);
	            int resultSet = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public User FindById(int id) {
	        User user = new User();
	        Connection conn = SingeletonConnection.getConnection();
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from utili where id_utili LIKE ?");
	            ps.setInt(1, id );
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	user.setId(rs.getInt("id_utili"));
	                user.setEmail(rs.getString("email"));
	                user.setNom(rs.getString("nom"));
	                user.setPrenom(rs.getString("prenom"));
	                user.setPass(rs.getString("pass"));
	                user.setRole(rs.getInt("role"));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return user;
	    }
}
