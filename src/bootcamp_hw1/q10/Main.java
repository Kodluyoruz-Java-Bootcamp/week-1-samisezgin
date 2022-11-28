package bootcamp_hw1.q10;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		List<Customer> customerList = new ArrayList<>();
		Customer c1 = new Customer("Sami", 28);
		Customer c2 = new Customer("Cem", 28);
		Customer c3 = new Customer("Ahmet", 26);
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);

		Product ekmek = new Product("ekmek", "gida", 1501, 10);
		Product yogurt = new Product("yogurt", "gida", 5000, 20);
		Product bilgisayar = new Product("bilgisayar", "elektronik", 10000, 15);

		/*Order order = new Order();
		order.addProduct(ekmek);
		order.addProduct(yogurt);
		order.addProduct(bilgisayar);*/

		/*Order order2 = new Order();
		order2.addProduct(ekmek);
		order2.addProduct(yogurt);
		order2.addProduct(bilgisayar);*/

		Order order3 = new Order();
		order3.addProduct(ekmek);
		order3.addProduct(yogurt);
		order3.addProduct(bilgisayar);

		Order order4 = new Order();
		order4.addProduct(ekmek);

		Order order5 = new Order();
		order5.addProduct(yogurt);

		Order order6 = new Order();
		order6.addProduct(bilgisayar);

		//c1.purchaseOrder(order);
		//System.out.println(c1.toString());
		//c1.purchaseOrder(order2);
		//System.out.println(c1.toString());
		c1.purchaseOrder(order3);
		//System.out.println(c1.toString());

		c2.purchaseOrder(order4);
		//System.out.println(c2.toString());
		c2.purchaseOrder(order5);
		//System.out.println(c2.toString());
		//c2.purchaseOrder(order6);
		//System.out.println(c2.toString());

		System.out.println("All customers in the system: " + customerList.size());
		System.out.println("Shopping carts of those whose name is Cem: ");
		for (Customer customer : customerList)
		{
			if (customer.getName().toLowerCase().equals("cem"))
			{
				System.out.println("Number of purchases by Cem: "+ customer.getBoughtProductCount());
			}
		}
		System.out.println("---------------------\n");

		for (Customer customer : customerList)
		{
			if (customer.getName().toLowerCase().equals("cem") && customer.getAge() > 25 && customer.getAge() < 30)
			{
				System.out.println(customer.getInvoiceAmount());
			}
		}
		System.out.println("---------------------\n");
		for (Customer customer : customerList)
		{
			for (Order customOrder : customer.getOrderList())
			{
				if (customOrder.getInvoice() > 1500)
				{
					System.out.println("---------------------");
					System.out.println("Invoice Amount: "+customOrder.getInvoice());
					System.out.println("Customer: "+customer.getName()+"\nOrder:");
					for(Product customProduct:customOrder.getShoppingCart())
					{						
						System.out.println("Product name: "+customProduct.getName()+", Category: "+customProduct.getCategory());
					}

				}
			}
		}

	}
}
