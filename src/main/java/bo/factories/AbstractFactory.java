package main.java.bo.factories;

public interface AbstractFactory<T,E> {
    T create(E type);
}
