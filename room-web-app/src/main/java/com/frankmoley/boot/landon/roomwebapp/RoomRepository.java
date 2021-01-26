package com.frankmoley.boot.landon.roomwebapp;

//import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

	//ArrayList<Room> findAll();

}
