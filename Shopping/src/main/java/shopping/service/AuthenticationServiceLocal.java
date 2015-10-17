package shopping.service;

import java.util.List;

import javax.ejb.Local;

import shopping.model.User;

@Local
public interface AuthenticationServiceLocal {
	void createUser(User user);
	List<User> findAllUsers();
	User authenticate(String login, String password);
	boolean loginExists(String login);
}
