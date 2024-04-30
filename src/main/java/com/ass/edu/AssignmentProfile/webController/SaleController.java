package com.ass.edu.AssignmentProfile.webController;


import com.ass.edu.AssignmentProfile.model.dto.SaleDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


    @RestController
    @RequestMapping("sale")
    public class SaleController {
        @GetMapping("/all")
        public List<SaleDto> getAllSales(){
            return new ArrayList<>();
        }
        @GetMapping("/{id}")
        public SaleDto getById(@PathVariable("Saleid") long Saleid){
            return new SaleDto();
        }
        @PostMapping("/create")
        public SaleDto createSale(@RequestBody SaleDto saleDto){
            return saleDto;
        }
        @PutMapping("/{id}")
        public SaleDto updateSales(@PathVariable("Saleid") long Saleid,@RequestBody SaleDto saleDto){
            return saleDto;
        }
        @DeleteMapping("/{id}")
        public String deleteSale(@PathVariable("Saleid") long Saleid, @RequestBody SaleDto saleDto){
            return "Successfully Deleted";
        }

    }



