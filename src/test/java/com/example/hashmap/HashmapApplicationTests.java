package com.example.hashmap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class HashmapApplicationTests {
    public static void main(String[] args) {


        Map<Integer, String> myFavoriteColors = new HashMap<>();
        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);

        Map<Integer, String> myFriendsFavoriteColors = new HashMap<>();
        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColors);

        Map<Integer, String> ourFavoriteColors = new HashMap<>();
        ourFavoriteColors.putAll(myFriendsFavoriteColors);
        ourFavoriteColors.putAll(myFavoriteColors);
        System.out.println("Values in third map: " + ourFavoriteColors);
    }
}