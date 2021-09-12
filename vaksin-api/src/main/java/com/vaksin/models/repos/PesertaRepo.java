package com.vaksin.models.repos;

import com.vaksin.models.entities.Peserta;

import org.springframework.data.repository.CrudRepository;

public interface PesertaRepo extends CrudRepository<Peserta, Long> {
    
}
