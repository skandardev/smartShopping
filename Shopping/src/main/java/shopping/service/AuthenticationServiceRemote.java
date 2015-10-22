package shopping.service;

import java.util.List;

import javax.ejb.Remote;

import shopping.model.User;



@Remote
public interface AuthenticationServiceRemote {
	void createUser(User user);
	List<User> findAllUsers();
	User authenticate(String login, String password);
	boolean register(String login, String password, String email);
}
