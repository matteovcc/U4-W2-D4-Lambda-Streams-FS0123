package app;

import java.time.LocalDate;

public class Order {
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private Product product;
	private Customer customer;

	public Order(long id, String status, LocalDate orderDate, Product product, Customer customer,
			LocalDate deliveryDate) {
		this.id = id;
		this.status = status;
		this.orderDate = LocalDate.now();
		this.deliveryDate = LocalDate.now().plusDays(3);
		this.customer = customer;
		this.setProduct(product);

	}

	public Order(int i, String string, LocalDate today, LocalDate delivery, Customer c1) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order{" + "id=" + id + ", status='" + status + '\'' + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + ", customer=" + customer.getCustomer() + " " + product.getName() + '}';
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
