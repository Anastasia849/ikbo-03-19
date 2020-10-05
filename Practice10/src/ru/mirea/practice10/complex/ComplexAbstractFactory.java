package ru.mirea.practice10.complex;



public interface ComplexAbstractFactory {
    public Complex createComplex();

    public Complex createComplex(int real, int image);
}
