package client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import model.Restaurant;

import java.util.List;

@FeignClient(name = "restaurant-producer")
public interface RestaurantClient {
    @GetMapping("/restaurants")
    List<Restaurant> getRestaurants();
}
