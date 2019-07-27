package com.atos.equens.worldline.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atos.equens.worldline.model.Message;
import com.atos.equens.worldline.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@RequestMapping(value = "/getallmessages", method = RequestMethod.GET)
	public List<Message> getAllMessages(){
		return messageService.getAllMessages();
	}
	
	@RequestMapping(
			value = "/addmessage", 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public Message addMessage(@RequestBody Message message){
		return messageService.addMessage(message);
	}
	
    @RequestMapping(
    		value = "/updatemessage", 
    		method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, 
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Message updateMessage(@RequestBody Message message) {
        return messageService.updateMessage(message);
    }
    
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Message> getMessageById(@PathVariable int  id){
		return messageService.getMessageById(id);
	}
	
	@RequestMapping(value = "/deleteallmessage", method = RequestMethod.DELETE)
	public void deleteAllMessage(){
		 messageService.deleteAllMessage();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMessageById(@PathVariable int  id){
		messageService.deleteMessageById(id);
	}

}
