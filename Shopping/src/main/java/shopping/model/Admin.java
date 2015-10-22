package shopping.model;

import java.io.Serializable;

import javax.persistence.Entity;
/***
 * 
 * @author skandar
 *
 */
@Entity
public class Admin extends User implements Serializable{
	
	private static final long serialVersionUID = -6762162980207739005L;
	
	private int adminLevel;
	
	/*
	 * Admin Construct
	 */
	public Admin() {
	}

	/*
	 * Admin another Construct
	 */
	public Admin(String login, String password, String email,int adminLevel) {
		super(login, password,email);
		this.setAdminLevel(adminLevel);
	}

	public int getAdminLevel() {
		return adminLevel;
	}

	public void setAdminLevel(int adminLevel) {
		this.adminLevel = adminLevel;
	}
	
	

}
