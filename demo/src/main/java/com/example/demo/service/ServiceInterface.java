 

package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DtoClass;

public interface ServiceInterface {
	
	List<DtoClass> getCartsByUserId(int user_id);

}
