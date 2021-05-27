package metier;


public class Offre {
	private int Id;
	private String metier;
	private String titer;
	private String societe;
	private String date;
	private String descri;
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	public String getTiter() {
		return titer;
	}
	public void setTiter(String titer) {
		this.titer = titer;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	
	public Offre()  {
		this.date="";
		this.descri="";
		this.metier="";
		this.societe="";
		this.titer="";
		
	}
	public Offre(int i,String d, String desc, String m, String s, String t ) {
		this.date=d;
		this.descri=desc;
		this.metier=m;
		this.societe=s;
		this.titer=t;
		this.Id=i;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

}
