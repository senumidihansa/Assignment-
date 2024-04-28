package com.ass.edu.AssignmentProfile.webController;

import com.ass.edu.AssignmentProfile.model.dto.ProductsDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @GetMapping("/all")
    public List<ProductsDto> getAllProducts(){
        return new ArrayList<>();
    }
    @GetMapping("/{id}")
    public ProductsDto getById(@PathVariable("id") long id){
        return new ProductsDto();
    }
    @PostMapping("/create")
    public ProductsDto createProduct(@RequestBody ProductsDto productsDto){
        return productsDto;
    }
    @PutMapping("/{id}")
    public ProductsDto updateProduct(@PathVariable("id") long id,@RequestBody ProductsDto productsDto){
        return productsDto;
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") long id, @RequestBody ProductsDto productsDto){
        return "Successfully Deleted";
    }

}
