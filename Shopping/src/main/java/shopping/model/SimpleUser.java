package shopping.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class SimpleUser extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	public SimpleUser() {
	}
	
	public SimpleUser(String login, String password, String email) {
		super(login, password,email);
	}
	
	
	
	
}
