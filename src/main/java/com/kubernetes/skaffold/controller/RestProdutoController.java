package com.kubernetes.skaffold.controller;

import com.kubernetes.skaffold.client.ProdutoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos/v1")
public class RestProdutoController {

    private ProdutoClient produtoClient;

    @Autowired
    public RestProdutoController(final ProdutoClient produtoClient){
        this.produtoClient = produtoClient;
    }

    @GetMapping("/produtos")
    public ResponseEntity<String> getProdutos(){
        return produtoClient.getProdutos();
    }
}
