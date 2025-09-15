public class Demo
{
  public static void main(String[] args)
  {
	  System.out.println("Main method is start..!");
	  int result = m1();
	  System.out.println("Result = " + result);
	  System.out.println("Main method is End..!");
  }
  
  public static int m1()
  {
	  System.out.println("m1 started!!");
	  System.out.println("m1 ended..!!");
	  return 10;
  }
}