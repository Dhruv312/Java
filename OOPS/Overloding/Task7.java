// 6. Distance Calculation:
//    Create a class `DistanceCalculator` with overloaded methods `distance()` to calculate the distance between two points in a 2D plane (using two points), three points in a 3D space (using three points), and between two points on a number line.
class DistanceCalculator{

    public double distance(double x1,double x2){
        return x2-x1;
    }
    public int distance(int x1,int x2,int y1,int y2,int z1,int z2){
        return Math.sqrt(Math.pow(x2-x1, 2),Math.pow(y2-y1, 2),Math.pow(z2-z1, 2));
    }
}

public class Task7 {
    public static void main(String[] args){
        Di
    }
}
