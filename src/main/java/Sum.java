public class Sum implements InterSingleFunction {
    double A, B;
    double right, left;

    public Sum(double a, double b, double left, double right) {
        A = a;
        B = b;
        this.left = left;
        this.right = right;
    }

    @Override
    public double getResult(double x) {
        if (x > right || x < left) {
            throw new IllegalArgumentException("х за границами отрезка!");
        }
        return A * x + B;
    }

    /*public double getResult2(double x) {
        return A * x + B;
    }*/

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public double getLeft() {
        return left;
    }
}