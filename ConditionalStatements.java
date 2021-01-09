
public class ConditionalStatements {

	public static void main(String[] args) {
		
       int students = 150;
       int rooms = 4;
       
       if(students/rooms > 30) 
    	   System.out.println("Crowded");         
       else 
    	   System.out.println("Not crowded");
       
       if(students/rooms > 30) {
    	   System.out.println("Crowded");   
    	   System.out.println("Crowded");     
       }
       else {                                     //Block statement
    	   System.out.println("Not Crowded");   
    	   System.out.println("Not Crowded");   
       }
       
       System.out.println((5 > 3) && (8>5));
       System.out.println((5 > 3) && (8<5)); //true when both are true
       
       System.out.println((5 > 3) || (8>5)); //true even if one is true
       System.out.println((5 > 3) || (8<5));
	}
}
