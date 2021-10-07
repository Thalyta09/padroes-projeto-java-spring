## Padrões de Projeto usando Spring

Este repositório contém as implementações dos padrões de projeto explorados no curso "Explorando Padrões de Projetos na Prática com Java" da Digital Innovation One.
No curso foi abordado como utilizar na prática esse padrões implementando tanto com java puro tanto com java spring.
Além do que foi apresentado em aula, adicionei ao projeto um código http (404 - Not Found) específico para quando realizar uma busca por um ID que não existe.
Ele funciona quando tentar realizar busca por id, atualizar ou deletar um registro.


Especificamente neste repositório, é demonstrado alguns destes padrões usando o Spring Framework, são eles:

- Singleton
- Strategy/Repository
- Facade

Pré-requisitos para a execução deste projeto:

- Java 11 ou versões superiores.
- Maven 3.6.3 ou versões superiores.
- Sua IDE favorita.
- Controle de versão GIT.
- Conta no GitHub para o armazenamento do seu projeto na nuvem.


Projeto Spring Boot gerado via Spring Initializer.
Os seguintes módulos foram importados:
- Spring Web (via Spring Initializer)
- Spring Data JPA (via Spring Initializer)
- H2 Database (via Spring Initializer)
- OpenFeign (via Spring Initializer)
- Open API (Importando Manualmente) -> disponível em: https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui