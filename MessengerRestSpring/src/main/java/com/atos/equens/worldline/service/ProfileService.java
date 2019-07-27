package com.atos.equens.worldline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.equens.worldline.DAO.ProfileDAO;
import com.atos.equens.worldline.model.Profile;

@Service
public class ProfileService {

	@Autowired
	ProfileDAO profileDAO;
	
	public List<Profile> getAllProfiles(){
		return profileDAO.findAll();
	}
	
	public Profile addProfile(Profile profile){
		return profileDAO.save(profile);
	}
	
	public Optional<Profile> getProfileById(int id) {
		return profileDAO.findById(id);
	}
	
	public Profile updateProfile(Profile profile){
		return profileDAO.save(profile);
	}
	
	public void deleteAllProfiles() {
		profileDAO.deleteAll();
	}
	
	public void deleteProfileById(int id) {
		profileDAO.deleteById(id);
	}
}
