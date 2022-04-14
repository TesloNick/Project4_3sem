public class Sin implements InterSingleFunction {
    double A, B;
    double right, left;

    public Sin(double a, double b, double left, double right) {
        A = a;
        B = b;
        this.left = left;
        this.right = right;
    }

    @Override
    public double getResult(double x) {
        if (x > right || x < left) throw new IllegalArgumentException("х за границами отрезка!");
        return A * Math.sin(B * x);
    }

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public double getLeft() {
        return left;
    }
}