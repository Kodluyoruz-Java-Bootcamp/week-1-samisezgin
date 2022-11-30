package bootcamp_hw1.q10;

import java.util.List;

public class Order
{
	private Invoice invoice;

	@Override
	public String toString()
	{
		return "Order [shoppingCart=" + invoice.getShoppingCart() + ", invoice=" + invoice.getAmount() + "]";
	}

	public Order()
	{
		invoice = new Invoice();
		invoice.setAmount(0);
	}

	public Order(List<Product> shoppingCart)
	{
		invoice=new Invoice();
		this.invoice.setShoppingCart(shoppingCart);
	}

	public List<Product> getShoppingCart()
	{
		return invoice.getShoppingCart();
	}

	public void setShoppingCart(List<Product> shoppingCart)
	{
		this.invoice.setShoppingCart(shoppingCart);
	}

	public double getInvoice()
	{
		return invoice.getAmount();
	}

	public void setInvoice(double invoice)
	{
		this.invoice.setAmount(invoice);
	}

	public void addProduct(Product product)
	{
		invoice.addProduct(product);
	}

	public void removeProduct(Product product)
	{
		invoice.removeProduct(product);
	}

}
