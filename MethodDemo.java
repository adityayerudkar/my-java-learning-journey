
public class MethodDemo{
	public static void main(String[] args){
	
		System.out.println("main method started \n");
		sum();
		System.out.println("main method ended");
	}
	public static void sum(){
		int a = 1, b = 2;
		int sum = a + b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
		
	}
}