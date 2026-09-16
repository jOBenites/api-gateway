package com.bank.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Aplicacion del API Gateway del sistema bancario.
 * Enruta las peticiones externas (Postman) hacia los microservicios
 * por nombre de servicio resuelto via Eureka.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    /**
     * Punto de entrada de la aplicacion.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
