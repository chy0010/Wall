public class Point {
    private int x;

    private int y;

    public Point(){

    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }
    public double distance(int A,int B){//(xA,yA),(0xB,0yB))
        return Math.sqrt((x - A) * (x - A) + (y - B) * (y - B));
    }
    public double distance(Point Point){
        return distance(Point.x,Point.y);
    }
}
