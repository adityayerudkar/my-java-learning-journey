package Operations.Methods;

class Calculator  {
public int add(int n1, int n2) {
    int result = n1 + n2;
    return result;
}
}

public class Calculators {
   public static void main(String[] args) {


      Calculator obj = new Calculator();
      int r1 = obj.add(3,5);

      System.out.println(r1);
   }    
}


