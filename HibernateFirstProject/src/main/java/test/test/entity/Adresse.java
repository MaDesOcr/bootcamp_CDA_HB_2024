package test.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Adresse {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adresse_id;
	
	private int number;
	private String street;
	private String city;
	
	@ManyToOne
	private User user;

	public Long getAdresse_id() {
		return adresse_id;
	}

	public void setAdresse_id(Long adresse_id) {
		this.adresse_id = adresse_id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Adresse [adresse_id=" + adresse_id + ", number=" + number + ", street=" + street + ", city=" + city
				+ "]";
	}
	
	
}
