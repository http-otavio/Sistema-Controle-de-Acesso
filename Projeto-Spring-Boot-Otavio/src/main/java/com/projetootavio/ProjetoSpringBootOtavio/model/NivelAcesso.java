package com.projetootavio.ProjetoSpringBootOtavio.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class NivelAcesso {
    //variáveis dessa classe
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

}
