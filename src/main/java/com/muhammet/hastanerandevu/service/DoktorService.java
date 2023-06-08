package com.muhammet.hastanerandevu.service;

import com.muhammet.hastanerandevu.repository.IDoktorRepository;
import com.muhammet.hastanerandevu.repository.entity.Doktor;
import com.muhammet.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DoktorService extends ServiceManager<Doktor,Long> {
    private final IDoktorRepository repository;
    public DoktorService(IDoktorRepository repository){
        super(repository);
        this.repository = repository;
    }
}
