package com.edu.product.controller;

import com.edu.product.domain.Product;
import com.edu.product.repository.ProductRepository;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductRepository productRepository;

//    @Autowired
//    UserRepository userRepository;

//    @Autowired
//    FollowRepository followRepository;

    //    @PreAuthorize("hasRole('SELLER')")
//    @PostMapping("/addProduct")
//    public Product addProduct(@Valid @RequestBody Product product){
//        log.info(product.toString());
//        product = productRepository.save(product);
//        return product;
//    }

    @GetMapping("/getProductList")
    public List<Product> getProductList(){

        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @PostMapping("/updateProductCountById/{id}/{count}")
    public Product updateProduct( @RequestBody Product product){
        return product;
    }
}
