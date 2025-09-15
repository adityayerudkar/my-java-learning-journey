public class ControlState {
    public static void main(String[] args) {
        checkNumber(); // Calls the static method
    }

    static void checkNumber() {
        int no1 = 200;
        if (no1 <= 200) {
            System.out.println("\n" + no1 + " is under 2000");
        }
    }
}
