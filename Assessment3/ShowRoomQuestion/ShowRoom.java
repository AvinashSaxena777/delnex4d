package delnex4d;

import java.util.ArrayList;

public class ShowRoom {
	private String name;
	private ArrayList<Car> cars;
	public ShowRoom() {
		
	}
	public ShowRoom(String name, ArrayList<Car> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", cars=" + cars + "]";
	}
	
}
