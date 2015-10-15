/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylikelists;

/**
 *
 * @author samuraipanzer
 */
public class ArrayLikeLists {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	String message = "HI";
	String[] messages = {"hey", "bob"};
	System.out.println(messages[1]);
	int[] numbers = {1,2};
	boolean[] bulls = new boolean[10];
	bulls[0] = false;
	bulls[1] = true;
	bulls[2] = true;
	bulls[9] = false;
	for(int i = 3; i < 9; i++){
	  if(i % 6 == 0){
		bulls[i] = false;
	  }else{
		bulls[i] = true;
	  }
	}
	printArrayValues(bulls);
	
	EnergyDrink energyGrape = new EnergyDrink("GRApE", true, 64);
	
	EnergyDrink[] energyOranges = new EnergyDrink[5];
	for(int i = 0; i < 5; i++){
	  energyOranges[i] = new EnergyDrink("Energy Orange", true, 16);
	}
	
	Car[] crazyPaulsCars = new Car[5];
	
	for(int i=0; i < 5; i++){
	  EnergyDrink drink = new EnergyDrink("Rich Fat White Dude Drink", true, 4);
	  EnergyDrink[] drinks = {drink, drink};
	  crazyPaulsCars[i] = new Car("Ferarri", drinks);
	}
	
	printCrazyPaulsCarLot(crazyPaulsCars);
	int[] moreNumbers = {1,2,3,4,5};
	int num = moreNumbers[3];
  }
  
  public static void printCrazyPaulsCarLot(Car[] cars){
	for(int i = 0; i < 5; i++){
	  Car car = cars[i];
	  String make = car.getMake();
	  EnergyDrink[] drink = car.getCupholders();
	  System.out.println("Car: "+ i + " " + make + " with drinks\n " + car.whatsInTheCupholders());
	}
  }
  
  public static void printArrayValues(boolean[] array){
	for(int i = 0; i < 10; i++){
	  System.out.println(i + ": " + array[i]);
	}
  }
  
}
