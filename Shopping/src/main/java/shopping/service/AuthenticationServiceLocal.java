package shopping.service;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import shopping.model.User;

@Local
@Path("/webservice")
public interface AuthenticationServiceLocal {
	void createUser(User user);

	List<User> findAllUsers();

	@GET
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	User authenticate(@QueryParam("login") String login,
			@QueryParam("password") String password);

	boolean loginExists(String login);

	@GET
	@Path("/register")
	@Produces(MediaType.TEXT_PLAIN)
	boolean register(@QueryParam("login") String login,
			@QueryParam("password") String password,
			@QueryParam("email") String email);
}
