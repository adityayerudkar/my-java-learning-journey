class WhileLoopDemo {
    public static void main(String[] args) {
        getFactorial(5); 
    }


    public static void getFactorial(int no) {
        int i = 1;
        int fact = 1; 

        while (i <= no) {  
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + no + " is: " + fact);
    }
}
