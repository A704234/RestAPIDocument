package com.atos.equens.worldline.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atos.equens.worldline.model.Profile;
import com.atos.equens.worldline.service.ProfileService;

@Controller
@RequestMapping("/profiles")
public class ProfileController {

		@Autowired
		ProfileService profileService;
		
		@RequestMapping(value = "/getallprofiles", method = RequestMethod.GET)
		public List<Profile> getAllProfiles(){
			return profileService.getAllProfiles();
		}
		
		@RequestMapping(
				value = "/addprofile", 
				method = RequestMethod.POST, 
				consumes = MediaType.APPLICATION_JSON_VALUE, 
				produces = MediaType.APPLICATION_JSON_VALUE
		)
		public Profile addProfile(@RequestBody Profile profile){
			return profileService.addProfile(profile);
		}
		
	    @RequestMapping(
	    		value = "/updateprofile", 
	    		method = RequestMethod.PUT,
	            consumes = MediaType.APPLICATION_JSON_VALUE, 
	            produces = MediaType.APPLICATION_JSON_VALUE
	    )
	    public Profile updateProfile(@RequestBody Profile profile) {
	        return profileService.updateProfile(profile);
	    }
	    
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public Optional<Profile> getProfileById(@PathVariable int  id){
			return profileService.getProfileById(id);
		}
		
		@RequestMapping(value = "/deleteallprofile", method = RequestMethod.DELETE)
		public void deleteAllProfile(){
			profileService.deleteAllProfiles();
		}

		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public void deleteProfileById(@PathVariable int  id){
			profileService.deleteProfileById(id);
		}

}
