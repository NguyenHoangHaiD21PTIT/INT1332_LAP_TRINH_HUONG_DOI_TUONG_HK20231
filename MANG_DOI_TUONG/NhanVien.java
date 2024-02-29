import java.util.*;
class NhanVien{
    private String mnv, ten, gioi, nsinh, dchi, mst, nky;
    public NhanVien(int x, String ten, String gioi, String nsinh, String dchi, String mst, String nky){
        this.mnv = String.format("%05d", x);
        this.ten = ten;
        this.gioi = gioi;
        this.nsinh = nsinh;
        this.dchi = dchi;
        this.mst = mst;
        this.nky = nky;
    }
    
    public String toString(){
        return this.mnv + " " + this.ten + " " + this.gioi + " " + this.nsinh + " " + this.dchi + " " + this.mst + " " + this.nky;
    }
    public String getns(){
        return this.nsinh;
    }
}