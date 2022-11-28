package bootcamp_hw1.q10;

import java.util.ArrayList;
import java.util.List;

public class Order
{
	private List<Product> shoppingCart;
	private Invoice invoice;

	@Override
	public String toString()
	{
		return "Order [shoppingCart=" + shoppingCart + ", invoice=" + invoice.getAmount() + "]";
	}

	public Order()
	{
		shoppingCart = new ArrayList<>();
		invoice=new Invoice();
		invoice.setAmount(0);
	}

	public Order(List<Product> shoppingCart)
	{
		this.shoppingCart = shoppingCart;
	}

	public List<Product> getShoppingCart()
	{
		return shoppingCart;
	}

	public void setShoppingCart(List<Product> shoppingCart)
	{
		this.shoppingCart = shoppingCart;
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
		shoppingCart.add(product);
		invoice.setAmount(invoice.getAmount() + product.getPrice());
	}

	public void removeProduct(Product product)
	{
		if (shoppingCart.contains(product))
		{
			shoppingCart.remove(product);
		} else
		{
			System.out.println("Silinecek urun bulunamadi!");
		}
	}

}
