
package projectwk4;

/**
 * Shape.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This abstract class houses the values and base constructors that all shapes 
 * that are two or 3 dimensional need to have. 
 */
import javax.swing.JFrame;

public abstract class Shape extends JFrame {
    double length;
    double width;
    double depth;
    double radius; 
    JFrame shapeFrame;
  
    //basic rectangular constructor
    Shape(double l, double w){
        this.length = l; 
        this.width = w;
        
    }
    //basic prism constructor
    Shape(double l, double w, double d){
        this.length = l;
        this.width = w;
        this.depth = d;
    }
    //basic circle consturctor
    Shape(double r){
        this.radius = r;
             
    }
    
    public void draw(){
        
    }

}
