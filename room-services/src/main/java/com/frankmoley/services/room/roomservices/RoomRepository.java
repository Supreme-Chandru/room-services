package com.frankmoley.services.room.roomservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
	
	Room findByRoomNumber(String roomNumber);
}