package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DtoClass;
import com.example.demo.entity.EntityClass;
import com.example.demo.repository.Repo;





@Service
public class ServiceImplement implements ServiceInterface{
	
	@Autowired
	Repo repo;


	@Override
	 public List<DtoClass> getCartsByUserId(int user_id) {
        List<EntityClass> carts = repo.getCartsByUserId(user_id);
        List<DtoClass> cartDTOs = new ArrayList<>();
        for (EntityClass cart : carts) {
        	DtoClass cartDTO = new DtoClass();
            cartDTO.setId(cart.getId());
            cartDTO.setFood_name(cart.getFood_name());
            cartDTO.setFood_type(cart.getFood_type());
            cartDTO.setFood_image(cart.getFood_image());
            cartDTO.setFood_price(cart.getFood_price());
            cartDTO.setFood_quantity(cart.getFood_quantity());
            cartDTOs.add(cartDTO);
        }
        return cartDTOs;
    }
}
