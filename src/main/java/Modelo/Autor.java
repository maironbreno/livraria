package Modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@Entity
@Table(name = "TB_AUTOR")
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_AUTOR")
    private Long id;

    @Column(name = "NM_AUTOR")
    private String nome;

    @Column(name = "TX_EMAIL_AUTOR")
    private String email;

}
