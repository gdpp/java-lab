# ☕ Java Learning Journey

Repositorio de documentación y práctica personal para aprender Java desde cero (con base sólida en otros lenguajes). Cada carpeta corresponde a un proyecto de estudio enfocado en un conjunto de temas del temario, con código funcional, notas y ejemplos propios.

> **Contexto:** Desarrollador con 9 años de experiencia haciendo la transición a Java. El objetivo no es aprender a programar — es aprender el ecosistema, la sintaxis y las particularidades del lenguaje y su plataforma.

---

## 📁 Estructura del repositorio
/
├── README.md
├── fase-1-fundamentos/
├── fase-2-oop/
├── fase-3-java-avanzado/
├── fase-4-persistencia/
├── fase-5-frameworks-web/
└── fase-6-enterprise/

Cada carpeta de fase contiene uno o más proyectos. Cada proyecto tiene su propio `README.md` con el contexto, los temas que cubre y las instrucciones para correrlo.

---

## 🗂️ Proyectos

> En construcción — se irán agregando conforme avance el curso.

| # | Proyecto | Temas | Fase |
|---|----------|-------|------|
| - | *próximamente* | - | - |

---

## 📖 Glosario del ecosistema Java

Conceptos del ecosistema que vale la pena tener claros desde el inicio.

### Plataforma y runtime

**JDK (Java Development Kit)**
El kit completo de desarrollo. Incluye el compilador (`javac`), herramientas de diagnóstico, y el JRE. Es lo que instalas cuando quieres *escribir* código Java.

**JRE (Java Runtime Environment)**
Solo el entorno de ejecución. Incluye la JVM y las librerías estándar, pero no el compilador. Es lo que necesita alguien que solo quiere *correr* una aplicación Java, no desarrollarla. En versiones modernas de Java (11+) el JDK ya incluye el JRE.

**JVM (Java Virtual Machine)**
La máquina virtual que ejecuta el bytecode compilado (`.class`). Es la razón por la que Java es "write once, run anywhere": el mismo bytecode corre en cualquier sistema operativo que tenga una JVM instalada.

**Bytecode**
El resultado de compilar código Java. No es código máquina nativo, sino un formato intermedio que la JVM interpreta/compila en tiempo de ejecución. Es el archivo `.class` que genera `javac`.

---

### Gestión de dependencias y build

**Maven**
Herramienta de build y gestión de dependencias. Define el proyecto en un archivo `pom.xml`. Equivalente conceptual a npm (Node), pip (Python) o Composer (PHP). Se encarga de descargar librerías, compilar, empaquetar y ejecutar pruebas.

**JAR (Java ARchive)**
Formato de empaquetado de aplicaciones Java. Es básicamente un ZIP que contiene los `.class` compilados y metadatos. Un proyecto Spring Boot, por ejemplo, se distribuye como un JAR ejecutable.

---

### Persistencia y base de datos

**JDBC (Java Database Connectivity)**
API estándar de Java para conectarse a bases de datos relacionales. Es de bajo nivel: escribes SQL directamente y manejas conexiones y ResultSets a mano. Es el punto de partida antes de usar un ORM.

**ORM (Object-Relational Mapping)**
Técnica que mapea tablas de una base de datos a clases Java, y filas a objetos. Evita escribir SQL repetitivo. Hibernate es el ORM más popular del ecosistema Java.

**Hibernate**
Implementación de ORM para Java. Traduce operaciones sobre objetos Java a queries SQL automáticamente. Es la base sobre la que está construido JPA.

**JPA (Java Persistence API)**
Especificación estándar de Java para ORM. Define las interfaces y anotaciones (`@Entity`, `@Table`, `@Id`, etc.). Hibernate es la implementación más usada de JPA, pero no la única.

**Jakarta EE (antes Java EE)**
Plataforma empresarial de Java para construir aplicaciones robustas, distribuidas y de gran escala. Define especificaciones para servicios como persistencia (JPA), mensajería, seguridad, APIs REST, etc. El nombre cambió de "Java EE" a "Jakarta EE" en 2019 cuando Oracle transfirió la gestión a la Eclipse Foundation. Por eso muchos paquetes que antes eran `javax.*` ahora son `jakarta.*`.

