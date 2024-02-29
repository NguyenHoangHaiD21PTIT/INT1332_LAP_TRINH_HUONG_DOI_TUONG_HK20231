import java.util.*;
public class J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien []a = new NhanVien[n];
        for(int i = 0;i<n;i++){
            a[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<NhanVien>(){
            public int compare(NhanVien a, NhanVien b){
                String s1 = a.getns();
                String s2 = b.getns();
                String []x1 = s1.split("/");
                String []x2 = s2.split("/");
                if(!x1[2].equals(x2[2])){
                    return x1[2].compareTo(x2[2]);
                } else if(!x1[1].equals(x2[1])){
                    return x1[1].compareTo(x2[1]);
                }
                return x1[0].compareTo(x2[0]);
            }
        });
        for(NhanVien x: a) System.out.println(x);
    }
}
