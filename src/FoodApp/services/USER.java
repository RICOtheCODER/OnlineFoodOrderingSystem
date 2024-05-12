package FoodApp.services;

import FoodApp.model.Customer;
import FoodApp.model.MenuItem;
import FoodApp.model.Restaurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class USER {
    Scanner sc=new Scanner(System.in);
//    Map<String,Double> priceMap=new HashMap<>();
//
    static HashMap<String, Customer> customerHashMap=
            new HashMap<>(ADMIN.customerMap);
    static Map<String,List<MenuItem>> priceMap=new HashMap<>();
    static String cusName;
    public boolean checkUserValidation(){
        System.out.println("Enter Phone Number : ");
        String  phoneNo=sc.next()+sc.nextLine();
          for(int i=0;i<customerHashMap.size();i++){
              if(customerHashMap.containsKey(phoneNo)){
                  cusName=customerHashMap.get(phoneNo).getName();
                  return true;
              }
          }
          return false;
    }

    public  HashMap<String, Customer> getCustomerHashMap() {
        return customerHashMap;
    }

    public String customerNameFromHashMap(){
        return cusName;
    }

    public void browseMenuItems(){
        System.out.println("1.Search By Location");
        System.out.println("2.Search By Type");
        System.out.println("3.Search By Name");
        System.out.println("Enter Your Choice");
        int choice=sc.nextInt();
        switch (choice){
            case 3:
                System.out.println("Enter name : ");
                String name=sc.next()+sc.nextLine();
               Map<String,List<MenuItem>> mapped=nameMap(name);
               mapped.forEach((k,v)-> System.out.println(k+":"+v));
               break;
        }
    }
    private Map<String ,List<MenuItem>> nameMap(String nameofrest){

        //remove all before and then put
        Map<String,List<MenuItem>> priceMap=new HashMap<>();
//        System.out.println("Enter a name : ");
//        String nameofrest= sc.next()+sc.nextLine();
        //List<Restaurant> restaurantList=ADMIN.getRestaurantList();
        for(Restaurant restaurant : ADMIN.getRestaurantList()){
            if(restaurant.getName().equalsIgnoreCase(nameofrest)){
                priceMap.put(restaurant.getName(),ADMIN.restaurantListMap.get(restaurant));
            }
        }
        return priceMap;
    }
}

