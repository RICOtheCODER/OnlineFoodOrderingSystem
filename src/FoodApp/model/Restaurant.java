package FoodApp.model;

import FoodApp.services.ADMIN;

import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {
    private static long restaurantId;
    private String name;
    private CuisineType cuisineType;
    private String location;
    private LocalTime openingTime;
    private LocalTime closingTime;
    static List<List<MenuItem>> menuItems;
    static  List<MenuItem> menu=new ArrayList<>();
    private boolean isActive;



    public Restaurant(long restaurantId, String name, CuisineType cuisineType, String location,
                      LocalTime openingTime, LocalTime closingTime,
                      List<MenuItem> menuItems) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.cuisineType = cuisineType;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;

    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public static List<List<MenuItem>> getMenuItems() {
        return menuItems;
    }

    public static void setMenuItems(List<List<MenuItem>> menuItems) {
        Restaurant.menuItems = menuItems;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static List<MenuItem> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
