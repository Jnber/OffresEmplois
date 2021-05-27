package dao;
import metier.Condidature;


import java.util.List;

public interface CondidatureDAO {
	public List<Condidature> findAll();
	public List<Condidature> findByName(String nom);
  
    
    
    public void saveCondidature(Condidature condidature);
    public void deleteCondidatureById (int id);
    
    public Condidature FindById(int id);
}
