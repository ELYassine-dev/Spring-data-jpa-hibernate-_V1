package com.sprinttp.spring_v1.repository;

import com.sprinttp.spring_v1.entities.Patient;
import com.sprinttp.spring_v1.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rendezvousrepository extends JpaRepository<RendezVous,Long> {
}
