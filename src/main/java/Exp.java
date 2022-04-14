public class Exp implements InterSingleFunction {
    double A, B;
    double right, left;

    public Exp(double a, double b, double left, double right) {
        A = a;
        B = b;
        this.right = right;
        this.left = left;
    }

    @Override
    public double getResult(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();
        return A * Math.exp(x) + B;
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