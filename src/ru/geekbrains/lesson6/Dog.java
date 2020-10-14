package ru.geekbrains.lesson6;

class Dog extends Animal
{
    private final int runLenght = 500;
    private final int swimLenght = 10;
    private final double jumpLenght = 0.5;

    @Override
    void run(int length)
    {
        if ((length >= 0) && (length <= runLenght))
            System.out.println("Наш пёс убежал на " + length + " метров");
        else System.out.println("Наш пес не убегает так далеко");
    }

    @Override
    void swim(int length)
    {
        if ((length >= 0) && (length <= swimLenght))
            System.out.println("Наш пёс уплыл на " + length + " метров");
        else System.out.println("Наш пес не заплывает так далеко");
    }

    @Override
    void jump(double heigth)
    {
        if ((heigth >= 0) && (heigth <= runLenght))
            System.out.println("Наш пёс прыгнул на " + heigth + " метров");
        else System.out.println("Наш пес не умеет летать(((");
    }
}
