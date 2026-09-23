# 📚 Sistema de Cadastro de Livros

Sistema de linha de comando (CLI) em Java para gerenciar uma coleção de livros, com operações completas de CRUD (Criar, 
Ler, Atualizar e Deletar). Projeto criado como parte dos meus estudos de Java e POO.

## Funcionalidades

- ✅ Cadastrar novo livro (título, autor, ano)
- ✅ Listar todos os livros cadastrados
- ✅ Atualizar dados de um livro existente
- ✅ Remover um livro da lista
- ✅ Validação de entradas inválidas (menu e índices)

## Tecnologias e conceitos utilizados

- **Java** (JDK 21)
- Programação Orientada a Objetos (classes, encapsulamento, construtores)
- `ArrayList` para armazenamento em memória
- `Scanner` para entrada de dados via terminal
- Tratamento de exceções (`try/catch`) para entradas inválidas
- Estruturas de controle: `do-while`, `switch`, `for`

## Como executar

Pré-requisito: ter o JDK instalado ([Adoptium Temurin](https://adoptium.net/)).

```bash
# Clone o repositório
git clone https://github.com/PellegrinDenis/biblioteca-cli
cd biblioteca-cli/src

# Compile
javac Principal.java Livro.java

# Execute
java Principal
```

## Exemplo de uso

```
=== Sistema de Cadastro de Livros ===
1 - Cadastrar livro
2 - Listar livros
3 - Atualizar livro
4 - Remover livro
0 - Sair
Escolha uma opção: 1
Título: Dom Casmurro
Autor: Machado de Assis
Ano: 1899
Livro cadastrado com sucesso!
```

## O que aprendi

Esse foi meu primeiro projeto aplicando Programação Orientada a Objetos na prática. 
Desde modelar uma classe simples até lidar com validação de entrada e tratamento 
de exceções para deixar o programa melhor.

---

Desenvolvido por Denis Pellegrin — https://www.linkedin.com/in/denispellegrin
