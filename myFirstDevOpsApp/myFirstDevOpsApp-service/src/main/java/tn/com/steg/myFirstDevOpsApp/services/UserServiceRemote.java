package tn.com.steg.myFirstDevOpsApp.services;

import javax.ejb.Remote;

import tn.com.steg.myFirstDevOpsApp.entities.User;
import tn.com.steg.myFirstDevOpsApp.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
