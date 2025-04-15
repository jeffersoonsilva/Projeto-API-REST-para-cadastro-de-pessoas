# API de Cadastro de Pessoas

Este projeto é uma **API REST** desenvolvida com **Spring Boot** para realizar o cadastro de pessoas. A aplicação utiliza **JPA** para persistência de dados no **banco MySQL** e a biblioteca **Lombok** para simplificar o código e reduzir a quantidade de getters e setters.

## 👤 Autor

- **Nome**: Jefferson da Silva  
- **Matrícula**: 01692080
  
- **Nome**: Carlos Lucas Carneiros de Albuquerque 
- **Matrícula**: 01724444
  

## 🚀 Funcionalidades

- **Criar uma nova pessoa** (`POST /pessoa`)
- **Buscar uma pessoa por ID** (`GET /pessoa/{id}`)

## 🛠️ Tecnologias Utilizadas

- **Java 17** (ou a versão que você usou)
- **Spring Boot**
  - **Spring Web**
  - **Spring Data JPA**
- **MySQL** (Banco de dados)
- **Lombok** (Redução de boilerplate)
- **Maven** (Gerenciamento de dependências)

## 🗂️ Estrutura do Projeto

- **`model/`** → Contém as entidades JPA que representam as tabelas do banco de dados.
- **`dto/`** → Contém os Objetos de Transferência de Dados (DTOs) que são utilizados para transferir informações entre a API e o cliente.
- **`repository/`** → Contém as interfaces de acesso ao banco de dados, que utilizam o Spring Data JPA para realizar operações CRUD.
- **`controller/`** → Contém os endpoints da API, onde as requisições HTTP são mapeadas para métodos.

## 📦 Como rodar o projeto

### Pré-requisitos

1. **Java 17** ou versão superior.
2. **MySQL** configurado e rodando em sua máquina (ou use o Docker para rodar um container MySQL).
3. **IntelliJ IDEA** (ou outro IDE que suporte projetos Spring Boot).
   
### Passos para rodar a aplicação

1. **Clone o repositório**:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
