public class DivideCommand implements Command {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Невозможно разделить на ноль");
        }
        return a / b;
    }
}

