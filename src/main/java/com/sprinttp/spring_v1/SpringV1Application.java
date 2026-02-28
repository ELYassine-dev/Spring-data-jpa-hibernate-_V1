package com.sprinttp.spring_v1;

import com.sprinttp.spring_v1.entities.*;
import com.sprinttp.spring_v1.repository.Consultationrepository;
import com.sprinttp.spring_v1.repository.Medcinrepository;
import com.sprinttp.spring_v1.repository.Patientrepository;
import com.sprinttp.spring_v1.repository.Rendezvousrepository;
import com.sprinttp.spring_v1.service.Hospitalservice;
import com.sprinttp.spring_v1.service.HospitalserviceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringV1Application  {

    public static void main(String[] args) {
        SpringApplication.run(SpringV1Application.class, args);
    }

    @Bean
    CommandLineRunner start(HospitalserviceImpl hospitalservice,
                            Patientrepository prepository,
                            Medcinrepository mrepository,
                            Rendezvousrepository rrepository,
                            Consultationrepository crepository
                            ) {
        return args -> {
            Stream.of("mohamed","sara","hoda","adil").forEach(name -> {
                Patient patient = new Patient();
                patient.setName(name);
                patient.setDatenaissance(new Date());
                patient.setMalade(Math.random()>0.5);
//                prepository.save(patient);
                hospitalservice.savepatient(patient);
            });
            // ------------------------------------------------------
            Stream.of("jana","omar","nour","hassan").forEach(name -> {
               Medcin medcin = new Medcin();
               medcin.setName(name);
               medcin.setEmail(name+"@gmail.com");
               medcin.setSpecialiste(Math.random()>0.5?"dentiste":"traumato");
               mrepository.save(medcin);
            });
            //--------------------------------------------------
            Patient patient1= prepository.findById(1L);
            Medcin medcin1=mrepository.findById(1L);
            RendezVous rendezvous1 = new RendezVous();
            rendezvous1.setPatient(patient1);
            rendezvous1.setMedcin(medcin1);
            rendezvous1.setId(UUID.randomUUID().toString());
            rendezvous1.setDaterendezvous(new Date());
            rendezvous1.setStatus(Rdv.pending);
            rrepository.save(rendezvous1);
            //----------------------------------------------

            Consultation consultation = new Consultation();
            consultation.setDateconsultation(rendezvous1.getDaterendezvous());
            consultation.setRapport(" consultation en cours de traitement...");
            consultation.setRendezvous(rendezvous1);
            crepository.save(consultation);





        };
    }


}
