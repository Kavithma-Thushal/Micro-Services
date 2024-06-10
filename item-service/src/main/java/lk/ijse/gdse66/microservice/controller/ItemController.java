package lk.ijse.gdse66.microservice.controller;

import lk.ijse.gdse66.microservice.dto.ItemDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Kavithma Thushal
 * @project : Micro-Services
 * @since : 12:28 PM - 6/6/2024
 **/
@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @GetMapping("/getItem")
    public String getItem() {
        return "Get Items Successfully...!";
    }

    @PostMapping("/saveItem")
    public void saveCustomer(@RequestBody ItemDTO itemDTO) {
        System.out.println(itemDTO.getCode());
        System.out.println(itemDTO.getDescription());
        System.out.println(itemDTO.getPrice());
    }
}