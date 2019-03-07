import java.util.ArrayList;
import java.awt.*;
import java.applet.*;
public class Train
{
    private ArrayList<RailCar> t;
    private int x;
    private int y;
    public Train(Graphics g, int x, int y){
        this.x = x;
        this.y = y;
    }
    public void addCar(Graphics g, String name, Color c){
        int xC = t.size
        if(name.equals("Locomotive")){
            RailCar loc = new Locomotive(c, xC, y);
            t.add(loc);
            
        }
        else if(name.equals("Passengercar")){
            RailCar pas = new PassengerCar(c);
            t.add(pas);
            
        }
        else if(name.equals("FreightCar")){
            RailCar frt = new FreightCar(c);
            t.add(frt);
            
        }
        else if(name.equals("Caboose")){
            RailCar cab = new Caboose(c);
            t.add(cab);
            
        }
    }
}