**EJB (Enterprise JavaBeans)**
Componentes del lado del servidor dentro de Jakarta EE para lógica de negocio transaccional y distribuida. Históricamente complejos; hoy en día Spring ha reemplazado su uso en la mayoría de proyectos modernos.

**DAO (Data Access Object)**
Patrón de diseño que separa la lógica de acceso a datos del resto de la aplicación. Una clase DAO se encarga exclusivamente de las operaciones CRUD contra la base de datos, manteniendo el código limpio y desacoplado.

---

### Web y frameworks

**Spring / Spring Boot**
Spring es el framework más usado en el ecosistema Java empresarial. Provee inyección de dependencias, manejo de transacciones, seguridad, integración con bases de datos, y mucho más. Spring Boot es una capa sobre Spring que elimina la configuración manual — convención sobre configuración. Si vas a trabajar en Java hoy, probablemente sea con Spring Boot.

**Servlet**
Clase Java que maneja peticiones y respuestas HTTP. Es la base sobre la que están construidos todos los frameworks web de Java. Hoy casi nadie escribe Servlets directamente, pero todos los frameworks los usan por debajo.

**JSP (JavaServer Pages)**
Tecnología para generar HTML dinámico desde Java, similar a PHP o ASP clásico. Se mezcla código Java con HTML directamente en el archivo. Tecnología madura pero considerada legacy en proyectos nuevos.

**JSF (JavaServer Faces)**
Framework MVC estándar de Java EE para construir interfaces web basadas en componentes. Más estructurado que los JSPs puros.

**PrimeFaces**
Librería de componentes UI para JSF. Provee tablas, formularios, gráficas, calendarios y otros componentes listos para usar.

**Thymeleaf**
Motor de plantillas moderno para Java, muy usado con Spring Boot. Las plantillas son HTML válido que puede abrirse directamente en el navegador incluso sin servidor.

**Struts 2**
Framework MVC web de Java, popular en los 2000s y presente en muchos sistemas legados. Si ves Struts 2 en una oferta de trabajo, generalmente es mantenimiento de sistema antiguo.

---

### Conceptos del lenguaje

**Inmutabilidad de String**
En Java, los objetos `String` son inmutables: una vez creados, no se pueden modificar. Operaciones como concatenación o `replace()` no modifican el String original, sino que crean uno nuevo. Para concatenaciones intensivas en loops se recomienda usar `StringBuilder`, que sí es mutable y es mucho más eficiente en memoria.

**JavaBeans**
Convención de nomenclatura y estructura para clases Java reutilizables: constructor sin argumentos, atributos privados, y métodos `getX()` / `setX()` públicos para acceder a ellos. Muchos frameworks (Spring, JSF, Hibernate) asumen que tus clases siguen esta convención.

**Generics**
Sistema de tipos parametrizados. Permiten escribir clases y métodos que funcionen con cualquier tipo de dato de forma type-safe, sin necesidad de casting. Ejemplo: `List<String>` garantiza en tiempo de compilación que la lista solo contiene Strings.

**Lambda / Funciones lambda**
Funciones anónimas introducidas en Java 8. Permiten tratar comportamiento como dato, fundamentales para trabajar con la Streams API y Collections de forma declarativa.

**Checked vs Unchecked Exceptions**
Java distingue excepciones chequeadas (el compilador te obliga a manejarlas o declararlas) de las no chequeadas (RuntimeException y sus subclases). Es una particularidad del lenguaje que no existe igual en la mayoría de lenguajes modernos.

---

## 🛠️ Setup

- JDK: 21 (LTS)
- Build tool: Maven
- IDE: IntelliJ IDEA (recomendado) / VS Code con extensión Java

---

## 📌 Notas personales

- El repo es de uso personal y aprendizaje — el código no está pensado para producción.
- Los proyectos están ordenados por fases progresivas, pero algunos pueden consultarse de forma independiente.
1. OOP
2. Spring Foundation
3. Movies platform
