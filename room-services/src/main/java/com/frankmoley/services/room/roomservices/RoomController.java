package com.frankmoley.services.room.roomservices;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/rooms")
public class RoomController {

	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> findAll(@RequestParam(name="roomNumber", required = false)String roomNumber){
		if(StringUtils.isNotEmpty(roomNumber)){
			return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
		}
		return (List<Room>)this.roomRepository.findAll();
		
	}
}
