package com.sprinttp.spring_v1.service;

import com.sprinttp.spring_v1.entities.Consultation;
import com.sprinttp.spring_v1.entities.Medcin;
import com.sprinttp.spring_v1.entities.Patient;
import com.sprinttp.spring_v1.entities.RendezVous;

public interface Hospitalservice {

     Patient savepatient(Patient patient);
     Medcin savemedcin(Medcin medcin);
     RendezVous saverendezvous(RendezVous rendezvous);
     Consultation saveconsultation(Consultation consultation);
//     Patient findpatient(Patient patient);
//     Medcin findmedcin(Medcin medcin);







}
