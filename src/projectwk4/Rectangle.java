
/**
 * Rectangle.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a rectangle and shows the area
 */
package projectwk4;

import javax.swing.JFrame;


public class Rectangle extends TwoDimensional{
    private double results = 0;
    private JFrame shapeframe;
    Rectangle(double l, double w){
        super(l,w);
        fileLoc ="./shapes/rectangle.png";
    }
    
     void showStats(){
        results = this.areaRec();
        System.out.println(
        "The rectangle has an area of "+ results);
    }

}
