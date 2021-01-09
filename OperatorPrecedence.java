
public class OperatorPrecedence {

	public static void main(String[]args) {
	int valA = 21;
	int valB = 6;
	int valC = 3;
	int valD = 1;
	
	int result1 = valA - valB /valC;         
	int result2 = (valA - valB) /valC;         //Precedence with parenthesis
	
	System.out.println(result1);
	System.out.println(result2);
	
	int  result3 = valA /valC *valD+valB;
	int  result4 = valA /(valC *(valD+valB)); //Nested parenthesis

	System.out.println(result3);
	System.out.println(result4);
	
	int result5 = (valA*valB)/valC+valD;
	System.out.println(result5);
   }
}
