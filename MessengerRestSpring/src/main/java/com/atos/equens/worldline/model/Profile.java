package com.atos.equens.worldline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profile")
public class Profile {
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "ProfileName")
	private String profileName;
	
	public Profile() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param profileName
	 */
	public Profile(int id, String firstName, String lastName, String profileName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileName = profileName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}	
}
