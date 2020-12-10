package academy.belhard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {

    public static void writePersons(String fileName, List<Person> persons) {
        String s = "";

        for (Person person : persons) {

            s = s + person.getFirstName() + ";" + person.getLastName() + ";" + person.getAddress().getTown() + ";" + person.getAddress().getStreet() + ";" + person.getAddress().getNumber() + "\n";

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(s);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static List<Person> readPerson(String fileName) throws EmptySourceFileException {

        List<Person> list = new ArrayList<>();

        File f = new File(fileName);

        if (!(f.exists()) || (f.length() == 0)) {
            throw new EmptySourceFileException("File does not exist or is empty");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String l;
            while ((l = reader.readLine()) != null) {

                String[] field = l.split(";");
                String firstName = field[0];
                String lastName = field[1];
                String town = field[2];
                String street = field[3];
                int number = Integer.parseInt(field[4]);

                list.add(new Person(firstName, lastName, new Address(town, street, number)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}






