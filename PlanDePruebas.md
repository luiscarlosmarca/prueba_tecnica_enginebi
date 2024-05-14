# Plan de Pruebas para la Aplicación Web EngineBI

## Introducción

EngineBI es una aplicación web que ofrece diferentes planes de suscripción para acceder a sus servicios. 
El objetivo de este plan de pruebas es garantizar que la funcionalidad de suscripción y los diferentes planes
(Free Trial, Monthly, Annual y Platinum) funcionen correctamente,
desde la selección del plan hasta la confirmación del mismo.

## Alcance
El plan de pruebas cubrirá las siguientes áreas:

- Selección del plan de suscripción.
- Ingreso de información básica del usuario.
- Ingreso de información de la compañía.
- Proceso de pago.
- Confirmación de la suscripción.

## Fuera del alcance
Compatibilidad con diferentes navegadores.


##  Estrategia
La estrategia de pruebas se basará en realizar pruebas funcionales exhaustivas para cada paso del proceso de suscripción.
La estrategia de pruebas se centrará en la automatización de pruebas funcionales para cada paso del proceso de suscripción en EngineBI.
Se utilizarán herramientas de automatización como Selenium WebDriver y Serenity BDD para garantizar una cobertura exhaustiva y una detección temprana de posibles problemas. 
La estrategia incluirá:

- Desarrollo de Casos de Prueba Automatizados:
    

    Se desarrollarán casos de prueba automatizados para cada paso del proceso de suscripción, incluyendo la selección del plan, ingreso de información básica, ingreso de información de la compañía, método de pago y confirmación.
    Se implementarán escenarios alternos para probar las validaciones del frontend, como la validación de campos obligatorios, formatos de correo electrónico válidos y validaciones de campos numéricos como números de teléfono.
    Se incluirán casos de prueba para verificar los mensajes de confirmación y los mensajes de error que se muestran al usuario durante el proceso de suscripción.

- Uso de Frameworks de Automatización:

    
    Se utilizarán frameworks de automatización como Serenity BDD para estructurar y ejecutar los casos de prueba de manera eficiente.
    Se aprovecharán las capacidades de Serenity BDD para generar informes detallados de prueba, incluyendo capturas de pantalla y registros de actividad, para facilitar la identificación y resolución de problemas.


## Casos de prueba
Se realizaron en este [archivo](resources/features/testingPlans.feature)

## Supuestos

- Se asume que la aplicación está en un estado funcional para la ejecución de pruebas.
- Se asume que los datos de prueba proporcionados son válidos y no afectarán los datos reales.


## Limitaciones

- La aplicación puede tener limitaciones de compatibilidad con navegadores específicos que deben ser tenidos en cuenta durante las pruebas.
- Las pruebas solo cubrirán el proceso de suscripción visible desde el frontend, no se tendra en cuenta validaciones en base de datos.


## Riesgos
| Riesgo                                                     | Impacto | Probabilidad | Severidad | Mitigación                                                                                                                                   |
|------------------------------------------------------------|---------|--------------|-----------|----------------------------------------------------------------------------------------------------------------------------------------------|
| Riesgo de continuar gratis después del periodo de prueba  | Alto    | Medio        | Alto      | Implementar una validación que garantice que cuando finalización el periodo de prueba, se suspenda y envie un correo notificando al usuario. |
| Fallos en la integración de métodos de pago                | Medio   | Bajo         | Alto      | Realizar pruebas exhaustivas de integración con los proveedores de servicios de pago y tener un plan de contingencia en su lugar.            |
| Errores de validación de entrada                           | Medio   | Medio        | Medio     | Implementar validaciones de entrada tanto en el lado del cliente como en el servidor para evitar datos incorrectos.                          |
