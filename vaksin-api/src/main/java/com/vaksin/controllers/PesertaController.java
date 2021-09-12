package com.vaksin.controllers;


import com.vaksin.models.entities.Peserta;
import com.vaksin.services.PesertaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/peserta")
public class PesertaController {
    
    @Autowired
    private PesertaService pesertaService;

    // Call Function Create Data From Service
    @PostMapping
    public Peserta createDataPeserta(@RequestBody Peserta peserta){
        return pesertaService.createData(peserta);
    }

    // Call Function View All From Service
    @GetMapping
    public Iterable<Peserta>vieAll(){
        return pesertaService.viewAll();
    }

    // Call Function Find By ID From Service
    @GetMapping("/{id}")
    public Peserta findById(@PathVariable("id") long id){
        return pesertaService.findById(id);
    }

    
    // @PutMapping
    // public Peserta updateDataPeserta(@RequestBody Peserta peserta){
    //     return pesertaService.createData(peserta);
    // }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        pesertaService.removeOne(id);
    }

    // Call Function Update Data From Service
    @PutMapping("/{id}")
    public ResponseEntity<Peserta>updatePeserta(@PathVariable long id, @RequestBody Peserta peserta){
        Peserta peserta2 = pesertaService.findById(id);

        peserta2.setNik(peserta.getNik());
        peserta2.setNamapeserta(peserta.getNamapeserta());
        peserta2.setAlamat(peserta.getAlamat());
        peserta2.setEmail(peserta.getEmail());
        peserta2.setNomortelepon(peserta.getNomortelepon());
       
        Peserta updatePeserta = pesertaService.createData(peserta);
        return ResponseEntity.ok(updatePeserta);

    }


}
