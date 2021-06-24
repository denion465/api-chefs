package gtchef.backend.controllers;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import gtchef.backend.models.Receita;
import gtchef.backend.services.ReceitaService;

@RequiredArgsConstructor
@RestController @RequestMapping("/api")
public class ReceitaController {
  private final ReceitaService service;

  @GetMapping("/receitas")
  public List<Receita> findAll() {

    return service.findAll();
  }

  @GetMapping("/receitas/{id}")
  public Optional<Receita> findById(@PathVariable Long id) {

    return service.findById(id);
  }

  @PostMapping("/receitas")
  public Receita create(@RequestBody Receita r) {

    return service.save(r);
  }

  @DeleteMapping("/receitas/{id}")
  public Long delete(@PathVariable Long id) {
    service.deleteById(id);

    return id;
  }
}
