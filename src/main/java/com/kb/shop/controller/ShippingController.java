package com.kb.shop.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    // POST method to create shipping information
    @PostMapping
    public String createShippingInfo() {
        // Implement logic to create shipping information
        return "Shipping information created";
    }

    // PUT method to update shipping status
    @PutMapping
    public String updateShippingStatus() {
        // Implement logic to update shipping status
        return "Shipping status updated";
    }

    // GET method to retrieve shipping information
    @GetMapping
    public String getShippingInfo() {
        // Implement logic to retrieve shipping information
        return "Shipping information retrieved";
    }
}
