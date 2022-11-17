package com.example.testspringun.Controllers;

import com.example.testspringun.Entity.Client;
import com.example.testspringun.Entity.Fournisseur;
import com.example.testspringun.Services.IClient;
import com.example.testspringun.Services.IFournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@RestController
@RequestMapping("/Fournisseur")
public class FournisseurController {
    @Autowired
    IFournisseur iFournisseur;

    @GetMapping("/getall")
    public List<Fournisseur> retrieveAllFournisseur() {
        return iFournisseur.retrieveAllFournisseur();
    }


    @PostMapping("/add")
    public Fournisseur addClient(@RequestBody Fournisseur f) {
        return iFournisseur.addFournisseur(f);
    }



    @DeleteMapping("/delete/{IDFournisseur}")
    public void deleteFournisseur(@PathVariable Long IDFournisseur){
        iFournisseur.deleteFournisseur(IDFournisseur);}

    @PutMapping("/update")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur f) {
        return iFournisseur.updateFournisseur(f);

    }
    @GetMapping("/getone/{idfournisseur}")
    public Fournisseur retrieveContrat(@PathVariable Long idfournisseur) {
        return iFournisseur.retrieveFournisseur(idfournisseur);
    }

}
