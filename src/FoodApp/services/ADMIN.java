package FoodApp.services;

import FoodApp.Repository.AdminMethodsRepo;
import FoodApp.Repository.AdminMethodsRepoListImpl;
import FoodApp.model.*;

import java.time.LocalTime;
import java.util.*;

public class ADMIN {

    AdminMethodsRepoListImpl impl=new AdminMethodsRepoListImpl();
    Scanner sc=new Scanner(System.in);
    static Map<Restaurant,List<MenuItem>> restaurantListMap=new HashMap<>();
   static List<Restaurant> restaurantList=new ArrayList<>();

   static List<Customer> customerList=new ArrayList<>();

   static Map<String,Customer> customerMap=new HashMap<>();
    public void addRestaurants(){
        long restID=1;
        System.out.println("Enter the name of restaurant : ");
        String name=sc.next()+sc.nextLine();
        System.out.println("Enter the type of restaurant : ");
        String cuisineType=sc.nextLine();
        System.out.println("Enter Location : ");
        String location=sc.nextLine();
        System.out.println("Enter opening time : ");
        int otime=sc.nextInt();
        System.out.println("Enter Closing Time : ");
        int ctime=sc.nextInt();
        System.out.println("Enter no of MenuItems : ");
        int n=sc.nextInt();
        List<MenuItem> itemList=new ArrayList<>();
        while(n-- >0){
            System.out.println("Enter Item : ");
            String itemName= sc.next()+sc.nextLine();
            System.out.println("Enter Price : ");
            double price=sc.nextDouble();
            System.out.println("Enter the Type : ");
            String type= sc.next()+sc.nextLine();
            System.out.println("Enter the calories");
            double calorieCount= sc.nextDouble();
            ItemType itemstype = null;
            if(type.equalsIgnoreCase("Nonveg")){
                itemstype=ItemType.NON_VEG;
            }if(type.equalsIgnoreCase("Veg")){
                itemstype=ItemType.VEG;
            }if(type.equalsIgnoreCase("Vegan")){
                itemstype=ItemType.VEGAN;
            }
            MenuItem itemObj=new MenuItem(itemName,price,itemstype,calorieCount);
            System.out.println("Menu Item : " +itemObj.getName()+ " Added");
            itemList.add(itemObj);
        }
        CuisineType typeofCuisines=null;
        if(cuisineType.equalsIgnoreCase("Fast Food")){
                 typeofCuisines=CuisineType.FAST_FOOD_RESTAURANT;
        }if(cuisineType.equalsIgnoreCase("Fine Dining")){
                 typeofCuisines=CuisineType.FINE_DINING_RESTAURANT;
        }
        Restaurant restaurant=new FastFoodRestaurant(restID,name,typeofCuisines,location,
                LocalTime.of(otime,00),LocalTime.of(ctime,00),itemList);

        restID++;
        System.out.println("Restaurant : "+restaurant.getName()+" added");
        restaurantList.add(restaurant);
        restaurantListMap.put(restaurant,itemList);
    }

    public void displayRestaurants(){
//        restaurantList.forEach(System.out::println);
        if(restaurantListMap.isEmpty()){
            System.out.println("No Restaurants added ");
        }
        else {
            restaurantListMap.forEach((k, v) -> System.out.println(k + ":" + v));
        }
    }

    public void addUser(){
        System.out.println("Enter your Name : ");
        String cName=sc.next()+sc.nextLine();
        System.out.println("Enter your Location : ");
        String cLocation=sc.next()+sc.nextLine();
        System.out.println("Enter your phone No");
        String cPhoneNo=sc.nextLine();
        Customer customer=new Customer(Customer.getCust_id(),cName,cLocation,cPhoneNo);
        customerList.add(customer);
        customerMap.put(cPhoneNo,customer);
    }

    public void getUserDetails(){
        System.out.println("Enter the Phone Number");
        double number= sc.nextDouble();
        for(int i=0;i<customerMap.size();i++){
            if(customerMap.containsKey(number)){
                System.out.println(customerMap.get(number));
            }
            else{
                System.out.println("Customer not present");
            }
        }
    }

    public  List<Customer> getCustomerList() {
        return customerList;
    }

    public  Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public static Map<Restaurant, List<MenuItem>> getRestaurantListMap() {
        return restaurantListMap;
    }

    public static List<Restaurant> getRestaurantList() {
        return restaurantList;
    }
}
