package FunctionInterfaceEx;
@FunctionalInterface
public interface Calculator<T> {
    public double calculate(T x);
}
