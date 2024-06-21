package lk.ijse.gdse66.microservice.controller;

import lk.ijse.gdse66.microservice.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Kavithma Thushal
 * @project : Micro-Services
 * @since : 12:28 PM - 6/6/2024
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    public RestTemplate restTemplate;

    /* URL --> http://localhost:8080/api/v1/customer/getCustomer */
    @GetMapping("/getCustomer")
    public String getCustomer() {
        return restTemplate.getForObject("http://api-gateway/api/v1/item/getItem", String.class);
    }

    /* URL --> http://localhost:8080/api/v1/customer/saveCustomer */
    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody CustomerDTO customerDTO) {
        restTemplate.postForObject("http://api-gateway/api/v1/item/saveItem", customerDTO, CustomerDTO.class);
    }
}