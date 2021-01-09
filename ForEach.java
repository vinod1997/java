
public class ForEach {

	public static void main(String[] args) {
		
		int[] numbers = {3,6,5,9};
		int sum = 0;
		
		for(int number: numbers) {
			sum+=number;
		}
		System.out.println(sum);
		
		for(int number=0; number<=numbers.length;number++) {
			sum+=number;
		}
		System.out.println(sum);
		
		int [] leftVals = {10,20,30,40};
		int [] rightVals = {10,20,30,40};
		
		char[] opCode = {'a','b','c','d'};
		double [] results = new double [opCode.length];
 	}
}
