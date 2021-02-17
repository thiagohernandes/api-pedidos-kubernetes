package com.kubernetes.skaffold.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api-produtos", path = "/api/v1", url = "${kubernetes.url.v2:#{null}}")
public interface ProdutoClient {

    @RequestMapping(method = RequestMethod.GET, path = "/produtos")
    ResponseEntity<String> getProdutos();

}
