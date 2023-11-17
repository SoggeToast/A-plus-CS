import java.util.*;
import java.io.*;

public class pr121 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("pr123.dat"));
        int sets = in.nextInt();

        String[][] maze;

        while(sets-- > 0){
            int width = in.nextInt();
            int height = in.nextInt();
            in.nextLine();
            maze = new String[width][height];
            for(int x = 0; x < width; x++){
                String[] line = in.nextLine().split(" ");
                for(int y = 0; y < height; y++){
                    maze[x][y] = line[y];
                }
            }
            
        }

    }
}
