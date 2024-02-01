package com.corenetworks.relacionnm.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(ConsultaAnalitica.class)
@Table (name = " consulta_analitica2")

public class ConsultaAnalitica {
    @Id

    private Consulta2 Consulta;
    @Id
    private  Analitica2 analitica;

}
