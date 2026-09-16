package com.bank.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Controlador de fallback del API Gateway.
 * Se invoca cuando un microservicio no responde o el circuit breaker esta abierto.
 */
@RestController
public class FallbackController {

    /**
     * Endpoint de fallback para todas las rutas protegidas por circuit breaker.
     * Retorna HTTP 503 (Service Unavailable) con un mensaje descriptivo.
     *
     * @return respuesta de fallback
     */
    @GetMapping("/fallback")
    public ResponseEntity<Map<String, String>> fallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of(
                        "error", "Servicio no disponible temporalmente",
                        "message", "El microservicio solicitado no responde. Intente nuevamente en unos segundos."));
    }
}
