package com.atos.equens.worldline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.equens.worldline.DAO.MessageDAO;
import com.atos.equens.worldline.model.Message;

@Service
public class MessageService {
	
	@Autowired
	MessageDAO messageDAO;
	
	public List<Message> getAllMessages(){
			return messageDAO.findAll();
	}
	
	public Message addMessage(Message message) {
		return messageDAO.save(message);
	}
	
	public Optional<Message> getMessageById(int Id) {
		return messageDAO.findById(Id);
	}
	
	public Message updateMessage(Message message) {
		return messageDAO.save(message);
	}
	
	public void deleteMessageById(int id) {
         messageDAO.deleteById(id);
    }
	
	public void deleteAllMessage() {
        messageDAO.deleteAll();
    }
	
}
