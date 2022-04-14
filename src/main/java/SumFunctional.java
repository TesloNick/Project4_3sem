public class SumFunctional<T extends InterSingleFunction> implements InterFunctional<T> {

    private double right;
    private double left;

    public SumFunctional(double left, double right) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double calc(T func) {
        if (func.getRight() > right || func.getLeft() < left) {
            throw new IllegalArgumentException("Границы функции за пределами теста!");
        }

        return func.getResult(func.getRight()) + func.getResult(func.getLeft()) + func.getResult((func.getLeft() + func.getRight()) / 2);
    }
}