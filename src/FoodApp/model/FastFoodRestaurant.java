package FoodApp.model;

import java.time.LocalTime;
import java.util.List;

public class FastFoodRestaurant extends Restaurant{
    public FastFoodRestaurant(long restaurantId, String name, CuisineType cuisineType, String location, LocalTime openingTime, LocalTime closingTime, List<MenuItem> menuItems) {
        super(restaurantId, name, cuisineType, location, openingTime, closingTime, menuItems);
    }


}
