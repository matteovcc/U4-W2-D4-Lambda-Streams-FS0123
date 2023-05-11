package lezionept2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {

	public static void main(String[] args) {

		// --------PREDICATES--------- //

		Predicate<Integer> isMoreThanTen = n -> n > 10;
		System.out.println(isMoreThanTen.test(22)); // True
		System.out.println(isMoreThanTen.test(2)); // False

		Predicate<Integer> isSomething = n -> n > 10 && n < 23 && n == 15;
		System.out.println(isSomething.test(15)); // True

		System.out.println(isMoreThanTen.and(isSomething).test(15)); // True
		System.out.println(isMoreThanTen.and(isSomething).test(14)); // False

		// -------- LAMBDAS-------------//
		List<Integer> intList = new ArrayList<>();
		Random rnd = new Random();

		for (int i = 0; i < 30; i++) {
			intList.add(rnd.nextInt(1, 100));
		}
		intList.forEach(n -> System.out.println(n));

		System.out.println("SUPPLIER");

		Supplier<Integer> intList2 = () -> rnd.nextInt(1, 100);

		for (int i = 0; i < 10; i++) {
			System.out.println(intList2.get());
		}

	}

}
