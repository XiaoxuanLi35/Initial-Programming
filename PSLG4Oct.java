import java.lang.Math;
public class PSLG4Oct {
    //int a = (int)(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    public static void main(String[] args) {
        double randomNum1 = (Math.random() * 51);
        System.out.println("num1 between 0-50: " + randomNum1);
        double randomNum2 = (Math.random() * 951 + 50);
        System.out.println("num2 between 50-1000: " + randomNum2);
        double randomNum3 = (Math.random() * 51 + 50);
        System.out.println("num3 between 50-100: " + randomNum3);
        double randomNum4 = (Math.random() * 51 + 50);
        System.out.println("num4 between 50-100: " + randomNum4);
        double randomNum5 = (Math.random() * 21 + 20);
        System.out.println("num5 between 20-40: " + randomNum5);
        double randomNum6 = (Math.random() * 21 + 20);
        System.out.println("num6 between 20-40: " + randomNum6);
        System.out.println("the smallest one among 5-6 is: " + Math.min(randomNum5, randomNum6));
        double randomNum7 = Math.random() ;
        System.out.println("num7 random range: " + randomNum7);
        double randomNum8 = Math.random() ;
        System.out.println("num8 random range: " + randomNum8);
        double randomNum9 = Math.random() ;
        System.out.println("num9 random range: " + randomNum9);

        System.out.println("the biggest one among 7-9 is: " + Math.max((Math.max(randomNum7, randomNum8)), randomNum9));

    }
}
