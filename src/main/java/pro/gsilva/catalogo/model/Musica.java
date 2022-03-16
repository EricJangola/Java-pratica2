package pro.gsilva.catalogo.model;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.ManyToAny;
import lombok.Data;

@Entity
@Table(name = "TB_MUSICA")
@Data
public class Musica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotBlank
    public String autor;

    @NotBlank
    public String titulo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", locale = "UTC-03")
    public LocalDate data;

    @NotBlank
    @Lob
    public String letra;
   
    @ManyToOne
    @JoinColumn(name="categoria_id", nullable=false)
    public Categoria categoria = new Categoria();

    @Transient
    public Long categoriaId;

    public Long getCategoriaId() {
        return id;
    }

    public void setCategoriaId(Long id) {
        this.categoriaId = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    
}
