package bootcamp_hw1.q10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer
{
	private List<Order> orderList;
	private int age;
	private String name;

	public Customer(String name, int age)
	{
		this.orderList = new ArrayList<>();
		this.age = age;
		this.name = name;
	}

	public List<Order> getOrderList()
	{
		return orderList;
	}

	public void setOrderList(List<Order> orderList)
	{
		this.orderList = orderList;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Customer(List<Order> orderList)
	{
		this.orderList = orderList;
	}

	public void purchaseOrder(Order order)
	{
		boolean orderIsAvailable = true;
		Order tempOrder = new Order(new ArrayList<Product>(order.getShoppingCart()));
		for (Product product : tempOrder.getShoppingCart())
		{

			if (product.getStockCount() <= 0)
			{
				System.out.println("The product: " + product.getName()
						+ " could not be added to order. Do you want to proceed with remaining products?(Y/N)");
				Scanner input = new Scanner(System.in);
				String selection = input.nextLine().toLowerCase();
				while (!(selection.equals("y") || selection.equals("n")))
				{
					System.out.println("Incorrect selection");
					System.out.println("The product: " + product.getName()
							+ " could not be added to order. Do you want to proceed with remaining products?(Y/N)");
					selection = input.nextLine().toLowerCase();
				}
				if (selection.equals("y"))
				{
					order.removeProduct(product);
					order.setInvoice(order.getInvoice() - product.getPrice());
					continue;
				} else
				{
					input.close();
					orderIsAvailable = false;
					break;
				}
			}
			product.setStockCount(product.getStockCount() - 1);

		}
		if (orderIsAvailable && order.getShoppingCart().size() > 0)
		{
			orderList.add(order);
		} else
		{
			System.out.println("Either order is not available or shopping cart is empty. Could not proceed.");
		}

	}

	@Override
	public String toString()
	{
		String result = "";
		for (Order order : orderList)
		{
			result = result.concat("\nOrder Total Price: " + order.getInvoice());
			for (Product product : order.getShoppingCart())
			{
				result = result.concat("\nProduct Name: " + product.getName() + ", Product Category: "
						+ product.getCategory() + ", Product Price: " + product.getPrice() + "\n");
			}
		}

		return "Customer [name=" + name + ", age=" + age + ", orderList=\n" + result + "]";
	}

	public int getBoughtProductCount()
	{
		int totalCount=0;
		for (Order order : orderList)

		{
			totalCount += order.getShoppingCart().size();
		}
		return totalCount;
	}
	
	public double getInvoiceAmount()
	{
		double totalAmount=0;
		for(Order order:orderList)
		{
			totalAmount+=order.getInvoice();
		}
		return totalAmount;
	}

}
