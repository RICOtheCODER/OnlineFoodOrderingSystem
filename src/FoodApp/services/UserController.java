package FoodApp.services;

import java.util.Scanner;

public class UserController {
    Scanner sc = new Scanner(System.in);
    USER user=new USER();

    public void start() {
        while (true) {
            if (user.checkUserValidation() == true) {
                System.out.println("Welcome "+USER.cusName);
                System.out.println("====Welcome to User====");
                System.out.println("1.Browse Menus");
                System.out.println("7.Exit");
                System.out.println("Enter your Choice");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        user.browseMenuItems();
                }
            }
            else {
                System.out.println("User PhoneNo doesnt Exist ");
                return;
            }
        }

    }
}
