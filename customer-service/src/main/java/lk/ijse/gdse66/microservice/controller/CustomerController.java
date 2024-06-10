package lk.ijse.gdse66.microservice.controller;

import lk.ijse.gdse66.microservice.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Kavithma Thushal
 * @project : Micro-Services
 * @since : 12:28 PM - 6/6/2024
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping("/getCustomer")
    public String getCustomer() {
        return "Get Customers Successfully...!";
    }

    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.getId());
        System.out.println(customerDTO.getName());
        System.out.println(customerDTO.getAddress());
    }
}