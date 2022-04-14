public class IntegralFunctional<T extends InterSingleFunction> implements InterFunctional<T> {

    private double right;
    private double left;

    public IntegralFunctional(double left, double right) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double calc(T func) {
        if (func.getLeft() > left || func.getRight() < right) {
            throw new IllegalArgumentException("!");
        }

        int n = 10;
        double h = Math.abs(right - left) / n;
        double res = 0;

        for (double i = 0; i < n; i++) {
            res += func.getResult(left + i * h + h / 2);
        }

        return res * h;
    }
}