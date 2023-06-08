package com.muhammet.hastanerandevu.service;

import com.muhammet.hastanerandevu.repository.IBransRepository;
import com.muhammet.hastanerandevu.repository.entity.Brans;
import com.muhammet.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BransService extends ServiceManager<Brans,Long> {
    private final IBransRepository repository;
    public BransService(IBransRepository repository){
        super(repository);
        this.repository = repository;
    }
}
