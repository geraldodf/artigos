package com.example.demo.produto;


import org.springframework.data.jpa.domain.Specification;

public class ProdutoSpecification {

    public static Specification<Produto> temNome(String nome) {
        return (root, query, criteriaBuilder) ->
                nome == null ? null : criteriaBuilder.equal(root.get("nome"), nome);
    }

    public static Specification<Produto> temCategoria(String categoria) {
        return (root, query, criteriaBuilder) ->
                categoria == null ? null : criteriaBuilder.equal(root.get("categoria"), categoria);
    }

    public static Specification<Produto> temPrecoMenorOuIgual(Double preco) {
        return (root, query, criteriaBuilder) ->
                preco == null ? null : criteriaBuilder.lessThanOrEqualTo(root.get("preco"), preco);
    }
}
