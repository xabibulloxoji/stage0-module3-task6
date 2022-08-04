package lang.print.gaps.task6;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = 13;
        int d = 15;

        // use post-increment operator in the mathematical expression  
        int x =   a   + b +   c   + d;
        System.out.println("Expected x is 40, x = " + (x - 1));
        // print the updated value of a, b, c, and d  
        System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + c + " " +
                "and d = " + d);

    }
}
