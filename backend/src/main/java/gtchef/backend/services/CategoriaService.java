package gtchef.backend.services;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import gtchef.backend.models.Categoria;
import gtchef.backend.repository.CategoriaRepository;

@Service @RequiredArgsConstructor
public class CategoriaService {
  private final CategoriaRepository repository;

  public List<Categoria> findAll() {

    return repository.findAll();
  }

  public Optional<Categoria> findById(Long id) {

    return repository.findById(id);
  }

  public Categoria execute(Categoria categoria) {

    return repository.save(categoria);
  }

  public Long delete(Long id) {
    repository.deleteById(id);

    return id;
  }

}
