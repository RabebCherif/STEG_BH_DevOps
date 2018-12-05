package tn.com.steg.myFirstDevOpsApp.services;

import javax.ejb.Local;

import tn.com.steg.myFirstDevOpsApp.entities.User;
import tn.com.steg.myFirstDevOpsApp.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
