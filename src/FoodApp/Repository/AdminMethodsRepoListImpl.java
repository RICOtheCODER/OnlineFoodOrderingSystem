package FoodApp.Repository;

import FoodApp.model.CuisineType;
import FoodApp.model.Customer;
import FoodApp.model.MenuItem;
import FoodApp.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class AdminMethodsRepoListImpl implements AdminMethodsRepo{

    static List<Restaurant> restaurantList=new ArrayList<>();
    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }


    @Override
    public void addUser(Customer customer) {

    }

    @Override
    public void setActivationStatus(boolean status, long id) {

    }

    @Override
    public void displayAllRestaurants() {
        restaurantList.forEach(System.out::println);
    }

    @Override
    public void updateMenuItem(MenuItem item) {

    }

    @Override
    public Restaurant getRestaurantById(long id) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        return null;
    }

    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        return null;
    }

    @Override
    public List<Restaurant> findAllDeactivatedRestaurant() {
        return null;
    }


}
