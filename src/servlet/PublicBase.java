package servlet;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PublicBase {
	private Connection con;
	public PublicBase(Connection co ) {
			this.con=co;
	}
	
	public String listOffres() throws SQLException {
		String ch="";
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("select * from offres");
		//System.out.println(rset.getString("login"));
		while (rset.next()) {
			
			ch+="<div class=\"owl-item\"><div class=\"recent_item\"><div class=\"recent_item_inner\"><div class=\"recent_item_image\"><img src=\"images/asma.jpg\" alt=\"\"><div class=\"tag_featured property_tag\"><a type=\"button\" class=\"btn btn-primary\" href=\"AddCondidature\">Postuler</a><div class=\"modal fade bd-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\"> <div class=\"modal-dialog modal-lg\"><div class=\"modal-content\">balbalbala</div></div></div></div></div><div class=\"recent_item_body text-center\"><div class=\"recent_item_location\">"+rset.getString("metier")+"</div><div class=\"recent_item_title\"><a href=\"property.html\">"+rset.getString("titre")+"</a></div><div class=\"recent_item_price\"></div></div><div class=\"recent_item_footer d-flex flex-row align-items-center justify-content-start\"><div><center>"+rset.getString("societe")+"</center><div class=\"recent_icon\"></div><span></span></div><div><div class=\"recent_icon\"></div><span></span></div><div><div class=\"recent_icon\"></div><span></span></div></div></div></div></div>";
			//ch+="<p>"+rset.getString("metier")+"</p>";
		}
		return ch;
	}
	public int nbredesoffres() throws SQLException {
		int cpt=0;
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("select * from offres");
		while (rset.next()) {
			cpt++;
		}
		return cpt;
	}
	public int nbremsg() throws SQLException {
		int cpt=0;
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("select * from msg");
		while (rset.next()) {
			cpt++;
		}
		return cpt;
	}
	public String listdesoffres() throws SQLException {
		String ch="";
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("select * from offres");
		//System.out.println(rset.getString("login"));
		while (rset.next()) {
			
			ch+="<div class=\"col-xl-4 col-lg-6 property_col\"><div class=\"property\"><div class=\"property_image\"><img src=\"images/asma.jpg\" alt=\"\"><div class=\"tag_featured property_tag\"><a href=\"#\">Featured</a></div></div><div class=\"property_body text-center\"><div class=\"property_location\">"+rset.getString("metier")+"</div><div class=\"property_title\"><a href=\"property.html\">"+rset.getString("titre")+"</a></div><div class=\"property_price\"></div></div><div class=\"property_footer d-flex flex-row align-items-center justify-content-start\"><div><div class=\"property_icon\"></div><span></span></div><div><div class=\"property_icon\"></div><span>"+rset.getString("societe")+"</span></div><div><div class=\"property_icon\"></div><span></span></div></div></div></div>";
		}
		return ch;
	}
	public String offreadmin() throws SQLException {
		
		String ch="";
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("select * from offres");
		//System.out.println(rset.getString("login"));
		while (rset.next()) {
			//ch+="<tbody id=\"myTable\"><tr><td>"+rset.getString("metier")+"</td><td>"+rset.getString("titre")+"</td><td>"+rset.getString("societe")+"</td><td>"+rset.getString("dateFin")+"</td><td>2011/04/25</td><td><button class=\"btn btn-danger\"><i class=\"fa fa-home\"></i> Delete</button><button class=\"btn btn-info\" data-toggle=\"modal\"data-target=\"#myModalNorm\"><i class=\"fa fa-home\"></i> Update</button><button class=\"btn btn-success\"><i class=\"fa fa-home\"></i> Terminate</button></td></tr></tbody>";
		//ch+="<p>asma</p>";
			ch+="<tbody id=\"myTable\"><tr><td>"+rset.getString("metier")+"</td><td>"+rset.getString("titre")+"</td><td>"+rset.getString("societe")+"</td><td>"+rset.getString("id_offre")+"</td><td><input type=\"submit\" class=\"btn btn-danger\" action=\"Suppadmim\" value=\"delete\" /> <button class=\"btn btn-info\" data-toggle=\"modal\"data-target=\"#myModalNorm\"> Update</button></td></tr></tbody>";
			
		}
		return ch;
	}
	public boolean ajouterutili(String nom,String prenom,String email,String tel,Date date,String ville,String niveauetude,String niveauexp,String cv ) throws SQLException {
		//Statement stmt = con.createStatement();
		//ResultSet rset = stmt.executeQuery("select * from offres");
		PreparedStatement pstmt = con.prepareStatement("insert into condidats (nom, prenom,email,tel,dateNaissence,ville,niveauEtude,niveauExp,cv) values (?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1, nom);
		pstmt.setString(2, prenom);
		pstmt.setString(3, email);
		pstmt.setString(4, tel);
		pstmt.setDate(5, date);
		pstmt.setString(6, ville);
		pstmt.setString(7,niveauetude);
		pstmt.setString(8, niveauexp);
		pstmt.setString(9, cv);
		return !pstmt.execute();

	}
	public boolean ajouteroffre(String metier,String titre,String societe,Date i,String descri ) throws SQLException {
		//Statement stmt = con.createStatement();
		//ResultSet rset = stmt.executeQuery("select * from offres");
		PreparedStatement pstmt = con.prepareStatement("insert into offres (metier,titre,societe,dateFin,description) values (?,?,?,?,?)");
		pstmt.setString(1, metier);
		pstmt.setString(2, titre);
		pstmt.setString(3, societe);
	
		pstmt.setDate(4, (Date) i);
		pstmt.setString(5, descri);
		
		return !pstmt.execute();

	}
	public String supprimeroffre(int k) throws SQLException {
		String sql = "delete from offres where id_offre=" + k;
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		return ("Record deleted successfully");
	}
}
