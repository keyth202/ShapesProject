

package projectwk4;

/**
 * Sphere.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a sphere and shows the volume
 */




public class Sphere extends ThreeDimensional{
    double results = 0;
  
   
    Sphere(double radius){
        super(radius);
        fileLoc ="./shapes/sphere.png";
        
    }
    
    double sphereVol(){
        return (4/3)*Math.PI*radius*radius*radius;
    }
    
     void showStats(){
        results = this.sphereVol();
        System.out.println(
        "The Sphere has a volume of "+ results);
    }

}
