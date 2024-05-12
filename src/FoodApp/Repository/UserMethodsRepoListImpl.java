package FoodApp.Repository;

import FoodApp.model.CuisineType;
import FoodApp.model.Restaurant;

import java.util.List;

public class UserMethodsRepoListImpl implements UserMethodsRepo {

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
}
