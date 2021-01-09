
public class PrefixPostfix {

	public static void main(String[] args) {
		preIncriment(2);
		postIncriment(4);
	}
	public static int preIncriment(int prefix) {
	
		++prefix ;
		System.out.println(prefix);
		return prefix;
	}
	public static int postIncriment(int postfix) {
		 postfix--;
		System.out.println(postfix);
		return postfix--;
	}
	

}
