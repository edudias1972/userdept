# USERDEPARTAMENTO

CRUD utilizando Java entre Usuario e Despartamento 14-01-2024

Construir uma API REST com banco de dados usando Java e Spring Boot

Objetivos
Resgatar fundamentos de programação
Colocar em prática esses fundamentos
Criar um pequeno sistema com ferramentas e práticas de mercado
Dar mais um passo em direção à preparação para o mercado
Visão geral do sistema
Vamos construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

Buscar todos usuários                GET         Ler

Buscar um usuário pelo seu id        GET         Ler

Inserir um novo usuário              POST        Inserte

Alterar dados de um usuario          PUT         UPDATE

Remover um usuário                   DEL         DELETE



![image](https://github.com/edudias1972/USERDEPARTAMENTO/assets/80340034/8f59cda2-54e9-4105-8973-5f27e1d1f142)


Desenvolvimento moderno: relacional -> objeto -> json
![image](https://github.com/edudias1972/USERDEPARTAMENTO/assets/80340034/84c78445-938a-4c80-850b-9104825b8fa2)



-------------------------------------------------------------------------------------------------------------------------------------
Passos do Projeto

Criar o projeto

Implementar o modelo de domínio

Mapeamento objeto-relacional com JPA

Configurar o banco de dados H2

Criar os endpoints da API REST

-------------------------------------------------------------------------------------------------------------------------------------
Trechos de código para copiar

Configuração do Maven Resources Plugin

![image](https://github.com/edudias1972/USERDEPARTAMENTO/assets/80340034/432fea2b-26ad-4d26-bd36-8c47a48767cc)


<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>

------------------------------------------------------------------------------------------------------------------------------------
Configurações do banco de dados
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

------------------------------------------------------------------------------------------------------------------------------------

Script SQL  2 departamentos de exemplo  e seus respectivos usuarios

INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');

INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');

INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');

