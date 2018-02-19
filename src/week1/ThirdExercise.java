package week1;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class ThirdExercise {
    public static void main(String[] args) {

                {
                    System.out.print(Arrays.asList(args)); //TODO

  Integer amount = Integer.valueOf(args[0]);
                    double x = Math.pow(amount, 1.0/3.0);
                    System.out.printf("x: %.3f", x);
                    if (x%1 == 0)

                        System.out.printf("\n" + "Cubic Number");
                    else
                        System.out.printf("\n" + "Not cubic number");



                }
            }
        }
