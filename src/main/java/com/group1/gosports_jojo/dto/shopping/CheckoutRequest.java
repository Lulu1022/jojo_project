package com.group1.gosports_jojo.dto.shopping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest {
    private Integer userId;
    private List<CheckoutItem> items;
    private String address;
}
