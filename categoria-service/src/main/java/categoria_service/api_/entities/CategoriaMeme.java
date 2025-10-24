package categoria_service.api_.entities;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "categoria_memes")
public class CategoriaMeme {

    @Id
    @NotNull
    private String id;

    @NotNull
    private String nome;

    @NotNull
    private String descricao;

    @NotNull
    private Date dataCadastro;

    private String usuarioId;
}
