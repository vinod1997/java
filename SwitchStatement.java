
public class SwitchStatement {

	public static void main(String[] args) {
		
		int valA = 12;
		int valB = 2;
		
		char option = 'b';
		
		switch(option) {
		case 'a' :
			System.out.println(valA+valB);             
			break;		
		case 'b' :
			System.out.println(valA-valB);
			break;
		case 'c' :
			System.out.println(valA*valB);
			break;
		case 'd' :
			System.out.println(valA/valB);
			break;
		default :
			System.out.println("Invalid");
			break;
		}
			
	}
}
