package com.sprinttp.spring_v1.repository;

import com.sprinttp.spring_v1.entities.Medcin;
import com.sprinttp.spring_v1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Medcinrepository extends JpaRepository<Medcin,Long> {
    Medcin findById(long id);
}
