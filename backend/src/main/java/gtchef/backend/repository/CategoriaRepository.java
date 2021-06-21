package gtchef.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gtchef.backend.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
