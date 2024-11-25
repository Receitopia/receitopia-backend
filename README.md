<h1 align="center"> Receitopia - Portal de Receitas </h1>
Principais informações sobre o desenvolvimento Back-end da aplicação. Para mais detalhes, acesse a dcumentação do projeto. 

<h2> Tecnologias </h2>

 * [Spring Boot](https://spring.io/projects/spring-boot) 
 * [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
 * [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
 * [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
 * [H2](https://h2database.com/html/main.html)
 * [Insomnia](https://insomnia.rest/)

<h2> Como executar? </h2>

* Clone o repositorio: <code> git clone https://github.com/Receitopia/receitopia-backend.git </code>

* Garanta que o seu ambiente está preparado com todas as dependencias necessárias de acordo com as tecnologias acima. 

* Exceute a aplicação Spring Boot

* Abra o [H2 Console](http://localhost:8080/h2-console) e insira as seguintes credenciais:

  * Username: SA

  * Password: password

* E na tabela "Users" insira o usuario e senha através do seguinte código:

  <code> INSERT INTO users (username, password) VALUES ('isabella', 'isalinda'); </code>

* Em seguida, já é possível rodar o Front-end da aplicação React através dos comandos no terminal de sua IDE de preferencia:

  OBS: garanta que tenha todas as dependencias, react e node instalados em sua máquina. 

<code> cd receitopia </code>

<code> npm start </code>
  
* Acesse a aplicação em <code> http://localhost:8080/receitopia </code>

* Use o Insomnia para testar as requisições Rest API
