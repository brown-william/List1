/**
 * 
 */
package week9;

/**
 * @author Nate
 *
 */
public class MyPoint {

	
	    private double x;
	    private double y;
	    
	    MyPoint() {
	    	x = 0;
	    	y = 0;
	    }
	    
	    MyPoint(double x, double y){
	    	this.x = x;
	    	this.y = y;
	    }
	    
	    double getX() {
	    	return x;
	    }
	    
	    double getY() {
	    	return y;
	    }
	    
	    public double distance(MyPoint pointB){
	    	
	      
	    	return Math.sqrt(Math.pow(pointB.getX()-x, 2) + Math.pow(pointB.getY()-y, 2));
	    	
	    	
	    }
	   public double distance(double X, double Y) {
		  
		   
		   return Math.sqrt(Math.pow(X - this.x, 2) + Math.pow(Y - this.y, 2));
		   
	   }
	   
	   public static double distance(MyPoint A, MyPoint B)  {
		  
		   
		   
		   return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
		   
		   
		  
	   }
	   
	   
	   
}
