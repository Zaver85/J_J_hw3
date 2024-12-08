package task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр репозитория
        PersonRepository personRepository = new PersonRepository();

        // Создаем и добавляем новых людей
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 35);

        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);

        // Получаем и выводим всех людей
        System.out.println("All persons:");
        List<Person> persons = personRepository.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }

        // Обновляем информацию о Bob
        person2.setAge(26);
        personRepository.updatePerson(person2);
        System.out.println("\nAfter updating Bob's age:");
        persons = personRepository.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }

        // Удаляем Charlie
        personRepository.deletePerson(person3.getId());
        System.out.println("\nAfter deleting Charlie:");
        persons = personRepository.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}