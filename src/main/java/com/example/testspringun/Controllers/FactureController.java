package com.example.testspringun.Controllers;

import com.example.testspringun.Services.IFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Facture")
public class FactureController {
    @Autowired
    IFacture iFacture;

}
