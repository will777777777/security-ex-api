package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Categoria;
import application.record.CategoriaDTO;
import application.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepo;

    public Iterable<CategoriaDTO> getAll() {
        return categoriaRepo.findAll().stream().map(CategoriaDTO::new).toList();
    }

    public CategoriaDTO insert(CategoriaDTO categoria) {
        return new CategoriaDTO(categoriaRepo.save(new Categoria(categoria)));
    }
}
