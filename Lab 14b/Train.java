
import java.util.ArrayList;
import java.awt.*;
import java.applet.*;
public class Train
{
    private ArrayList<RailCar> t;
    private int x;
    private int y;
    public Train(int x, int y){
        this.x = x;
        this.y = y;
        t = new ArrayList<RailCar>();
    }
    public void addCar(String name, Color c){
        int xC = t.size();
        if(name.equals("Locomotive")){
           t.add(new Locomotive(c, xC, y));
        }
        if(name.equals("Passengercar")){
           t.add(new PassengerCar(c, xC, y));
        }
        if(name.equals("FreightCar")){
           t.add(new FreightCar(c, xC, y));
        }
        if(name.equals("Caboose")){
           t.add(new Caboose(c, xC, y));
        }
    }
    public void addCar(int index, String name, Color c){
        int xC = t.size();
        if(name.equals("Locomotive")){
           t.add(index, new Locomotive(c, xC, y));
        }
        if(name.equals("Passengercar")){
           t.add(index, new PassengerCar(c, xC, y));
        }
        if(name.equals("FreightCar")){
           t.add(index, new FreightCar(c, xC, y));
        }
        if(name.equals("Caboose")){
           t.add(index, new Caboose(c, xC, y));
        }
    }
}
