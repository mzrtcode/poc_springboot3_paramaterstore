# Proyecto de Carga Dinámica de Variables de Entorno 🚀

Este proyecto te permite cargar las variables de entorno de manera dinámica, basándose en el archivo application.yml y el perfil activo de Spring (spring.profiles.active = dev/prod). Para llevar a cabo esta tarea, utiliza el servicio AWS Parameter Store y se apoya en la biblioteca de la comunidad AWSpring.



## Tecnologías Utilizadas 🛠️

- **Spring Boot 3.2** 🌱
- **AWSpring Cloud** 🚁  https://awspring.io/
  - Librería: `io.awspring.cloud:spring-cloud-aws-dependencies` 📦
  - Starter: `io.awspring.cloud:spring-cloud-aws-starter-parameter-store` ⚙️


## Características Principales 🌟
- Carga dinámica de variables de entorno.
- Integración con AWS Parameter Store para gestionar configuraciones.
- Compatibilidad con perfiles de Spring (dev/prod).

## Instrucciones de Configuración 📝

1. **Clona este repositorio a tu máquina local.**
    ```bash
    git clone https://github.com/tu-usuario/tu-proyecto.git
    ```

2. **Abre el archivo `application.yml` y configura los perfiles según tus necesidades.**
    ```yaml
    spring:
      profiles:
        active: dev  # Cambia a 'prod' para entorno de producción
    ```
    ![image](https://github.com/mzrtcode/poc_springboot3_paramaterstore/assets/71569136/6ee360d1-12ea-4688-9515-39a99e669440)


## Uso del Proyecto 🚀

1. **Ejecuta la aplicación Spring Boot.**
    ```bash
    ./mvnw spring-boot:run
    ```

2. **¡Listo! Las variables de entorno se cargarán dinámicamente según la configuración del perfil activo.**

## Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias, no dudes en abrir un [issue](https://github.com/tu-usuario/tu-proyecto/issues).

👉🏼Basado en: https://boottechnologies-ci.medium.com/aws-systems-manager-parameter-store-ssm-with-spring-boot-3-10d112595c6a
