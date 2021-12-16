class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){

    }

    RegularPolygon(int N, double newSide){
        this.n=N;
        this.side=newSide;
    }
    
    RegularPolygon(int N, double newSide, double newX, double newY){
        this.n = N;
        this.side = newSide;
        this.x = newX;
        this.y = newY;
    }

    // now create the getter and setter methods
    public int getN(){
        return n;
    }
    
    public void setN(int N){
        this.n=N;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double newSide){
        this.side=newSide;
    }

    public double getX(){
        return x;
    }
    public void setX(double newX){
        this.x=newX;
    }

    public double getY(){
        return y;
    }

    public void setY(double newY){
        this.y=newY;
    }

    public double getArea(){
        double area = (n * Math.pow(side,2)) / (4 *  (Math.tan(Math.PI/n)));
        return area;
    }
}