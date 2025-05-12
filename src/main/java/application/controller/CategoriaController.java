package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.CategoriaDTO;
import application.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public Iterable<CategoriaDTO> getAll() {
        return categoriaService.getAll();
    }

    @PostMapping
    public CategoriaDTO insert(@RequestBody CategoriaDTO categoria) {
        return categoriaService.insert(categoria);
    }
}
