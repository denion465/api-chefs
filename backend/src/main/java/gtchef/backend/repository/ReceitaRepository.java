package gtchef.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gtchef.backend.models.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {}
