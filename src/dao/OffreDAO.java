package dao;
import java.util.List;

import metier.Offre;

public interface OffreDAO {
	public List<Offre> findAll();
	public List<Offre> findByMetier(String metier);
    
    
    public void saveOffre(Offre offre);
    public void updateOffre(Offre offre);
    public void deleteOffreById (int id);
    
    public Offre FindById(int id);
}
