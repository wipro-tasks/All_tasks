package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Restaurant;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getAll() {
        return Arrays.asList(
                new Restaurant(1L, "Ocean Grill", "Dubai"),
                new Restaurant(2L, "Spice Villa", "Abu Dhabi"),
                new Restaurant(3L, "Green Leaf", "Sharjah")
        );
    }
}
