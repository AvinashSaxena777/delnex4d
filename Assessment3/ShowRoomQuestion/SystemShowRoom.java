package delnex4d;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class SystemShowRoom {

	public static void main(String[] args) {
		ShowRoom sh1 = new ShowRoom();
		sh1.setName("Vaibhav Car Motors");
		
		Car carvar1 = new Car("Swift","White",420000.0);
		Car carvar2 = new Car("Baleno", "Red", 650000.45);
		
		ArrayList<Car> car1= new ArrayList<>();
		car1.add(carvar1);
		car1.add(carvar2);
		sh1.setCars(car1);
		
		ShowRoom sh2 = new ShowRoom();
		sh2.setName("Honda Motors");
		
		Car carvar3 = new Car("Innova","White",450000.0);
		Car carvar4 = new Car("Mercedes", "Red", 1250000.45);
		
		ArrayList<Car> car2= new ArrayList<>();
		car2.add(carvar3);
		car2.add(carvar4);
		sh2.setCars(car2);
		
		HashMap<String, ShowRoom> hashmap = new HashMap<>();
		hashmap.put(sh1.getName(),sh1);
		hashmap.put(sh2.getName(),sh2);
		//----------------------
		
		
		String inputName = "Honda Motors";
		
			ShowRoom sh = hashmap.get(inputName);
			System.out.println(sh.getName());
			ArrayList<Car> carlist = sh.getCars();
			for(Car car: carlist) {
				System.out.println("Car Name: "+car.getName()+", Colour: "+car.getColour() +", Price: "+car.getPrice());
			}
		
	}

}
