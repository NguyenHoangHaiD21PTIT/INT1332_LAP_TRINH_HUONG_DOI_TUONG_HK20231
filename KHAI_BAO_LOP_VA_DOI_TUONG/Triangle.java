class Triangle{
    private double canh1, canh2, canh3;
    public Triangle(Point a, Point b, Point c){
        this.canh1 = a.distance(b);
        this.canh2 = b.distance(c);
        this.canh3 = c.distance(a);
    }
    public boolean valid(){
        double a = this.canh1, b = this.canh2, c = this.canh3;
        return a + b > c && b + c > a && c + a > b;
    }
    public double get1(){
        return this.canh1;
    }
    public double get2(){
        return this.canh2;
    }
    public double get3(){
        return this.canh3;
    }
    public double perimeter(){
        return this.canh1 + this.canh2 + this.canh3;
    }
    public double dientich(){
        double p = (this.canh1 + this.canh2 + this.canh3)/2;
        return Math.sqrt(p * (p - this.canh1) * (p - this.canh2) * (p - this.canh3));
    }
}