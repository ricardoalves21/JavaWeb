package com.ricardo.apirest2.model;

import javax.persistence.*;
import java.util.Objects;

@Entity  // Esta anotação @Entity diz que esta classe faz parte de uma entidade, ou seja, uma tebela no banco de dados.
public class Cliente {

    @Id  // Esta anotação @Id diz que esta propriedade é um campo com id, ou seja, uma chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Geração automática de valores pelo próprio BD (auto incremento).
    private Long id;  // Esta propriedade possui a referência de id em uma coluna da tabela Cliente.

    @Column(nullable = false)  // A anotação @Column diz que é uma coluna da tabela Cliente e o campo não pode ser null, por isso nullable = false.
    private String nome;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
