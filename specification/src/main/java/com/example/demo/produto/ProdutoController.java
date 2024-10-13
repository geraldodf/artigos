package com.example.demo.produto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> buscarProdutos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) String categoria,
            @RequestParam(required = false) Double preco) {
        return produtoService.obterProdutos(nome, categoria, preco);
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto) {
        produtoService.salvar(produto);
    }

}