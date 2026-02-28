package com.sprinttp.spring_v1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    private Boolean malade;
    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezvous;


}
