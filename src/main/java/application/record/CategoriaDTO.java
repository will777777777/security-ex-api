package application.record;

import application.model.Categoria;

public record CategoriaDTO(long id, String nome) {
    public CategoriaDTO(Categoria model) {
        this(model.getId(), model.getNome());
    }
}
