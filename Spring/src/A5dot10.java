/**
 * 
 */

/**
 * @author Nate
 *
 */
public class A5dot10 {

	/**
	 * This program will output a table of numbers that a divisible by 5 and 6 between 100 and 1000
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      // how many possible numbers are divisible by 5 and 6
	  final int NUMBER_OF_NUMS = 30;
	  //how many numbers per line
      final int NUMBER_OF_NUMS_PER_LINE = 10;
      
      int count = 0;
      
      System.out.println("Numbers between 100 and 1000 divisible by 5 and 6 are \n");
      //repeatedly find numbers divisible by 5 and 6
      while (count < NUMBER_OF_NUMS) {
    	  
    	 
    	  
    	  
    	  
    	  //test whether number is divisible by 5 and 6
    	  for(int number = 100; number < 1000; number++) {
    		  //set boolean value for numbers divisible by 5 and 6
    		  boolean isNum = true;
    		  if(number % 5 == 0 && number % 6 == 0) {
    			  isNum = false; 
    			  
    			  
    			  
    			  if(!isNum){
            		  count++;
            		  
            		 if(count % NUMBER_OF_NUMS_PER_LINE == 0 )  {
            			 
            			 
            			 	System.out.println(number);
            		 }
            		 else
            			 System.out.print(number + " ");
            		 
            		number += number;  
            	  }  
    		  }
    		   
    		  
    		  
    	  }
    	   
    	  
    	  
    	  
    	  
    	  
      }
		
		
		
		
	}

}
