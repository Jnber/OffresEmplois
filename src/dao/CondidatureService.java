package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Condidature;
import metier.Offre;

public class CondidatureService implements CondidatureDAO{

	@Override
	public List<Condidature> findAll() {
		List<Condidature> offreList = new ArrayList<Condidature>();
		 Connection conn = SingeletonConnection.getConnection();
		 System.out.println("step connection");
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from `condidats`");
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Condidature p = new Condidature();
	                p.setid_offre(rs.getInt("id_offre"));
	                p.setid_utili(rs.getInt("id_utili"));
	                p.setNiveauEtude(rs.getString("NiveauEtude"));
	                p.setNiveauExp(rs.getString("NiveauExp"));
	                p.setDatenaissence(rs.getString("dateNaissence"));
	                p.setTel(rs.getString("tel"));
	                p.setVille(rs.getString("ville"));
	                p.setCv(rs.getString("cv"));
	                p.setId_condidat(rs.getInt("id_condidat"));
	                offreList.add(p);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return offreList;
	}

	@Override
	public List<Condidature> findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCondidature(Condidature condidature) {
        Connection connection = SingeletonConnection.getConnection();
        System.out.println("got connection");
        try {

            String query = "INSERT INTO condidats(tel,dateNaissence,ville,niveauEtude,niveauExp,cv,id_offre,id_utili) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            System.out.println("got pprep statement");
            ps.setString(1,condidature.getTel());
            ps.setString(2,condidature.getDatenaissence());
            ps.setString(3,condidature.getVille());
            ps.setString(4,condidature.getNiveauEtude());
            ps.setString(5, condidature.getNiveauExp());
            ps.setString(6,condidature.getCv());
            ps.setInt(7,condidature.getid_offre());
            ps.setInt(8, condidature.getid_utili());
            int resultSet = ps.executeUpdate();
            System.out.println("exec");

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void deleteCondidatureById(int id) {
		Connection connection = SingeletonConnection.getConnection();
        try {

            String query = "DELETE FROM condidats WHERE ID_condidat = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,id);
            int resultSet = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public Condidature FindById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
