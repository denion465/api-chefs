package gtchef.backend.services;

import java.util.*;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import gtchef.backend.models.Receita;
import gtchef.backend.repository.ReceitaRepository;

@Service @RequiredArgsConstructor
public class ReceitaService {
  private final ReceitaRepository repository;

  public List<Receita> findAll() {

    return repository.findAll();
  }

  public Optional<Receita> findById(Long id) {

    return repository.findById(id);
  }

  public Receita execute(Receita r) {

    return repository.save(r);
  }

  public void deleteById(Long id) {

    repository.deleteById(id);
  }

  public Receita save(Receita r) {

    return repository.save(r);
  }
}
