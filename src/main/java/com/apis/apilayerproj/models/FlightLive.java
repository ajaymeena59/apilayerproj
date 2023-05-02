package com.apis.apilayerproj.models;

public class FlightLive {

	private String updated;
	private int latitude; 
	private int longitude;
	private int altitude;
	private int direction;
	private int speed_horizontal;
	private int speed_vertical;
	private boolean is_ground;
	
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getSpeed_horizontal() {
		return speed_horizontal;
	}
	public void setSpeed_horizontal(int speed_horizontal) {
		this.speed_horizontal = speed_horizontal;
	}
	public int getSpeed_vertical() {
		return speed_vertical;
	}
	public void setSpeed_vertical(int speed_vertical) {
		this.speed_vertical = speed_vertical;
	}
	public boolean getIs_ground() {
		return is_ground;
	}
	public void setIs_ground(boolean is_ground) {
		this.is_ground = is_ground;
	}
	@Override
	public String toString() {
		return "Live [updated=" + updated + ", latitude=" + latitude + ", longitude=" + longitude + ", altitude="
				+ altitude + ", direction=" + direction + ", speed_horizontal=" + speed_horizontal + ", speed_vertical="
				+ speed_vertical + ", is_ground=" + is_ground + "]";
	}

	
}
