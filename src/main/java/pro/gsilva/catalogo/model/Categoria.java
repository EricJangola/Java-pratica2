package pro.gsilva.catalogo.model;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Data
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotNull
    @Length(max = 30)
    @NotBlank
    public String nome;

    @OneToMany
    public List<Musica> musicas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
