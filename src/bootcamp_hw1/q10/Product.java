package bootcamp_hw1.q10;

public class Product
{
private String name;
private String category;
private double price;
private long stockCount;

public Product(String name, String category, double price, long stockCount)
{
	this.name = name;
	this.category = category;
	this.price = price;
	this.stockCount = stockCount;
}

public double getPrice()
{
	return price;
}

public void setPrice(double price)
{
	this.price = price;
}

public long getStockCount()
{
	return stockCount;
}

public void setStockCount(long stockCount)
{
	this.stockCount = stockCount;
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public String getCategory()
{
	return category;
}

public void setCategory(String category)
{
	this.category = category;
}
}
