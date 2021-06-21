package gtchef.backend.models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Entity @Data
@Getter @Setter @RequiredArgsConstructor
@Table(name = "tb_receitas")
public class Receita {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String nomeReceita;

  @NotNull
  private String tempoPreparo;

  @NotNull @Min(1)
  private String rendimento;

  @NotNull
  private String descricao;

  @ManyToMany
  @JoinTable(name = "rel_categoria_receita",
    joinColumns = @JoinColumn(name = "id_receita", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "id_categoria", referencedColumnName = "id"))
  private List<Categoria> categorias;
}
