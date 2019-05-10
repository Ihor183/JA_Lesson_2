package ua.igorbendera.jdbs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProgrammerDao programmerDao = new ProgrammerDao(DatabaseHandler.getDbConnection());
        LaptopDao laptopDao = new LaptopDao(DatabaseHandler.getDbConnection());

    /*    List<Programmer> programmers = new ArrayList<>();
        programmers.add(new Programmer("Andrii", "Java", "SoftServe", 20));
        programmers.add(new Programmer("Nazar", "React", "Unicorn", 20));
        programmers.add(new Programmer("Vova", "C#", "SS", 20));
        programmers.add(new Programmer("Dima", "Java", "SoftServe", 20));
        programmers.add(new Programmer("Taras", "Angular", "SS", 20));

        programmers.forEach(programmer -> {
            try {
                programmerDao.insert(programmer);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", "250G4", 4, 1));
        laptops.add(new Laptop("HP", "250G3", 8, 2));
        laptops.add(new Laptop("Lenovo", "IdeaPad", 12, 3));
        laptops.add(new Laptop("DELL", "250G4", 16, 4));
        laptops.add(new Laptop("Apple", "MacBook Pro 18", 32, 5));
        laptops.add(new Laptop("ASUS", "ROG", 16, 1));

        laptops.forEach(laptop -> {
            try {
                laptopDao.insert(laptop);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
*/
        programmerDao.readAll().forEach(System.out::println);
        laptopDao.readAll().forEach(System.out::println);

/*   System.out.println(programmerDao.read(2));
          System.out.println(laptopDao.read(3));
*/


/*        programmerDao.update("Node.js", 1);
        laptopDao.update(64, 5);

        programmerDao.readAll().forEach(System.out::println);
        laptopDao.readAll().forEach(System.out::println);
*/


/*       programmerDao.delete(1, laptopDao);
        laptopDao.delete(2);

        programmerDao.readAll().forEach(System.out::println);
        laptopDao.readAll().forEach(System.out::println);
*/

    }
}
