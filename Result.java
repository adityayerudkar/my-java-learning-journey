public class Result {
    public static void main(String[] args) {
        Result r = new Result(); 
        r.max(); 
    }

    public void max() {
        int no1 = 3, no2 = 5;  
        System.out.println("\nGiven numbers: " + no1 + " & " + no2);

       
        System.out.println((no1 > no2) ? ("\n" + no1 + " is max") : ("\n" + no2 + " is max"));
    }
}
