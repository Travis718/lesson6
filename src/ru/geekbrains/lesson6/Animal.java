package ru.geekbrains.lesson6;

abstract class Animal
{
    protected int runLength = 0;
    protected int swimLength = 0;
    protected double jumpHeigth = 0;

    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(double heigth);
}
