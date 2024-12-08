package java.task1;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Рекомендуется для сериализации
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "java.task1.Person{name='" + name + "', age=" + age + "}";
    }
}
