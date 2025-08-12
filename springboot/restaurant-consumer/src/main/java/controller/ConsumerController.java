
package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import client.RestaurantClient;
import model.Restaurant;

import java.util.List;

@RestController
public class ConsumerController {
    private final RestaurantClient restaurantClient;
    public ConsumerController(RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
    }
    @GetMapping("/consumer/restaurants")
    public List<Restaurant> getFromProducer() {
        return restaurantClient.getRestaurants();
    }
}
