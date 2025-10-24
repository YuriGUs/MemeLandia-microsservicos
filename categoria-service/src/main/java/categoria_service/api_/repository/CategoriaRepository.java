package categoria_service.api_.repository;

import categoria_service.api_.entities.CategoriaMeme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<CategoriaMeme, String> {
}
