/**
 * Triangle.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a triangle and shows the volume
 */
package projectwk4;

import javax.swing.JFrame;


public class Triangle extends TwoDimensional{
    private double results = 0;
    private JFrame shapeframe;
    //using the two doubles length and width as base and height in the area formula
    Triangle(double l, double w){
        super(l,w);
        fileLoc ="./shapes/triangle.jpg";
    }
    
     void showStats(){
        results = this.areaRec()/2;
        System.out.println(
        "The triangle has an area of "+ results);
    }

}
