package week1;

import java.util.Arrays;

public class FirstExercise {

    public static void main(String[] args) {
   //     System.out.print(Arrays.asList(args) + "\n"); //TODO


        Integer cm = Integer.valueOf(args[0]);
        int mm = cm * 10;
        System.out.printf("It is %s mm", mm);


//        for (String arg : args) {
//            Integer integer = Integer.valueOf(arg);
//            int i = integer * 10;
//            System.out.printf("Hello, %s!\n", i);
    }
}
