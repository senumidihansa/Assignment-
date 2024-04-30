package com.ass.edu.AssignmentProfile.webController;

import com.ass.edu.AssignmentProfile.model.dto.InventoryDto;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("stock")
public class InventoryController {
    @GetMapping("/all")
    public List<InventoryDto> getAllSales() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public InventoryDto getById(@PathVariable(" id") long id) {
        return new InventoryDto();
    }

    @PostMapping("/create")
    public InventoryDto createStock(@RequestBody InventoryDto inventoryDto) {
        return inventoryDto;
    }

    @PutMapping("/{id}")
    public InventoryDto updateStock(@PathVariable("id") long  id, @RequestBody InventoryDto inventoryDto) {
        return inventoryDto;
    }

    @DeleteMapping("/{id}")
    public String deleteStock(@PathVariable(" id") long  id, @RequestBody InventoryDto inventoryDto) {
        return "Successfully Deleted";
    }
}