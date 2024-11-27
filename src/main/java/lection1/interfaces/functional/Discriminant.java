package lection1.interfaces.functional;

@FunctionalInterface
public interface Discriminant<T extends Double> {
    T discriminant(T a, T b, T c);
}
