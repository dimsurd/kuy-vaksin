package com.vaksin.services;

import javax.transaction.Transactional;

import com.vaksin.models.entities.Peserta;
import com.vaksin.models.repos.PesertaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Transactional
public class PesertaService {

    @Autowired
    private PesertaRepo pesertaRepo;

    // For Create Data and Update Data Peserta
    public Peserta createData(@RequestBody Peserta peserta){
        return pesertaRepo.save(peserta);
    }

    // View All Data From Table Peserta
    public Iterable<Peserta>viewAll(){
        return pesertaRepo.findAll();
    }

    // Find Data By Id
    public Peserta findById(Long id){
        return pesertaRepo.findById(id).get();
    }

    // Remove Daya By Id
    public void removeOne(long id){
        pesertaRepo.deleteById(id);
    }


    
}
