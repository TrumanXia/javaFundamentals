package com.study.tools;

public class Animal
{
    public String name;
    public String age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
    public void setAge(String age) {
        this.age = age;
    }
    
    
}
