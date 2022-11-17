package com.example.testspringun.Controllers;

import com.example.testspringun.Services.IStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Stock")
public class StockController {
    @Autowired
    IStock iStock;
}
