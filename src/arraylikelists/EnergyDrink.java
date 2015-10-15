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
public class EnergyDrink {
  private String name;
  private boolean wowza;
  private double ounces;

  public EnergyDrink(String name, boolean wowza, double ounces) {
	this.name = name;
	this.wowza = wowza;
	this.ounces = ounces;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public boolean isWowza() {
	return wowza;
  }

  public void setWowza(boolean wowza) {
	this.wowza = wowza;
  }

  public double getOunces() {
	return ounces;
  }

  public void setOunces(double ounces) {
	this.ounces = ounces;
  }
}
