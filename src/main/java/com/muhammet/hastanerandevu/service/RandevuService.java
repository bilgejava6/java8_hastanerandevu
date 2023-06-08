package com.muhammet.hastanerandevu.service;

import com.muhammet.hastanerandevu.repository.IRandevuRepository;
import com.muhammet.hastanerandevu.repository.entity.Randevu;
import com.muhammet.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RandevuService extends ServiceManager<Randevu,Long> {
    private final IRandevuRepository repository;
    public RandevuService(IRandevuRepository repository){
        super(repository);
        this.repository = repository;
    }
}
