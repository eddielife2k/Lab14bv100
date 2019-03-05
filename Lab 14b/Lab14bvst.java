// Lab14bvst.java
// This is one of the student starting files
// of the Lab14b lab assignment.
// This file tests all the classes together.
// and draws a train without proper OOP design.


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14bvst extends Applet
{
	public void paint(Graphics g)
	{
   //DO NOT USE THIS FILE FOR YOUR TESTING, USE EITHER THE v80 OR v100 VERSION.
   //THIS IS HERE TO SHOW THE PREVIOUS (AND POOR) DESIGN.
      ArrayList<RailCar> railCars = new ArrayList<RailCar>();
      railCars.add(new Locomotive(Color.blue,100,300));
      railCars.add(new PassengerCar(Color.gray,275,300));
      railCars.add(new PassengerCar(Color.gray,450,300));
      railCars.add(new PassengerCar(Color.gray,625,300));
      railCars.add(new FreightCar(Color.green,800,300));
      railCars.add(new FreightCar(Color.green,975,300));      
      railCars.add(new Caboose(Color.red,1150,300));
      
      for (RailCar railCar : railCars)
         railCar.drawCar(g);
	}
}
	