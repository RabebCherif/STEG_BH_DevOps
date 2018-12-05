package tn.com.steg.DIE_com.services;

import javax.ejb.Local;

import tn.com.steg.DIE_com.entities.User;
import tn.com.steg.DIE_com.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
