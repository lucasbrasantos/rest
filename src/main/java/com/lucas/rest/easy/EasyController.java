package com.lucas.rest.easy;


import com.lucas.rest.product.ProductDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/easy")
public class EasyController {

    @GetMapping
    public String search() {
        return "GET - EasyController";
    }

    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDTO) {
        return productDTO;
    }

    @PutMapping
    public ProductDTO update(@RequestBody ProductDTO productDTO) {
        return productDTO;
    }

    @DeleteMapping
    public void delete(@RequestParam(value = "id") int id) {
        System.out.println("Delete - EasyController | id: " + id);
    }

}
