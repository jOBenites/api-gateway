# api-gateway

API Gateway del sistema bancario. Enruta peticiones externas hacia los microservicios por nombre de servicio via Eureka.

## Puerto

- **8080**

## Rutas

| Path | Microservicio |
|------|---------------|
| `/customers/**` | ms-customer |
| `/accounts/**` | ms-account |
| `/credits/**` | ms-credit |
| `/credit-cards/**` | ms-creditcard |

## Levantar

```bash
mvn spring-boot:run
```

## Dependencia

- **service-registry** (Eureka) debe estar corriendo en puerto 8761.
