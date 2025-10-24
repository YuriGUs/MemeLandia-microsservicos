
package categoria_service.api_.service;

import categoria_service.api_.entities.CategoriaMeme;
import categoria_service.api_.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return categoriaRepository.save(categoriaMeme);
    }

    public Optional<CategoriaMeme> getCategoriaById(String id) {
        return categoriaRepository.findById(id);
    }

    public List<CategoriaMeme> listaTodasCategorias() { return categoriaRepository.findAll(); }
}
