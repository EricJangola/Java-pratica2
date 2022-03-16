package pro.gsilva.catalogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pro.gsilva.catalogo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query("select m from Categoria m where m.nome like :nome")
    List<Categoria> findAllWithNomeLike(String nome);

    @Query("select m from Categoria m where m.nome like :nome")
    List<Categoria> findAllCategorias(String nome);
}
