# Springbootapp

Projeto de uma aplicação Spring Boot para gerenciamento de entregas, desenvolvido para fins didáticos na disciplina "Tópicos Especiais em Informática" - 6º Semestre, Professor Emanuel Mineda.

## Métodos da Aplicação

### Obter Todas as Entregas

`GET /entregas`

Este endpoint retorna todas as entregas cadastradas no sistema.

### Obter Entrega por Data-Hora Limite

`GET /entregas/buscarPorDataLimite`

Parâmetro:
- `data_hora_limite`: Data e hora limite para buscar entregas.

Este endpoint retorna as entregas cuja data-hora limite é superior à data fornecida.

### Cadastrar Entrega

`POST /entregas`

Este endpoint permite cadastrar uma nova entrega. Se `data_hora_cadastro` estiver vazia, será preenchida com a data atual.

## Execução

1. **Configuração do Banco de Dados:**

   Certifique-se de que o banco de dados está configurado corretamente em `application.properties` ou `application.yml`.

2. **Executar o Script SQL:**

   Execute o script SQL para criar a tabela de entregas no banco de dados.
   ```bash
   mysql < tabela.sql
   ```

3. **Executar a Aplicação:**

   Execute a aplicação Spring Boot. (Usando Maven:)
   ```bash
   mvn spring-boot:run
   ```
   A aplicação estará acessível em `http://localhost:8080`.

## Testando Requisições

1. **Utilize o Thunder Client:**

   Usar o Thunder Client no VS Code para testar as requisições. Importe a coleção disponível no arquivo `thunder-collection_Springboot app.json`.

2. **Execute as Requisições:**

  ### Obter Todas as Entregas

` GET http://localhost:8080/entrega`

![get-all](https://github.com/JulianaMaria-Lab/springbootapp/assets/79669245/e03b621d-482b-43fc-b0bd-8ed378696b1e)

### Obter Entrega por Data-Hora Limite

`GET http://localhost:8080/entrega/buscarPorDataLimite?data_hora_limite=`

![buscar-data-limite](https://github.com/JulianaMaria-Lab/springbootapp/assets/79669245/e589f46c-bfdb-4228-9a03-015fdb24f477)

### Cadastrar Entrega

`POST http://localhost:8080/entrega`

![post-entrega](https://github.com/JulianaMaria-Lab/springbootapp/assets/79669245/56fde3e0-7b8e-4faf-911c-a578a6db0ebf)

```
