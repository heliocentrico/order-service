package com.example;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Order {
    private Integer orderId;
    private Date date;
    private Integer quantity;
    private Double total;

}
