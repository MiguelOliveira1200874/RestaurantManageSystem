package com.RestaurantesMiguel.RestaurantesManagement.service;

import com.RestaurantesMiguel.RestaurantesManagement.model.Table.RestaurantTable;
import com.RestaurantesMiguel.RestaurantesManagement.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TableService.java
@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    public RestaurantTable findAvailableTable() {
        return tableRepository.findTopByIsOccupiedFalse();
    }
/*
    public void occupyTable(Long tableId) {
        RestaurantTable restaurantTable = tableRepository.findById(tableId).orElseThrow(() -> new RuntimeException("Table not found"));
        restaurantTable.setAvailable(false);
        tableRepository.save(restaurantTable);
    }

 */
}
