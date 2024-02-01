package com.corenetworks.relacionnm.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Conductores")

public class Conductor {

         @Id
        @Column(length =7)
        private String dni;
        @Column(length =60)
        private String Nombre;


    }

