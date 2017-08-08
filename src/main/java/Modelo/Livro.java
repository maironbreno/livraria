package Modelo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
@Getter @Setter
@Entity
@Table(name = "TB_LIVRO")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_LIVRO")
    private Long Id;

    @Column(name = "NM_LIVRO")
    private String nome;

    @ManyToMany
    private Collection<Autor> autores = new ArrayList<Autor>();
}
