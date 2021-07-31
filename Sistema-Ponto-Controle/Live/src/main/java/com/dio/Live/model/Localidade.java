package com.dio.Live.model;


import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Localidade {
    @Id
    @GeneratedValue

    private long id;

    @ManyToOne//Relacionamento 1 pra N
    private NivelAcesso nivelAcesso; //RELACIONAMENTO
    private String descricao;

}
