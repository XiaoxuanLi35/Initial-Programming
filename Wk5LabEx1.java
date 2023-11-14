

public class Wk5LabEx1 {
    public static void main(String[] args) {
        int a, b, c, min, max, temp;
        double avg, y;

        // The following code assigns random values
        // to the variables a, b and c
        a = (int) (Math.random() * 100 + 1);
        b = (int) (Math.random() * 100 + 1);
        c = (int) (Math.random() * 100 + 1);


        if (a >= b) {
            min = b;
            if (b >= c) {
                min = c;
            }
        } else {
            min = a;
            if (a >= c) {
                min = c;
            }
        }
        System.out.printf("a is: %d, b is: %d, c is: %d, The minimum is: %d", a, b, c, min);
    }
}