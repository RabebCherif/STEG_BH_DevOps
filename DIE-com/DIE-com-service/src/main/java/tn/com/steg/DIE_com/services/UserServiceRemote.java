package tn.com.steg.DIE_com.services;

import javax.ejb.Remote;

import tn.com.steg.DIE_com.entities.User;
import tn.com.steg.DIE_com.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
