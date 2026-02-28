package com.sprinttp.spring_v1.service;

import com.sprinttp.spring_v1.entities.Consultation;
import com.sprinttp.spring_v1.entities.Medcin;
import com.sprinttp.spring_v1.entities.Patient;
import com.sprinttp.spring_v1.entities.RendezVous;
import com.sprinttp.spring_v1.repository.Consultationrepository;
import com.sprinttp.spring_v1.repository.Medcinrepository;
import com.sprinttp.spring_v1.repository.Patientrepository;
import com.sprinttp.spring_v1.repository.Rendezvousrepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class HospitalserviceImpl implements Hospitalservice {
    private Patientrepository patientrepository;
    private Consultationrepository consultationrepository;
    private Medcinrepository medcinrepository;
    private Rendezvousrepository rendezvousrepository;

//    public HospitalserviceImpl(Medcinrepository medcinrepository, Consultationrepository consultationrepository, Patientrepository patientrepository, Rendezvousrepository rendezvousrepository) {
//        this.medcinrepository = medcinrepository;
//        this.consultationrepository = consultationrepository;
//        this.patientrepository = patientrepository;
//        this.rendezvousrepository = rendezvousrepository;
//    }

    @Override
    public Patient savepatient(Patient patient) {
        return patientrepository.save(patient);
    }

    @Override
    public Medcin savemedcin(Medcin medcin) {
        return medcinrepository.save(medcin);
    }

    @Override
    public RendezVous saverendezvous(RendezVous rendezvous) {
        return rendezvousrepository.save(rendezvous);
    }

    @Override
    public Consultation saveconsultation(Consultation consultation) {
        return consultationrepository.save(consultation);
    }
//
//    @Override
//    public Patient findpatient(Patient patient) {
//        return patientrepository.findById(patient.getId()).get();
//    }
//
//    @Override
//    public Medcin findmedcin(Medcin medcin) {
//        return medcinrepository.findById(medcin.getId()).get();
//    }
}
