import java.util.*;
import java.io.*;

public class pr166 {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(new File("pr166.dat"));
        int n = in.nextInt();
        in.nextLine();
        while(n-- > 0){
            String binary = in.nextLine();
            System.out.println("A: " + Integer.parseInt(binary.substring(0, 8), 2));
            System.out.println("R: " + Integer.parseInt(binary.substring(8, 16), 2));
            System.out.println("G: " + Integer.parseInt(binary.substring(16, 24), 2));
            System.out.println("B: " + Integer.parseInt(binary.substring(24, 32), 2));
            System.out.println();
        }
    }
}
