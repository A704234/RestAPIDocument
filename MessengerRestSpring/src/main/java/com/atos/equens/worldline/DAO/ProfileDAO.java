package com.atos.equens.worldline.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.equens.worldline.model.Profile;

@Repository
public interface ProfileDAO extends JpaRepository<Profile, Integer> {

}
