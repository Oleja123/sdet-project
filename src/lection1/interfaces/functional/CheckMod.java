package lection1.interfaces.functional;
@FunctionalInterface
public interface CheckMod<T extends Number> {
    boolean checkMod(T obj);
}
