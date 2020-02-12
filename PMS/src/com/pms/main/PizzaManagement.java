package com.pms.main;
import java.util.Scanner;

import com.pms.menu.PizzaDetails;
public class PizzaManagement {
	



		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("-------------------------------");
				System.out.println("|  PIZZA MANAGEMENT SYSTEM  |");
				System.out.println("-------------------------------");
				System.out.println("|  1. ADMIN                   |");
				System.out.println("|  2. CUSTOMER                |");
				System.out.println("|  3. EIXT                    |");
				System.out.println("-------------------------------");
				System.out.println("Enter Your Choice ?");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					PizzaDetails.adminMenu1();
					break;
				case 2:
					PizzaDetails.customerMenu();
					break;
				case 3:
					System.exit(0);
				case 4:
					PizzaDetails.customerMenu();
					break;
				default:
					System.out.println("Please select choice range 1-3 only");
				}
			}

		}

	}



