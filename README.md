# API REST en Spring Boot con CI/CD y Despliegue en la Nube

## Arquitecturas en la Nube

### Datos del estudiante
- **Nombre y apellidos:** Arantza Alcázar
- **Fecha de entrega:** 15-01-2026 

---

## Descripción del proyecto

Este proyecto consiste en el desarrollo de una **API REST mínima con Spring Boot**, cuyo objetivo principal es validar un **flujo completo de Integración Continua (CI) y Despliegue Continuo (CD)** utilizando herramientas profesionales del entorno DevOps.

Cada cambio enviado al repositorio activa automáticamente un pipeline que compila, valida y despliega la aplicación en la nube mediante **GitHub Actions** y **AWS Elastic Beanstalk**.

---

## Objetivos de la actividad

Al finalizar esta práctica se habrá adquirido la capacidad de:

- Desarrollar una API REST básica con **Spring Boot**.
- Gestionar el control de versiones mediante **Git y GitHub**.
- Automatizar la integración continua con **GitHub Actions**.
- Desplegar automáticamente una aplicación Java en la nube con **AWS Elastic Beanstalk**.
- Comprender el impacto del uso de recursos cloud y aplicar buenas prácticas de ahorro de costes.

---

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Maven** (con Maven Wrapper)
- **Git y GitHub**
- **GitHub Actions**
- **AWS Elastic Beanstalk (Java SE)**

---

## Endpoints de la API

La aplicación expone los siguientes endpoints:

### `GET /`
Devuelve un mensaje de texto indicando el fin de la práctica.

**Ejemplo de respuesta:**
```text
Fin de la práctica de Arquitecturas en la Nube
