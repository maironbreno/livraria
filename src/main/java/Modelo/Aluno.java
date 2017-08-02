package Modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "TB_ALUNO")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ALUNO")
    private Long id;

    @Column(name = "NM_ALUNO")
    private String nome;

    @Column(name = "TX_EMAIL_ALUNO")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_NASCIMENTO")
    private Date nascimento;

    @Transient
    private Integer idade;

}