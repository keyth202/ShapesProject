
/**
 * Square.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a square and shows the area
 */
package projectwk4;

import javax.swing.JFrame;


public class Square extends TwoDimensional{
    private double results = 0;
    private JFrame shapeframe;
    Square(double l, double w){
        super(l,w);
        fileLoc ="./shapes/square.jpg";
    }
    
     void showStats(){
        results = this.areaRec();
        System.out.println(
        "The square has an area of "+ results);
    }
}
