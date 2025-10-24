package categoria_service.api_.controller;

import categoria_service.api_.entities.CategoriaMeme;
import categoria_service.api_.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<CategoriaMeme> buscaCategoria() {
        return categoriaService.listaTodasCategorias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaMeme> getCategoriaById(@PathVariable String id) {
        return categoriaService.getCategoriaById(id)
                .map(categoria -> ResponseEntity.ok(categoria))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return categoriaService.novaCategoriaMeme(categoriaMeme);
    }

}
