# Catálogo de Filmes (Projeto POO - Java)

## Descrição do Projeto
Desenvolva um sistema que apresente um catálogo de filmes, similar ao IMDB. O objetivo é aplicar os conceitos de Programação Orientada a Objetos (POO) utilizando Java, seguindo o padrão MVC (Model-View-Controller). O sistema será operado via terminal, sem interface gráfica.

## Funcionalidades
- Cadastrar filmes
- Cadastrar atores
- Cadastrar diretores
- Associar filmes com seus atores e diretores
- Pesquisar filmes cadastrados pelo nome (case insensitive)

## Estrutura do Projeto
```
desafio-poo.iml
README.md
src/
  br/
    com/
      ada/
        controller/
        model/
          Ator.java
          Diretor.java
          Filme.java
          Pessoa.java
        service/
        view/
```

## Detalhes de Implementação

### Model
- **Pessoa (Classe Abstrata):**
  - Atributos: nome, dataNascimento, nacionalidade
  - Métodos: getters/setters
  - Herança: Ator e Diretor herdam de Pessoa
- **Ator (Classe Concreta):**
  - Herda de Pessoa
  - Pode conter métodos específicos para atores
- **Diretor (Classe Concreta):**
  - Herda de Pessoa
  - Pode conter métodos específicos para diretores
- **Filme:**
  - Atributos: nome, dataLancamento, orcamento, descricao, diretor, lista de atores
  - Métodos: getters/setters, adicionarAtor, definirDiretor

### Controller
- Gerencia as operações de cadastro, associação e pesquisa
- Métodos para cadastrar filmes, atores, diretores, associar e pesquisar

### Service
- Regras de negócio e validações
- Métodos para garantir integridade dos dados

### View
- Interface via terminal para interação com o usuário
- Exibe menus, recebe entradas e mostra resultados

## Conceitos de POO Utilizados
- **Encapsulamento:**
  - Uso de modificadores de acesso (private, protected, public)
  - Métodos getters/setters
- **Herança:**
  - Ator e Diretor herdam de Pessoa
- **Polimorfismo:**
  - Métodos sobrescritos nas subclasses
  - Possibilidade de tratar Pessoa como Ator ou Diretor
- **Classes Abstratas:**
  - Pessoa é abstrata, não pode ser instanciada diretamente

## Regras de Desenvolvimento
- Siga o padrão MVC para organização do código
- Utilize commits frequentes e descritivos
- Cada integrante deve contribuir com o desenvolvimento
- A entrega será feita via repositório GIT
- Não é necessário frontend, apenas interação via terminal

## Como Executar
1. Compile o projeto Java
2. Execute a classe principal via terminal
3. Siga as instruções exibidas para cadastrar e pesquisar filmes

## Observações
- O sistema é básico e serve para fixação dos conceitos de POO
- Teste todas as funcionalidades antes de entregar
- Consulte a documentação Java para dúvidas sobre sintaxe ou conceitos

---

Se precisar de ajuda, consulte o time ou o professor responsável.
