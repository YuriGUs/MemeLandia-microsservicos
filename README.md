Este projeto demonstra a refatoração de uma aplicação monolítica em uma arquitetura de microsserviços.

A aplicação monolítica original, um sistema de cadastro de memes, foi desmembrada em três serviços independentes:

1.  **Serviço de Usuários:** Responsável por cadastrar e gerenciar os usuários da plataforma.
2.  **Serviço de Categorias:** Responsável por cadastrar e gerenciar as categorias dos memes.
3.  **Serviço de Memes:** Responsável pelo cadastro dos memes, que depende dos outros dois serviços.

Tecnologias Utilizadas:
* **Linguagem:** Java (JDK 21)
* **Framework:** Spring Boot
* **Banco de Dados:** MongoDB (Cada microsserviço possui seu próprio banco de dados isolado no Atlas).
* **Comunicação:** Os serviços se comunicam por APIs REST síncronas. O serviço de Memes utiliza o OpenFeign para validar a existência de Usuários e Categorias antes de permitir um novo cadastro.
* **Observabilidade:** Cada serviço expõe métricas de acesso aos endpoints no formato Prometheus (via Spring Boot Actuator e Micrometer) e utiliza logs estruturados (SLF4J) para monitoramento.
