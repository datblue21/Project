package newpackage;

public class Vector3D extends Vector2D {
    private double z;

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double evalModule() {
        double length3D = Math.sqrt(this.x * x + this.y * y + this.z * z);
        return length3D;
    }

    public boolean isPerp(double x, double y, double z) {
        if ((this.x * x + this.y * y + this.z * z) == 0) {
            return true;
        }
        return false;
    }
}
