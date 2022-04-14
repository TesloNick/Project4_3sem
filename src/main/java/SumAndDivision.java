public class SumAndDivision implements InterSingleFunction {
    double A, B, D, C;
    double right, left;

    public SumAndDivision(double a, double b, double c, double d, double left, double right) {
        A = a;
        B = b;
        D = d;
        C = c;
        this.left = left;
        this.right = right;
    }

    @Override
    public double getResult(double x) {
        if (x > right || x < left || ((Math.abs(C - 0) < 1e-9) && Math.abs(D - 0) < 1e-9)) {
            throw new IllegalArgumentException("Неверные входные данные!");
        }
        return (A * x + B) / (C * x + D);
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