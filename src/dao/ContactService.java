package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Contact;
import metier.Offre;

public class ContactService implements ContactDAO {

	@Override
	public List<Contact> findAll() {
		List<Contact> offreList = new ArrayList<Contact>();
		 Connection conn = SingeletonConnection.getConnection();
		 System.out.println("step connection");
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from `msg`");
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Contact p = new Contact();
	                p.setId_msg(rs.getInt("ID_msg"));
	                p.setEmail(rs.getString("email"));
	                p.setSujet(rs.getString("sujet"));
	                p.setMsg(rs.getString("msg"));
	                p.setId_utili(rs.getInt("id_utilisateur"));
	                offreList.add(p);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return offreList;
	}

	@Override
	public void saveContact(Contact contact) {
		Connection connection = SingeletonConnection.getConnection();
        try {

            String query = "INSERT INTO msg(email,sujet,msg,id_utilisateur) VALUES (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,contact.getEmail());
            ps.setString(2,contact.getSujet());
            ps.setString(3,contact.getMsg());
            ps.setInt(4,contact.getId_utili());
            int resultSet = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void deleteContactById(int id) {
		 Connection connection = SingeletonConnection.getConnection();
	        try {

	            String query = "DELETE FROM msg WHERE id_msg = ?";
	            PreparedStatement ps = connection.prepareStatement(query);
	            ps.setInt(1,id);
	            int resultSet = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public List<Contact> findAll(String email) {
		List<Contact> offreList = new ArrayList<Contact>();
		 Connection conn = SingeletonConnection.getConnection();
		 System.out.println("step connection");
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from `msg` where email like ?");
	            ps.setString(1, email);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Contact p = new Contact();
	                p.setId_msg(rs.getInt("ID_msg"));
	                p.setEmail(rs.getString("email"));
	                p.setSujet(rs.getString("sujet"));
	                p.setMsg(rs.getString("msg"));
	                p.setId_utili(rs.getInt("id_utilisateur"));
	                offreList.add(p);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return offreList;
	}

}
