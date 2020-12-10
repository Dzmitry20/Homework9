package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws EmptySourceFileException {

        Person person1 = new Person("Joseph", "Evans", new Address("Minsk", "Pobedy", 45));
        Person person2 = new Person("Oscar", "Parson", new Address("Moscow", "Lenina", 8));
        Person person3 = new Person("George", "King", new Address("New York", "Park Avenue", 7));

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Вывод экземпляров класса Person :");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        String fileName = "persons.txt";

        PersonIOUtil.writePersons(fileName,persons);

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Чтение из файла persons.txt :");

        for (Person person:PersonIOUtil.readPerson(fileName)){
              System.out.println(person);
          }

        System.out.println("------------------------------------------------------------------------------------------------------------");

    }
}
