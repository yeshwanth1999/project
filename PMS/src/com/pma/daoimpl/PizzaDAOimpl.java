package com.pma.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.bean.Pizza;
import com.pms.main.PizzaManagement;

import co.pms.dao.PizzaDAO;

public class PizzaDAOimpl implements PizzaDAO {
	Scanner sc = new Scanner(System.in);
	static List<Pizza> pizzas = new ArrayList<Pizza>();
	static List<Pizza> tempList = new ArrayList<Pizza>();
	Pizza pizza = null;
	

	@Override
	public void addPizza() {
		int i=1;
		while(i==1)
		{
			pizza = new Pizza();
			System.out.println("Enter Pizza Number ?");
			pizza.setPid(sc.nextInt());
			System.out.println("Enter Pizza Name ?");
			pizza.setPname(sc.next());
			System.out.println("Enter Prizza Qty ?");
			pizza.setQty(sc.nextInt());
			System.out.println("Enter Pizza Price ?");
			pizza.setPrice(sc.nextDouble());
			pizzas.add(pizza);
			System.out.println("Do you want to add more product press 1 else any number?");
			i = sc.nextInt();
			
		}
		System.out.println("Successfully Products aded...");
		
	}

	@Override
	public Pizza viewPizza(int pid) {
		Pizza p = new Pizza();
		for(Pizza p1:pizzas)
		{
			if(p1.getPid()==pid)
			{
				p=p1;
				break;
			}
		}
		return p;
	}

	@Override
	public List<Pizza> viewAllPizzas() {

		return pizzas;
	}

	@Override
	public void updatePizza(int pid) {
		tempList = new ArrayList<Pizza>();
		for(Pizza p2:pizzas)
		{
			if(p2.getPid()==pid)
			{
				System.out.println("Select Your Choice 1.Name 2.Qty  3. Price");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("Enter Updated Pizza Name ?");
				       p2.setPname(sc.next());
				       break;
				case 2:System.out.println("Enter Updated Pizza Qty ?");
				       p2.setQty(sc.nextInt());
				       break;
				case 3:System.out.println("Enter Updated Pizza Price ?");
				       p2.setPrice(sc.nextDouble());
				       break;
				default:System.out.println("Please select your choice range 1-3 only");       
				}
				tempList.add(p2);
			}else{
				tempList.add(p2);
			}
		}
		pizzas = new ArrayList<Pizza>();
		for(Pizza p3:tempList)
		{
			pizzas.add(p3);
		}
		System.out.println("Successfullu Product Updated....");
		
	}

	@Override
	public void deletePizza(int pid) {
		tempList = new ArrayList<Pizza>();
		for(Pizza p2:pizzas)
		{
			if(p2.getPid()==pid)
			{
				
			}else{
				tempList.add(p2);
			}
		}
		pizzas = new ArrayList<Pizza>();
		for(Pizza p3:tempList)
		{
			pizzas.add(p3);
		}
		System.out.println("Successfully Product Deleted...");
		
	}
	
	
	public  void cancelorder(){
		tempList = new ArrayList<Pizza>();

		Pizza pizza = new Pizza();
		for(Pizza p11:pizzas)

		{
			
			
       System.out.println(p11);
		
       }  
		
		
System.out.println("Enter Select Product id ?");

		pizza.setPid(sc.nextInt());

		System.out.println("Enter No of Qty ?");
	
	pizza.setQty(sc.nextInt());
	
	
		for(Pizza p12:pizzas)


		{
			
if(p12.getPid()==pizza.getPid())

			{
	
			p12.setQty(p12.getQty()+pizza.getQty());
	
			tempList.add(p12);
	
			System.out.println("---------CANCEL ORDER-----------");
	
			System.out.println("Product Id    :   "+pizza.getPid());

				System.out.println("Product Name  :   "+p12.getPname());

				System.out.println("Product Qty   :   "+pizza.getQty());

				System.out.println("Product Price :   "+p12.getPrice());
	
			System.out.println("-------------------------------");
	
			System.out.println("Total         :   "+(pizza.getQty()*p12.getPrice()));

				System.out.println("-------------ORDER CANCEL SUCCESSFULLY------------");
		
		
			}else{
				tempList.add(p12);
	
		}
		}
		pizzas = new ArrayList<Pizza>();
	
	for(Pizza p6:tempList)
	
	{
		
	pizzas.add(p6);

		}
	
	System.out.println("Thank you.Visit Once again....");
	
	
	}
		
		
		public void placeorder()
		{	tempList = new ArrayList<Pizza>();

		Pizza pizza = new Pizza();

		for(Pizza p8:pizzas)

		{
			
System.out.println(p8);
		
}
		
		
System.out.println("Enter Select Product id ?");

		pizza.setPid(sc.nextInt());

		System.out.println("Enter No of Qty ?");
	
	pizza.setQty(sc.nextInt());
	
	
		for(Pizza p9:pizzas)


		{
			
if(p9.getPid()==pizza.getPid())

			{
	
			p9.setQty(p9.getQty()-pizza.getQty());
	
			tempList.add(p9);
	
System.out.println("----------------------------------");
System.out.println("---------PLACE ORDER--------------");
System.out.println("Product Id    :   "+pizza.getPid());
System.out.println("Product Name  :   "+p9.getPname());
System.out.println("Product Qty   :   "+pizza.getQty());
System.out.println("Product Price :   "+p9.getPrice());
System.out.println("----------------------------------");
System.out.println("Total         :   "+(pizza.getQty()*p9.getPrice()));
System.out.println("-------------------------------");
		
		
			}
else{
				tempList.add(p9);
	
		}
		}
		pizzas = new ArrayList<Pizza>();
	
	for(Pizza p10:tempList)
	
	{
		
	pizzas.add(p10);

		}
	
	System.out.println("..........ORDER PLACED..........");
	
	
	}

	
		
		
			
	@Override
	public void bill() {

		
		tempList = new ArrayList<Pizza>();

			Pizza pizza = new Pizza();

			for(Pizza p4:pizzas)

			{
				
	System.out.println(p4);
			
	}
			
			
	System.out.println("Enter Select Product id ?");

			pizza.setPid(sc.nextInt());

			System.out.println("Enter No of Qty ?");
		
		pizza.setQty(sc.nextInt());
		
		
			for(Pizza p5:pizzas)


			{
				
	if(p5.getPid()==pizza.getPid())

				{
		
				p5.setQty(p5.getQty()-pizza.getQty());
		
				tempList.add(p5);
		
				System.out.println("------------------------------");


					System.out.println("|          BILL              |");
			
			System.out.println("------------------------------");
		
				System.out.println("Product Id    :   "+pizza.getPid());

					System.out.println("Product Name  :   "+p5.getPname());

					System.out.println("Product Qty   :   "+pizza.getQty());

					System.out.println("Product Price :   "+p5.getPrice());
		
				System.out.println("-------------------------------");
		
				System.out.println("Total         :   "+(pizza.getQty()*p5.getPrice()));

					System.out.println("-------------------------------");
			
			
				}else{
					tempList.add(p5);
		
			}
			}
			pizzas = new ArrayList<Pizza>();
		
		for(Pizza p6:tempList)
		
		{
			
		pizzas.add(p6);

			}
		
		System.out.println("Thank you.Visit Once again....");
		
		
		}
		


	@Override
	public void back() {
	PizzaManagement.main(null);
		
	}

}



