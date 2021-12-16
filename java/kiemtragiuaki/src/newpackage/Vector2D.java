package newpackage;

import java.lang.Math;

public class Vector2D {
    double x;
    double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double evalModule() {
        double length2D = Math.sqrt(x * x + y * y);
        return length2D;
    }

    public boolean isPerp(double x, double y) {
        if ((this.x * x + this.y * y) == 0) {
            return true;
        }
        return false;
    }
    public boolean isPerp(Vector2D x){

    }
}
