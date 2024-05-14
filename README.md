
# Prueba tecnica
# EngineBI
## Automatización Web con Selenium, Cucumber y Screenplay

Este proyecto utiliza Selenium, Cucumber y el patrón de diseño Screenplay para realizar pruebas automatizadas en aplicaciones web.
Se utiliza Gradle como gestor de dependencias.

## [Ver Plan de pruebas](https://github.com/luiscarlosmarca/prueba_tecnica_enginebi/blob/main/PlanDePruebas.md)
## [Ver informe de ejecución](target/site/serenity/index.html)

## [Ver repositorio](https://github.com/luiscarlosmarca/prueba_tecnica_enginebi)



### Versión utilizada

- Serenity Core: 1.8.3
- Serenity Cucumber: 1.6.6
- JUnit: 4.12

## Instalación
Clona este repositorio:

```
git clone https://github.com/luiscarlosmarca/prueba_tecnica_enginebi.git

```

Navega al directorio del proyecto:

```
cd prueba_tecnica_enginebi
```
Ejecuta el siguiente comando para compilar y descargar las dependencias:

```
gradle build
```

## Ejecución
Para ejecutar las pruebas automatizadas, utiliza el siguiente comando:

```
gradle :test  --tests "com.co.enginebi.runners.Test_Plan_Free_Runner" 
```

Estos comandos descargara las dependencias, ejecutará las pruebas y generará los informes de Serenity.

```
gradle aggregate
```
## Estructura del proyecto

- src/main/java: Contiene los archivos de código fuente de las pruebas.
  - task: acciones de alto nivel que pueden ser realizadas por un actor (Actor) en el escenario de prueba. Las tareas encapsulan las interacciones que un usuario realiza con la interfaz de usuario para completar una funcionalidad o flujo de trabajo específico.
  - Question: Una consulta o una verificación sobre el estado de la interfaz de usuario o del sistema después de realizar una acción
   - ui: Elementos de la interfaz de usuario con los que interactúa un actor durante la ejecución de una tarea o pregunta
- src/test/ : Contiene los archivos de recursos, como los archivos Gherkin con los escenarios de prueba.
  - Java/Runner: Archivos que ejecuta los escenarios de prueba
  - Java/Stepdefinitions: En donde se establecen los metodos utilizados en los casos de prueba. 
  - resources/features: Estos archivos están escritos en lenguaje Gherkin y describen el comportamiento esperado de la aplicación bajo prueba.
 

### Autor
- Luis Carlos Marin Campos


