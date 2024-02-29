/*package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
class User{
    private String id, pass;
    public User(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }
    public String getId() {
        return id;
    }
    public String getPass() {
        return pass;
    }   
}
public class JP217_LOP_USER {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        User []a = new User[n];
        HashMap<String, String>mp1 = new HashMap<>();//key là id, val là pass
        for(int i = 0;i<n;i++){ 
            String s = sc.nextLine();
            String []tmp = s.trim().split("\\s+");
            a[i] = new User(tmp[0], tmp[1]);
            mp1.put(a[i].getId(), a[i].getPass());
        }
        HashMap<String, Integer>mp2 = new HashMap<>();//key là id, val là số lần login thành công
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<m;i++){
            String s = sc.nextLine();
            String []tmp = s.trim().split("\\s+");
            if(mp1.containsKey(tmp[0])){//Có tên trong danh sách id pass ban đầu thì mới biết log đúng hay sai
                if(mp1.get(tmp[0]).equals(tmp[1])){ 
                    if(!mp2.containsKey(tmp[0])) mp2.put(tmp[0], 1);
                    else mp2.put(tmp[0], mp2.get(tmp[0]) + 1);
                }
            }
        }
        for(User x: a){
            if(mp2.get(x.getId())==null) System.out.print(0 + " ");
            else System.out.print(mp2.get(x.getId()) + " ");
        }
    }
}*/
