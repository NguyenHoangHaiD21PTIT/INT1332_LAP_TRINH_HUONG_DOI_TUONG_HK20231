import java.util.*;
import java.io.*;
public class J07001_DOC_FILE_VAN_BAN {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner (new File("DATA.in"));
            while(sc.hasNextLine()) System.out.println(sc.nextLine());
        }catch(FileNotFoundException Er){
            Er.printStackTrace();
        }
    }
}
