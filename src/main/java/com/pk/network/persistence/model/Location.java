package com.pk.network.persistence.model;

/*
 * TODO: Make Entity Class
 */
public class Location {
	
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String contactName;
	private String contactPhone;
	private String location;
	private String ipAddress;
	private String longitude;
	private String latitude;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Location [name=" + name + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", contactName="
				+ contactName + ", contactPhone=" + contactPhone
				+ ", location=" + location + ", ipAddress=" + ipAddress
				+ ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
	

}
