package com.muhammet.hastanerandevu.service;

import com.muhammet.hastanerandevu.repository.IHastaRepository;
import com.muhammet.hastanerandevu.repository.entity.Hasta;
import com.muhammet.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HastaService extends ServiceManager<Hasta,Long> {
    private final IHastaRepository repository;

    public HastaService(IHastaRepository repository){
        super(repository);
        this.repository = repository;
    }
}
