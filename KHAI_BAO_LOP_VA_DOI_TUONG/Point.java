class Point {
    private double x, y;
    //Hàm khởi tạo có tọa độ trong tham số
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //Hàm khởi tạo đối tượng là bản sao đối tượng trong tham số
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    //Trả về hoành độ
    public double getX(){
        return this.x;
    }
    //Trả về tung độ
    public double getY(){
        return this.y;
    }
    //Trả về khoảng cách từ điểm hiện tại đến 1 điểm khác
    public double distance(Point p){
        return Math.sqrt( Math.pow(p.x-this.x,2) + Math.pow(p.y-this.y,2));
    }
    //Trả về khoảng cách 2 điểm bất kỳ
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    //Trả 1 đối tượng dưới dạng String, ghi đè phương thức toString()
    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
}
