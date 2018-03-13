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
        // ���渳ֵ���
        // dog.setWeght(20);
        // dog.setColor("���ɫ");
        // dog.setDogType("��ëȮ");
        // ��ʽ��̷��
        dog.setWeight(20)
                .setColor("���ɫ")
                .setDogType("��ëȮ");
    }
}
