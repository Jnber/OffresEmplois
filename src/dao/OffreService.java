package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.Offre;

public class OffreService implements OffreDAO {
	@Override
	public List<Offre> findAll(){
		List<Offre> offreList = new ArrayList<Offre>();
		 Connection conn = SingeletonConnection.getConnection();
		 System.out.println("step connection");
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from `offres`");
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Offre p = new Offre();
	                p.setId(rs.getInt("id_offre"));
	                p.setMetier(rs.getString("metier"));
	                p.setTiter(rs.getString("titre"));
	                p.setSociete(rs.getString("societe"));
	                p.setDate(rs.getString("dateFin"));
	                p.setDescri(rs.getString("description"));
	                offreList.add(p);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return offreList;
	}
	
	@Override
	public List<Offre> findByMetier(String metier){
		List<Offre> offreList = new ArrayList<Offre>();
		 Connection conn = SingeletonConnection.getConnection();
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from offres where metier like ?");
	            ps.setString(1,metier);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Offre p = new Offre();
	                p.setMetier(rs.getString("metier"));
	                p.setTiter(rs.getString("titre"));
	                p.setSociete(rs.getString("societe"));
	                p.setDate(rs.getString("dateFin"));
	                p.setDescri(rs.getString("description"));
	                offreList.add(p);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return offreList;
	}
	
	@Override
    public void saveOffre(Offre offre) {
        Connection connection = SingeletonConnection.getConnection();
        System.out.println("got connection");
        try {

            String query = "INSERT INTO offres(metier,titre,societe,dateFin,description) values (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            System.out.println("got pprep statement");
            ps.setString(1,offre.getMetier());
            ps.setString(2,offre.getTiter());
            ps.setString(3,offre.getSociete());
            ps.setString(4,offre.getDate());
            ps.setString(5, offre.getDescri());
            int resultSet = ps.executeUpdate();
            System.out.println("exec");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	@Override
    public void updateOffre(Offre offre) {
        System.out.println("id : "+offre.getId());
        Connection connection = SingeletonConnection.getConnection();
        try {

            String query = "UPDATE Offres\n" +
                    "SET  metier= ? , titre = ? ,societe = ?, dateFin = ? , description = ? \n" +
                    "WHERE id_offre = ?;";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,offre.getMetier());
            ps.setString(2,offre.getTiter());
            ps.setString(3,offre.getSociete());
            ps.setString(4,offre.getDate());
            ps.setString(5, offre.getDescri());
            ps.setInt(6, offre.getId());
            int resultSet = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	 @Override
	    public void deleteOffreById(int id) {
	        Connection connection = SingeletonConnection.getConnection();
	        try {

	            String query = "DELETE FROM Offres WHERE ID_offre = ?";
	            PreparedStatement ps = connection.prepareStatement(query);
	            ps.setInt(1,id);
	            int resultSet = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	 @Override
	    public Offre FindById(int id) {
	        Offre offre = new Offre();
	        Connection conn = SingeletonConnection.getConnection();
	        try {
	            PreparedStatement ps = conn.prepareStatement("select * from Offres where id LIKE ?");
	            ps.setInt(1, id );
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                offre.setId(rs.getInt("id_offre"));
	                offre.setMetier(rs.getString("metier"));
	                offre.setTiter(rs.getString("titre"));
	                offre.setSociete(rs.getString("societe"));
	                offre.setDate(rs.getString("dateFin"));
	                offre.setDescri(rs.getString("description"));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return offre;
	    }
	
}
