package xyg.study.chainProgramming;

class Dog
{

    private int weight;
    private String color;
    private String dogType;

    public Dog setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Dog setColor(String color) {
        this.color = color;
        return this;
    }

    public Dog setDogType(String dogType) {
        this.dogType = dogType;
        return this;
    }
}

public class DogRasing
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        // 常规赋值风格
        // dog.setWeght(20);
        // dog.setColor("金黄色");
        // dog.setDogType("金毛犬");
        // 链式编程风格
        dog.setWeight(20)
                .setColor("金黄色")
                .setDogType("金毛犬");
    }
}
