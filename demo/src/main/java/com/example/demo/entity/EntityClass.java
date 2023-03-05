package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "cart")
public class EntityClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "id")
	private int id;

	@Column(name = "food_name")
	private String food_name;
	
	@Column(name = "food_type")
	private String food_type;
	
	@Column(name = "food_image")
	private String food_image;
	
	@Column(name = "food_price")
	private int food_price;
	
	@Column(name = "food_quantity")
	private int food_quantity;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "user_id")
	 private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getFood_type() {
		return food_type;
	}

	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}

	public String getFood_image() {
		return food_image;
	}

	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}

	public int getFood_price() {
		return food_price;
	}

	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}

	public int getFood_quantity() {
		return food_quantity;
	}

	public void setFood_quantity(int food_quantity) {
		this.food_quantity = food_quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public EntityClass() {
	}

	public EntityClass(int id, String food_name, String food_type, String food_image, int food_price, int food_quantity,
			User user) {
		super();
		this.id = id;
		this.food_name = food_name;
		this.food_type = food_type;
		this.food_image = food_image;
		this.food_price = food_price;
		this.food_quantity = food_quantity;
		this.user = user;
	}

	
	
}
	