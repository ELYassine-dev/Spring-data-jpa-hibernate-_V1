package com.sprinttp.spring_v1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class RendezVous {
    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    @Temporal(TemporalType.DATE)
    private Date  daterendezvous;
    @Enumerated(EnumType.STRING)
    private Rdv status;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medcin medcin;
    @OneToOne(mappedBy = "rendezvous")
    private Consultation consultation;


}
