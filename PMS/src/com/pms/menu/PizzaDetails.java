package com.pms.menu;

import java.util.List;
import java.util.Scanner;

import com.pma.daoimpl.PizzaDAOimpl;
import com.pms.bean.Pizza;

public class PizzaDetails {
	static Scanner sc = new Scanner(System.in);
	static PizzaDAOimpl pizzaDAO = new PizzaDAOimpl();

	public static void adminMenu1() {
		System.out.println("-----------------------");
		System.out.println("|   ADMIN MAIN MENU   |");
		System.out.println("-----------------------");
		System.out.println("| 1.ADD PRODUCT       |");
		System.out.println("| 2.VIEW PRODUCT      |");
		System.out.println("| 3.VIEW ALL PRODUCTS |");
		System.out.println("| 4.UPDATE PRODUCT    |");
		System.out.println("| 5.DELETE PRODUCT    |");
		System.out.println("| 6.BACK              |");
		System.out.println("-----------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			pizzaDAO.addPizza();
			adminMenu1();
			break;
		case 2:
			System.out.println("Enter Your Search Product Id ?");
			Pizza pizza = pizzaDAO.viewPizza(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "QTY" + "\t" + "PRICE");
			System.out.println("------------------------------------");
			System.out.println(pizza);
			adminMenu1();
			break;
		case 3:
			List<Pizza> pizzas = pizzaDAO.viewAllPizzas();
			System.out.println("PID" + "\t" + "PNAME" + "QTY" + "\t" + "PRICE");
			System.out.println("------------------------------------");
			for (Pizza p : pizzas) {
				System.out.println(p);
			}
			adminMenu1();
			break;
		case 4:
			System.out.println("Enter Updating product Id ?");
			pizzaDAO.updatePizza(sc.nextInt());
			adminMenu1();
			break;
		case 5:
			System.out.println("Enter Deleting Product Id ?");
			pizzaDAO.deletePizza(sc.nextInt());
			adminMenu1();
			break;
		case 6:
			pizzaDAO.back();
		
			break;
		default:
			System.out.println("Please select your choice range 1-6 only");

		}
	}

	public static void customerMenu() {
		System.out.println("-----------------------");
		System.out.println("|  CUSTOMER MAIN MENU |");
		System.out.println("-----------------------");
		System.out.println("| 1.VIEW PRODUCT      |");
		System.out.println("| 2.VIEW ALL PRODUCTS |");
		System.out.println("| 3.BILL              |");
		System.out.println("| 4.BACK              |");
		System.out.println("| 5.CANCEL ORDER      |");
		System.out.println("| 6.PLACE ORDER       |");
		System.out.println("-----------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter Your Search Product Id ?");
			Pizza pizza = pizzaDAO.viewPizza(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" +"\t"+ "QTY" + "\t" + "PRICE");
			System.out.println("------------------------------------");
			System.out.println(pizza);
			customerMenu();
			break;
		case 2:
			List<Pizza> pizzas = pizzaDAO.viewAllPizzas();
			System.out.println("PID" + "\t" + "PNAME" + "QTY" + "\t" + "PRICE");
			System.out.println("------------------------------------");
			for (Pizza p : pizzas) {
				System.out.println(p);
			}
			customerMenu();
			break;
		case 3:
			pizzaDAO.bill();
			customerMenu();
			break;
		case 4:
			pizzaDAO.back();
			break;
		case 5:
			pizzaDAO.cancelorder();
			break;
		case 6:
			pizzaDAO.placeorder();
			break;
		default:
			System.out.println("Please select your choice range 1-4 only");

		}
	}
}



		
	


	




