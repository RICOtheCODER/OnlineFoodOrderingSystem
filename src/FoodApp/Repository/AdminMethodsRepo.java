package FoodApp.Repository;

import FoodApp.model.CuisineType;
import FoodApp.model.Customer;
import FoodApp.model.MenuItem;
import FoodApp.model.Restaurant;

import java.util.List;

public interface AdminMethodsRepo {

    void addRestaurant(Restaurant restaurant);

    void addUser(Customer customer);

    public void setActivationStatus(boolean status,long id);

    public void displayAllRestaurants();

    public void updateMenuItem(MenuItem item);

    public Restaurant getRestaurantById(long id);

    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();

    public List<Restaurant> findAllDeactivatedRestaurant();

}
