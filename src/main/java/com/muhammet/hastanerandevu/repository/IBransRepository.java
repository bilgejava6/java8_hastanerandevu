package com.muhammet.hastanerandevu.repository;

import com.muhammet.hastanerandevu.repository.entity.Brans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBransRepository extends JpaRepository<Brans,Long> {
}
