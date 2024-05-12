package FoodApp.services;

import java.util.Scanner;

public class AdminController {
    Scanner sc = new Scanner(System.in);
     ADMIN admin=new ADMIN();
    public void start() {
        while (true) {
            System.out.println("====Welcome to Admin====");
            System.out.println("1.Add New Restaurant : ");
            System.out.println("2.Update New Restaurant : ");
            System.out.println("3.Set Activation Status : ");
            System.out.println("4.Display All Restaurants : ");
            System.out.println("5.Add Customer : ");
            System.out.println("6.Search Customer : ");
            System.out.println("7.Exit");
            int choice= sc.nextInt();
            switch (choice){
                case 1 :
                admin.addRestaurants();
                break;
                case 4:
                    admin.displayRestaurants();
                    break;
                case 5 :
                    admin.addUser();
                    break;
                case 6:
                    admin.getUserDetails();
                    break;
                case 7:return;
            }
        }
    }
}
