import java.io.*;
import java.util.*;

public class HELLOFILE {
    public static void main(String[] args) {
        try{
            Scanner inp = new Scanner(new File("HELLO.txt"));
            while ( inp.hasNextLine()){
                System.out.println(inp.nextLine());
            }
        }
        catch(FileNotFoundException Er){
            Er.printStackTrace();
        }
    }
}
