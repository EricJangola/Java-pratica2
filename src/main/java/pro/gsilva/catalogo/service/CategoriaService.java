package pro.gsilva.catalogo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pro.gsilva.catalogo.model.Categoria;

public interface CategoriaService {
    Page<Categoria> findAll(Pageable pageable);
    Categoria save(Categoria musica);
    Categoria findById(long id);
    void excluir(long id);
    List<Categoria> findAllCategorias();
    List<Categoria> findByNome(String titulo);
}
