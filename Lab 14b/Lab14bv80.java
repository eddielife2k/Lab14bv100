// Lab14bv80.java
// 02-24-15 by Leon Schram
// This is the provided testing file for the Lab14Bv80 assignment.


import java.awt.*;
import java.applet.*;


public class Lab14bv80 extends Applet
{
	public void paint(Graphics g)
	{
      Train train = new Train(g, 100,300);
      train.addCar(g, "Locomotive",Color.blue);
      train.addCar(g, "PassengerCar",Color.gray);
      train.addCar(g, "PassengerCar",Color.gray);
      train.addCar(g, "FreightCar",Color.green);
      train.addCar(g, "PassengerCar",Color.gray);
      train.addCar(g, "FreightCar",Color.green);
      train.addCar(g, "Caboose",Color.red);
      train.addCar(g, "FreightCar",Color.green);
      train.showCars(g);
	}
}

