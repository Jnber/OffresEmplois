package metier;


public class Contact {

	private int id_msg;
	private String email;
	private String sujet;
    private String msg;
    private int id_utili;

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getId_utili() {
		return id_utili;
	}

	public void setId_utili(int id_condidat) {
		this.id_utili = id_condidat;
	}

	public Contact() {
		this.id_utili=0;
		this.msg="";
		this.sujet="";
		
		
	}
	
	public Contact(int i,int u, String m, String s, String e) {
		this.email=e;
		this.id_msg=i;
		this.id_utili=u;
		this.msg=m;
		this.sujet=s;
		
		
	}

	public int getId_msg() {
		return id_msg;
	}

	public void setId_msg(int id_msg) {
		this.id_msg = id_msg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
