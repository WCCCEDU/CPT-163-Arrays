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
public class Car {
  private String make;
  private EnergyDrink[] cupholders;

  public Car(String make, EnergyDrink[] cupholders) {
	this.make = make;
	this.cupholders = cupholders;
  }

  public String getMake() {
	return make;
  }

  public EnergyDrink[] getCupholders() {
	return this.cupholders;
  }
  
  public String whatsInTheCupholders(){
	String cupholderDrink = "";
	for(int i = 0; i < this.cupholders.length; i++){
	  EnergyDrink drink = this.cupholders[i];
	  cupholderDrink += drink.getName()+"\n";
	}
	return cupholderDrink;
  }
  
}
