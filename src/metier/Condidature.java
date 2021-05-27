package metier;

import java.sql.Date;

public class Condidature {
	private String tel;
	private String datenaissence;
	private String ville;
	private String niveauEtude;
	private String niveauExp;
	private String  cv;
	private int id_offre;
	private int id_utili;
	private int id_condidat;
	
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDatenaissence() {
		return datenaissence;
	}
	public void setDatenaissence(String datenaissence) {
		this.datenaissence = datenaissence;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getNiveauEtude() {
		return niveauEtude;
	}
	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	public String getNiveauExp() {
		return niveauExp;
	}
	public void setNiveauExp(String niveauExp) {
		this.niveauExp = niveauExp;
	}
	public int getid_offre() {
		return id_offre;
	}
	public void setid_offre(int id) {
		this.id_offre = id;
	}
	public int getid_utili() {
		return id_utili;
	}
	public void setid_utili(int id) {
		this.id_utili = id;
	}
	
	
	
	public Condidature() {
		this.setCv("");
		this.datenaissence="";
		this.niveauEtude="";
		this.niveauExp="";
		this.tel="";
		this.ville="";
		this.id_offre=0;
		this.id_utili=0;
	}
	
	public Condidature(String c, String d, String ne, String exp , String t, String v ,int o, int u) {
		this.setCv(c);
		this.datenaissence=d;
		this.niveauEtude=ne;
		this.niveauExp=exp;
		this.tel=t;
		this.ville=v;
		this.id_offre=o;
		this.id_utili=u;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public int getId_condidat() {
		return id_condidat;
	}
	public void setId_condidat(int id_condidat) {
		this.id_condidat = id_condidat;
	}
}
