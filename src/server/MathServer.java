package server;
import java.util.*;

public class MathServer {

    public static final int MATH_PORT = 8260;

    public static void main(String[] args) {
    // finish this

        String numbers = "abc";
        try {
            String[] items = numbers.split(" ");
            Arrays.toString(items);
            int num1 = Integer.parseInt(items[0]);
            int num2 = Integer.parseInt(items[1]);
            // calculate and send back results
        }catch(Exception e){
            System.out.println("Math protocol error "+e.getMessage());
        }
    }
}
