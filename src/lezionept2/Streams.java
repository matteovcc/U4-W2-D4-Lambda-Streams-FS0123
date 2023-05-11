package lezionept2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STREAMS

		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 31; i++) {
			intList.add(i);
		}
		System.out.println(intList);

		List<Integer> firstTenNumbers = intList.stream().limit(11).toList();
		System.out.println(firstTenNumbers);

		Predicate<Integer> isLessThanTwenty = n -> n < 20;
		List<Integer> numbersLessThanTwenty = intList.stream().filter(isLessThanTwenty).toList();
		System.out.println(numbersLessThanTwenty);

//		List<Integer> randList = new ArrayList<>();
//		for (int i = 0; i < 100; i++) {
//			randList.add((int) Math.random() * 40);
//		}
//		System.out.println(randList);
		List<Integer> doubledNumbers = intList.stream().map(number -> number * 2).toList();
		System.out.println(doubledNumbers);

		List<Student> students = new ArrayList<>();
		Student aldo = new Student("Aldo", "Baglio", 12);
		Student giovanni = new Student("Giovanni", "Storti", 32);
		Student giacomo = new Student("Giacomo", "Poretti", 22);
		students.add(giacomo);
		students.add(giovanni);
		students.add(aldo);

		List<Student> youngStudents = students.stream().filter(student -> student.getAge() < 20).toList();
		System.out.println(youngStudents);

		if (students.stream().anyMatch(student -> student.getNome().equals("Aldo"))) {
			System.out.println("Esiste");
		}
		if (students.stream().allMatch(student -> student.getNome().equals("Aldo"))) {
			System.out.println("Nella lista sono tutti aldo");
		} else {
			System.out.println("Nella lista NON sono tutti aldo");
		}

		System.out.println(intList);
		int total = intList.stream().reduce(0, (acc, currentElement) -> acc + currentElement);
		System.out.println(total);

		int totalAges = students.stream().map(Student::getAge).reduce(0, (acc, currentElement) -> acc + currentElement);
		System.out.println("ETà SOMMATE : " + " " + totalAges);

//		 ------------LOCAL DATES----------
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate todayplusthree = today.plusDays(3);
		System.out.println(todayplusthree);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDate test = LocalDate.parse("31/02/2123 12:05:00", formatter);
		System.out.println(test);
	}

}
