package com.lucas.rest.hard;

import com.lucas.rest.product.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hard")
public class HardController {

    @GetMapping("example-one")
    public ResponseEntity<List<ProductDTO>> listProducts(){
        return ResponseEntity.ok(List.of(new ProductDTO(12, "JBL")));
    }

    @GetMapping("example-two")
    public ResponseEntity<List<ProductDTO>> listProductsNotFound() {
        return ResponseEntity.notFound().build();
    }

    @GetMapping("example-three")
    public ResponseEntity<List<ProductDTO>> listProducts400() {
        return ResponseEntity.status(400).build();
    }


}
