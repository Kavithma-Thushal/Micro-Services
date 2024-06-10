package lk.ijse.gdse66.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Kavithma Thushal
 * @project : Micro-Services
 * @since : 10:40 AM - 6/10/2024
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
}