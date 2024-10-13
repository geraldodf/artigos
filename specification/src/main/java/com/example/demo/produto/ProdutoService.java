package com.example.demo.produto;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository productRepository;

    public ProdutoService(ProdutoRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Produto> obterProdutos(String name, String categoria, Double preco) {

        Specification<Produto> specification = Specification.where(ProdutoSpecification.temNome(name)
                .and(ProdutoSpecification.temCategoria(categoria)
                        .and(ProdutoSpecification.temPrecoMenorOuIgual(preco))));

        return productRepository.findAll(specification);
    }

    public void salvar(Produto produto) {
        productRepository.save(produto);
    }
}
