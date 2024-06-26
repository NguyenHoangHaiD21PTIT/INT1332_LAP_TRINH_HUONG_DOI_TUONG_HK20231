package MANG;
public class J02104_DANH_SACH_CANH{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int x = sc.nextInt();
                if(x==1 && i<j){
                    System.out.printf("(%d,%d)\n", i, j);
                }
            } 
        }
    }
}
