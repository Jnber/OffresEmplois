package dao;

import java.util.List;

import metier.User;

public interface UserDAO {
	public List<User> findAll();
	public User login(String email, String pass);
    
    
    public void saveUser(User user);
    public void deleteUserById (int id);
    
    public User FindById(int id);
}
