package java.task1;

import java.io.*;

public class PersonSerialization {

    // Метод для сериализации объекта java.task1.Person в файл
    public static void serializePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Объект java.task1.Person успешно сериализован в файл: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации объекта java.task1.Person из файла
    public static Person deserializePerson(String filename) {
        Person person = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            person = (Person) ois.readObject();
            System.out.println("Объект java.task1.Person успешно десериализован из файла: " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    public static void main(String[] args) {
        // Создаем объект java.task1.Person
        Person person = new Person("Alice", 30);

        // Сериализуем объект в файл
        String filename = "person.ser";
        serializePerson(person, filename);

        // Десериализуем объект из файла
        Person deserializedPerson = deserializePerson(filename);
        System.out.println("Десериализованный объект: " + deserializedPerson);
    }
}