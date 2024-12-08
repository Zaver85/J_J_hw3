package java.task1;

import java.io.*;

public class PersonSerialization {

    public static void serializePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Объект java.task1.Person успешно сериализован в файл: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

        Person person = new Person("Alice", 30);


        String filename = "person.ser";
        serializePerson(person, filename);


        Person deserializedPerson = deserializePerson(filename);
        System.out.println("Десериализованный объект: " + deserializedPerson);
    }
}