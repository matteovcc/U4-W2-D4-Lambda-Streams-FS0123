package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> clienti = new ArrayList<>();
		Customer c1 = new Customer(1144331, "Matteo Vacca", 2);
		Customer c2 = new Customer(24133422, "Gigio Gigietti", 1);
		Customer c3 = new Customer(31234, "Lillo Lilletti", 1);
		Customer c4 = new Customer(41244, "Pino Pinetti", 2);

		clienti.add(c1);
		clienti.add(c2);
		clienti.add(c3);
		clienti.add(c4);

////		System.out.println(clienti);
//		for (Customer cliente : clienti) {
//			System.out.println(cliente);
//		}

		List<Product> prodotti = new ArrayList<>();
		Product p1 = new Product(123, "Harry Potter ", "Books", 12.30);
		Product p2 = new Product(345, "Il silmarillion", "Books", 122.00);
		Product p3 = new Product(678, "Bambola", "Baby", 7.50);
		Product p4 = new Product(901, "Macchinina", "Boys", 33.20);
		Product p5 = new Product(234, "Pupazzo", "Girls", 115.40);

		prodotti.add(p1);
		prodotti.add(p2);
		prodotti.add(p3);
		prodotti.add(p4);
		prodotti.add(p5);

//		System.out.print(prodotti);
//		for (Product prodotto : prodotti) {
//			System.out.println(prodotto);
//		}

		List<Order> ordini = new ArrayList<>();

		LocalDate today = LocalDate.now();
		LocalDate delivery = today.plusDays(3);

		Order o1 = new Order(1, "In corso", today, p1, c1, delivery);
		Order o2 = new Order(2, "In magazzino", today, p2, c2, delivery);
		Order o3 = new Order(3, "Arrivato", today, p3, c3, delivery);
		Order o4 = new Order(1, "In corso", today, p4, c4, delivery);

		ordini.add(o4);
		ordini.add(o3);
		ordini.add(o2);
		ordini.add(o1);

		// --------EXERCISE 1-------//
		System.out.println("ESERCIZIO 1");
		List<Product> libriMaggioreDi100 = prodotti.stream().filter(n -> n.getCategory().equals("Books"))
				.filter(n -> n.getPrice() > 100).toList();
		System.out.println("I prodotti di categoria 'Books' e che costano meno di 100 sono: " + libriMaggioreDi100);

		System.out.println("ESERCIZIO 2");
		// -------EXERCISE2-------//
		List<Order> orders = ordini.stream().filter(n -> n.getProduct().getCategory().equals("Baby")).toList();
		System.out.println(orders);
		// ----------Exercise 3-------//

		List<Product> prodottiScontati = prodotti.stream().filter(n -> n.getCategory().equals("Boys")).map(p -> {
			p.setPrice(p.getPrice() * 0.9);
			return p;
		}).toList();

		System.out.println(prodottiScontati);

		System.out.println("ESERCIZIO 4");
		// ----Exercise4-----//
		List<Order> ordiniTier2 = ordini.stream().filter(n -> n.getCustomer().getTier() == 2).toList();

		System.out.println(ordiniTier2);

	}

}
