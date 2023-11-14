public class ForExercise {
    public static void main(String[] args) {
        //print integers from 1 to 100,
        //count the number of multiples of 9
        //print sum of these numbers
        int count = 0;
        int sum = 0;
        for(int i = 1; i < 100; i++){
            if(i % 9 == 0){
                System.out.printf("i = %d\n", i);
                count ++;
                sum += i;
            }
        }
        System.out.printf("count = %d\n", count);
        System.out.printf("sum = %d\n", sum);
    }
}
