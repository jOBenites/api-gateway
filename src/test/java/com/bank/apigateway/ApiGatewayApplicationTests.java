package com.bank.apigateway;

import com.bank.apigateway.controller.FallbackController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Pruebas unitarias para la aplicacion api-gateway.
 * Verifica que los componentes principales se pueden instanciar.
 */
class ApiGatewayApplicationTests {

    @Test
    void fallbackControllerCanBeInstantiated() {
        FallbackController controller = new FallbackController();
        assertNotNull(controller);
    }
}
