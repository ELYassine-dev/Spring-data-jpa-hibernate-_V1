package com.sprinttp.spring_v1.repository;

import com.sprinttp.spring_v1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Patientrepository extends JpaRepository<Patient,Long> {
    Patient findById(long id);
}
