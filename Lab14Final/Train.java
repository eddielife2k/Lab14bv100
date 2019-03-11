

import java.util.ArrayList;
import java.awt.*;
import java.applet.*;
public class Train
{
    private ArrayList<RailCar> t;
    private int x;
    private int y;
    private int xC;
    public Train(int x, int y){
        this.x = x;
        this.y = y;
        this.xC = x;
        t = new ArrayList<RailCar>();
    }
    public void addCar(String name, Color c){
        if(name.equals("Locomotive")){
           t.add(new Locomotive(c, xC, y));
        }
        if(name.equals("PassengerCar")){
           t.add(new PassengerCar(c, xC, y));
        }
        if(name.equals("FreightCar")){
           t.add(new FreightCar(c, xC, y));
        }
        if(name.equals("Caboose")){
           t.add(new Caboose(c, xC, y));
        }
        xC += 175;
    }
    public void addCar(int index, String name, Color c){
        
        if(name.equals("Locomotive")){
           t.add(index, new Locomotive(c, x + 175 * index, y));
        }
        if(name.equals("PassengerCar")){
           t.add(index, new PassengerCar(c, x + 175 * index, y));
        }
        if(name.equals("FreightCar")){
           t.add(index, new FreightCar(c, x + 175 * index, y));
        }
        if(name.equals("Caboose")){
           t.add(index, new Caboose(c, x + 175 * index, y));
        }
        for( int k = index + 1; k < t.size(); k++ ) {
          t.get(k).setXPosition(t.get(k).getXPosition() + 175);
        }
    }
    public void showCars(Graphics g) {
        for(RailCar rC: t) {
            rC.drawCar(g);
        }
    }
}
