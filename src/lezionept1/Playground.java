package lezionept1;

import java.util.HashMap;
import java.util.Map;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> salaries = new HashMap<>();

		salaries.put("Matteo", 1500);
		salaries.put("Laura", 1600);
		salaries.put("Marco", 3200);
		salaries.put("Luca", 500);

		salaries.forEach((name, cachet) -> System.out.println(name + cachet));

//		salaries.replaceAll(
//				(name, cachet) -> System.out.println("Lo stipendio è" + cachet + 2000 + "congratulazioni" + name));
		new Thread(() -> {
			System.out.println("Ciao1");
			System.out.println("Ciao2");
		}).start();

		StringModifier wrapper = s -> "###" + s + "@@@";
		System.out.println(wrapper.modify("Ciao"));

		StringModifier aggiungiQuestion = s -> s + " " + "?";
		System.out.println(aggiungiQuestion.modify("cosa hai mangiato"));

		StringModifier invert = s -> {
			String[] characters = s.split("");
			String inverted = "";
			for (int i = characters.length - 1; i >= 0; i--) {
				inverted += characters[i];
			}
			return inverted;
		};
		System.out.println(invert.modify("We Lino"));

	}

}
