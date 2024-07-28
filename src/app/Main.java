package app;

public class Main {
    static int numSum;

    public static void main(String[] args) {

        int e = 1;
        int totalSum = 0;
        for (int a = 1; a <= 6; a++, e++) {
            numSum += a;
            totalSum += a;
            System.out.println(e + ") Num is: " + a + " sum is " + numSum);
        }
        System.out.println("-----------------------");

        System.out.println("Sum of numbers is " + totalSum);
    }
}
