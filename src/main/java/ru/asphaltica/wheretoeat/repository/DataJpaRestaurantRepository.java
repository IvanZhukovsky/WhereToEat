package ru.asphaltica.wheretoeat.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DataJpaRestaurantRepository implements RestaurantRepository{
    public boolean delete(int id, int userId) {
        return false;
    }
}
