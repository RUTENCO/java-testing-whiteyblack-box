# Java Testing Demo

Proyecto Maven para explicar y ejecutar dos técnicas de pruebas:

- Tabla de decisión
- Cobertura de bucles

Usa:
- JUnit 5 para ejecutar los tests
- JaCoCo para medir cobertura
- Maven Surefire para correr las pruebas con `mvn test`

## Requisitos

- Java 17
- Maven 3.6+ (o el que tengas instalado)

## Ejecutar

```bash
mvn test
```

## Generar reporte de cobertura

```bash
mvn verify
```

El reporte de JaCoCo queda en:

```text
target/site/jacoco/index.html
```

## Qué cubre cada técnica

### 1) Tabla de decisión
Archivo:

```text
src/main/java/com/example/demo/AuthService.java
```

Tests:

```text
src/test/java/com/example/demo/AuthServiceTest.java
```

Se probaron las 4 combinaciones posibles de las condiciones:
- usuario válido / inválido
- contraseña válida / inválida

### 2) Cobertura de bucles
Archivo:

```text
src/main/java/com/example/demo/LoopService.java
```

Tests:

```text
src/test/java/com/example/demo/LoopServiceTest.java
```

Se probaron estos escenarios:
- 0 iteraciones (arreglo vacío)
- 1 iteración
- varias iteraciones

## Patrones usados

Cada test sigue AAA:
- Arrange: se preparan los datos
- Act: se ejecuta el método
- Assert: se valida el resultado
