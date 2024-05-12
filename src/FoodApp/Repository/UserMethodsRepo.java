package FoodApp.Repository;

import FoodApp.model.CuisineType;
import FoodApp.model.Restaurant;

import java.util.List;

public interface UserMethodsRepo {
    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();
}
