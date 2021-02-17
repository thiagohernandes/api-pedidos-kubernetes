package com.kubernetes.skaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.kubernetes.skaffold")
public class ApiPedidosKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPedidosKubernetesApplication.class, args);
	}

}
