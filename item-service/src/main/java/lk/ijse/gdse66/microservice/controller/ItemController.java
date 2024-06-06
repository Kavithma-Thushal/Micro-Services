package lk.ijse.gdse66.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kavithma Thushal
 * @project : Micro-Services
 * @since : 12:28 PM - 6/6/2024
 **/
@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping("/getItem")
    public String getItem() {
        return "Item-Service";
    }
}