package com.sprinttp.spring_v1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Medcin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialiste;
    private String email;
    @OneToMany(mappedBy = "medcin", fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezvous;


}
