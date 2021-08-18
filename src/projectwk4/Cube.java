

package projectwk4;

/**
 * Cube.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a cube and shows the volume
 */
public class Cube extends ThreeDimensional {
    
    double results = 0; 
    
    Cube(double l, double w, double d){
        super(l,w,d);
        fileLoc ="./shapes/cube.jpg";
    }
    
    void showStats(){
        results = this.volPrism();
        System.out.println(
        "The Cube has a volume of "+ results);
    }
 }
