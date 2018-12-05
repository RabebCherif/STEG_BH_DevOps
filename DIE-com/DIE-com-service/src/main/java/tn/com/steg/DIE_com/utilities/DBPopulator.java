package tn.com.steg.DIE_com.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.com.steg.DIE_com.entities.User;
import tn.com.steg.DIE_com.services.UserServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	@EJB
	private UserServiceLocal userServiceLocal;

	public DBPopulator() {
	}

	@PostConstruct
	public void init() {
		User user = new User("user", "u", "u", "user@bitbox.tn");

		userServiceLocal.update(user);
	}
}
