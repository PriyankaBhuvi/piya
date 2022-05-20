package com.vstl.loops;

public class JavaLoops {

	//for loop-it will execute infinitely :
	
	public void findArrayDataUsingForLoop() {
		
		String strArray[] = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		
	for(int intIndex =0;intIndex<strArray.length;)  {
		 System.out.println("Array data : "+strArray[intIndex]);
		
		if(strArray[intIndex].equals("mon"))  {
			   System.out.println("Mon is present : "+strArray[intIndex]);
			 
			   
		}   
			   
		   }   

	}
	
	//for loop
   public void findArrayDataForLoop() {
	
	String strArray[] = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
	
    for(int intIndex =0;intIndex<3;intIndex++)  {
	 System.out.println("Array data : "+strArray[intIndex]);
	 
    }
          
       }
       
  // while loop :
    public void belgaumDistCollegesName()  {
  	  String strArray[] = {"Shivanand College", "Kle College", "Bk college", "St Jhons College","St Martas College"};
  	   int intCounter=0;
  	   
  	   
		while(strArray.length>intCounter) {
			System.out.println("Array CollegesNames : "+strArray[intCounter]);
			
			
			if (strArray[intCounter].equals("Shivanand College ")) {
				  System.out.println("Display the Shivanand College"); 
				  break;
			}			  
			 
    }
    }   
    
    //while loop:it will execute infinitely :
    public void belgaumCollegesName()  {
    	  String strArray[] = {"Shivanand College", "Kle College", "Bk college", "St Jhons College","St Martas College"};
    	   int intCounter=0;
    	   
    	   
  		while(strArray.length>intCounter) {
  			System.out.println("Array CollegesNames : "+strArray[intCounter]);
  			
  			if (strArray[intCounter].equals("Shivanand College ")) {
				  System.out.println("Display the Shivanand College"); 
				  break;
			}			  
			 intCounter++;
  }
  		
  		}
  		
    
 	   // do while loop :

     public void numberOfschoolsInBelgaumDist()  {
    	 
    	 int intSchools= 30;
    	 
    	 do {
    		 System.out.println("Total Number of Schools  :"+intSchools);
    		 
    	 }
    	 
    		 while(intSchools<15) ;
    	 
     }
     

 //do while loop :Its having error but it execute,as one time exception .
     public void collegeNamesInBelgaum() {

         int intNum = 5;
          do {
               System.out.println("The totall number of the college:"+intNum);
               intNum++;
             }
         while(intNum>15);
            }
    
}


     
    
    	     
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      
				  
				  
				  
				  
				  
				  
			
			
			
			
			
	
       		   
    	   
  
	
	


