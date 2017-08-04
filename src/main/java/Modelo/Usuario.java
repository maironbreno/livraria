package Modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Getter @Setter
@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NM_USUARIO")
    private String nome;

    @Column(name = "TX_EMAIL_USUARIO")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CADASTRO")
    private Calendar dataDeCadastro;

    @Lob
    private byte[] foto;

}
