# Inclusión de un servicio Rest y un JAX-RS WS en un mismo proyecto

## Introducción

Se desea migrar a un servicio rest existente un proyecto JAX-RS. Para ello se definen 2 DispatcherServlet que atienden a cada uno de estos servicios. 

## End Points

1. GET /rest/greeting: Se ejecutan los beans que pertenecen al Servicio Rest.
2. GET /services/: Indica los servicios manejados por el JAX-RS WS.