package session_6;

import Gender.Gender;

import java.math.BigDecimal;
import java.time.Year;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Akylai", "Akylova", Year.of(22), new BigDecimal(300), Gender.FEMALE),
                new Student("Jyldyz", "Oljobaeva", Year.of(21), new BigDecimal(3000), Gender.FEMALE),
                new Student("Janyshbek", "Akbalaev", Year.of(23), new BigDecimal(400), Gender.MALE),
                new Student("Akyl", "Akimov", Year.of(14), new BigDecimal(4100), Gender.MALE),
                new Student("Adilet", "Ismayilov", Year.of(16), new BigDecimal(4000), Gender.MALE)
        ));
        
        System.out.println("Names (A)");
        students.stream().map(Student::getFirstName).filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println("Age (15) Money (2000) gender (MALE)");
        students.stream().filter(year -> year.getAge().getValue() > 15 && year.getMoney().intValue() > BigDecimal.valueOf(2000).intValue() && year.getGender().equals(Gender.MALE)).forEach(System.out::println);
        System.out.println("max students (money)");
        Optional<Student> max = students.stream().max(Comparator.comparing(student -> student.getMoney().intValue()));
        System.out.println(max);
        System.out.println("max students (money Female)");
        Optional<Student> max1 = students.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(student -> student.getMoney().intValue()));
        System.out.println(max1);
        System.out.println("Students (first name)");
        students.stream().map(student -> student.getFirstName().toCharArray()).forEach(System.out::println);
        System.out.println("Students money + (1000)");
        students.stream().map(student -> student.getMoney().intValue() + 1000).forEach(System.out::println);
        System.out.println("Students (one)");
        Optional<Student> first = students.stream().map(student -> student).findFirst();
        System.out.println(first);
        System.out.print("Students = ");
        long count = students.stream().count();
        System.out.println(count);
        System.out.println("group Male");
        students.stream().filter(student -> student.getGender().equals(Gender.MALE)).toList().forEach(System.out::println);
        System.out.println("Group Female");
        students.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).toList().forEach(System.out::println);


    }
}
