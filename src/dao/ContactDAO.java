package dao;

import java.util.List;

import metier.Contact;

public interface ContactDAO {
	public List<Contact> findAll();
	public List<Contact> findAll(String email);
    public void saveContact(Contact contact);
    public void deleteContactById (int id);
    

}
