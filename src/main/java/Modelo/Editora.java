package Modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@Entity
@Table(name = "TB_EDITORA")
public class Editora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_EDITORA")
    private Long id;

    @Column(name = "NM_EDITORA")
    private String nome;

    @Column(name = "TX_EMAIL_EDITORA")
    private String email;

}
