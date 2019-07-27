package com.atos.equens.worldline.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atos.equens.worldline.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDAO extends JpaRepository<Message,Integer>{

}
