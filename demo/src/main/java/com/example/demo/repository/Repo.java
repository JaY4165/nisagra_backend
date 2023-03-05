package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.EntityClass;


@Repository
public interface Repo extends JpaRepository<EntityClass, Integer>{
	
	List<EntityClass> getCartsByUserId(int user_id);
	
}