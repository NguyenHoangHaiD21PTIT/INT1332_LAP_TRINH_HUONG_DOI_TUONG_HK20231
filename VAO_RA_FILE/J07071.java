package VAO_RA_FILE;
import java.io.*;
import java.util.*;
class hoVaTen {
    private String hoTen, vietTat;

    public hoVaTen(String hoTen) {
        this.hoTen = hoTen;
        this.vietTat = tat();
    }

    public String tat() {
        String[] x = hoTen.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < x.length; i++) {            
            sb.append(x[i].charAt(0));
            if (i != x.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public String getTen() {
        String[] x = hoTen.split("\\s+");
        return x[x.length - 1];
    }

    public String getHo() {
        String[] x = hoTen.split("\\s+");
        return x[0];
    }

    public String getVietTat() {
        return vietTat;
    }

    public String getHoTen() {
        return hoTen;
    }
}
public class J07071 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\OneDrive\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hoVaTen> ht = new ArrayList<>();
        while (t-- > 0) {
            hoVaTen x = new hoVaTen(sc.nextLine());
            ht.add(x);
        }
        Collections.sort(ht, new Comparator<hoVaTen>() {
            @Override
            public int compare(hoVaTen o1, hoVaTen o2) {
                if (o1.getTen().compareTo(o2.getTen()) != 0) {
                    return o1.getTen().compareTo(o2.getTen());
                } else {
                    return o1.getHo().compareTo(o2.getHo());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            for (int i = 0; i < ht.size(); i++) {//Xét từng tên
                int cnt = 0;
                //Xét từng ký tự trong tên viết tắt
                for (int j = 0; j < ht.get(i).getVietTat().length(); j++) {
                    if (s.charAt(j) != ht.get(i).getVietTat().charAt(j)) {
                        cnt += 1;
                    }
                }
                if (cnt == 1) {
                    System.out.println(ht.get(i).getHoTen());
                }
            }
        }
    }
}