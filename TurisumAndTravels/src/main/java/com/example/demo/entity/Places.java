package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "places")
public class Places {
	@Id
	@Column(name = "placeid")
	private int placeId;
	@Column(name = "Placename")
	private String placeName;
	@Column(name = "Address")
	private String address;
	@Column(name = "Description")
	private String description;
	@Column(name = "image")
	private byte[] image;
	@Column(name = "statecode")
	private String statecode;

	/**
	 * 
	 */
	public Places() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param placeId
	 * @param placeName
	 * @param address
	 * @param description
	 * @param image
	 * @param statecode
	 */
	public Places(int placeId, String placeName, String address, String description, byte[] image, String statecode) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.address = address;
		this.description = description;
		this.image = image;
		this.statecode = statecode;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

}
