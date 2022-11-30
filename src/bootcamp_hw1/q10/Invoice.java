package bootcamp_hw1.q10;

import java.util.ArrayList;
import java.util.List;

public class Invoice
{
	private List<Product> shoppingCart;
	private double amount;
	
	public Invoice()
	{
		amount=0;
		shoppingCart=new ArrayList<>();
	}

	public List<Product> getShoppingCart()
	{
		return shoppingCart;
	}

	public void setShoppingCart(List<Product> shoppingCart)
	{
		this.shoppingCart = shoppingCart;
	}

	public double getAmount()
	{
		return amount;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public void addProduct(Product product)
	{		
		shoppingCart.add(product);
		amount+=product.getPrice();		
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
