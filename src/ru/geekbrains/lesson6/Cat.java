package ru.geekbrains.lesson6;

    class Cat extends Animal
{
    private final int runLength = 200;
    private final double jumpHeigth = 2;
    @Override
    void run(int length)
    {
        if ((length >= 0) && (length<= runLength))
            System.out.println("наш кот прпреодолел расстояние " + runLength);
        else System.out.println("наш кот не бегает так далеко)))");
    }

    @Override
    void swim(int length)
    {
        System.out.println("Коты не умеют плавать");
    }


    @Override
    void jump(double heigth)
    {
        if ((heigth >= 0) && (heigth <= jumpHeigth))
            System.out.println("Наш кот преодолел высоту" + heigth);
        else System.out.println("Наш кот не справился с этой преградой");
    }




}
