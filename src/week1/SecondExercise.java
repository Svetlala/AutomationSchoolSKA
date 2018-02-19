package week1;

import java.util.Arrays;

public class SecondExercise {
    public static void main(String[] args) {
        {
            System.out.print(Arrays.asList(args) + "\n"); //TODO


            Integer amount = Integer.valueOf(args[0]);
            if ((amount % 2) == 0)

                System.out.printf("Odd");
            else
                System.out.printf("Even");



        }
    }
}
