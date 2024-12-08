package task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        я
        PersonRepository personRepository = new PersonRepository();


        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 35);

        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);


        System.out.println("All persons:");
        List<Person> persons = personRepository.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }


        person2.setAge(26);
        personRepository.updatePerson(person2);
        System.out.println("\nAfter updating Bob's age:");
        persons = personRepository.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }

        personRepository.deletePerson(person3.getId());
        System.out.println("\nAfter deleting Charlie:");
        persons = personRepository.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}