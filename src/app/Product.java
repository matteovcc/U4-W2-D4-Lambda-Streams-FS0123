package app;

public class Product {
	private long id;
	private String name;
	private String category;
	private double price;
//	private double sconto;

	public Product(long id, String name, String category, double price) {
		super();
		this.setId(id);
		this.setName(name);
		this.setCategory(category);
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double sconto() {
		double initial = this.getPrice();
		double pricediscount = (initial * 10) / 100;

		return pricediscount;
	}

	@Override
	public String toString() {
		return "ID: " + id + " " + "Nome prodotto :" + " " + name + " " + "di categoria:" + category + " " + ",prezzo: "
				+ price;
	};

}
