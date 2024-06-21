package lk.ijse.gdse66.microservice.controller;

import lk.ijse.gdse66.microservice.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Kavithma Thushal
 * @project : Micro-Services
 * @since : 12:28 PM - 6/6/2024
 **/
@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    public RestTemplate restTemplate;

    /* URL --> http://localhost:8082/api/v1/item/getItem */
    @GetMapping("/getItem")
    public String getItem() {
        return "Get Items Successfully...!";
    }

    /* URL --> http://localhost:8082/api/v1/item/saveItem */
    @PostMapping("/saveItem")
    public void saveCustomer(@RequestBody ItemDTO itemDTO) {
        System.out.println(itemDTO.getCode());
        System.out.println(itemDTO.getDescription());
        System.out.println(itemDTO.getPrice());
    }
}