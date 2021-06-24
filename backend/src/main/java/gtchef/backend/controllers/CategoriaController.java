package gtchef.backend.controllers;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import gtchef.backend.models.Categoria;
import gtchef.backend.services.CategoriaService;

@RequiredArgsConstructor
@RestController @RequestMapping("/api")
public class CategoriaController {
  private final CategoriaService service;

  @GetMapping("/categorias")
  public List<Categoria> findAll() {

    return service.findAll();
  }

  @GetMapping("/categorias/{id}")
  public Optional<Categoria> findById(@PathVariable Long id) {

    return service.findById(id);
  }

  @PostMapping("/categorias")
  public Categoria create(@RequestBody Categoria c) {

    return service.save(c);
  }

  @DeleteMapping("/categorias/{id}")
  public Long delete(@PathVariable Long id) {
    service.delete(id);

    return id;
  }
}
