# 📚 Sistema de Gerenciamento e Faturamento — Livraria POO

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)
![GitHub Repo Size](https://img.shields.io/github/repo-size/Johannesgauss/Library?style=for-the-badge)

Este repositório contém a modelagem de arquitetura e a especificação técnica para o sistema de cadastro, consulta e faturamento de títulos de uma livraria. O projeto foi integralmente construído aplicando os pilares da **Programação Orientada a Objetos (POO)** em Java.

---

## 🎯 Objetivo do Projeto

O sistema resolve de forma escalável o gerenciamento de títulos comerciais de uma livraria (composta por livros comuns, livros didáticos e revistas), aplicando regras flexíveis de precificação e automação de faturamento de notas fiscais através do uso de **Polimorfismo** e **Herança**.

---

## 🏗️ Arquitetura e Modelagem de Classes
![Arquitetura do projeto](imagens/Arquitetura.png)
### 📋 Especificação dos Componentes

#### 1. `Titulo` (Superclasse Abstrata)
* **Responsabilidade:** Abstrair as propriedades fundamentais e universais de qualquer item comercializado.
* **Atributos:** `nome` (String), `editora` (String), `preco` (double).
* **Métodos Chave:** `getPercentualDesconto()` *(Método abstrato que força cada subclasse a definir sua política de desconto base)* e `toString()`.

#### 2. `Livro` (extends `Titulo`)
* **Responsabilidade:** Especialização voltada a obras literárias gerais.
* **Atributos Adicionais:** `autorPrincipal` (String), `resumo` (String).
* **Métodos Chave:** `getResumo()` *(Consulta direta de sinopse)* e política de desconto fixada em **3%**.

#### 3. `LivroDidatico` (extends `Livro`)
* **Responsabilidade:** Subclasse especializada que isola propriedades pedagógicas. Garante que livros comuns não herdem campos irrelevantes de forma desnecessária.
* **Atributos Adicionais:** `area` (String — ex: História, Informática).
* **Métodos Chave:** Política de desconto expandida para **10%**.

#### 4. `Revista` (extends `Titulo`)
* **Responsabilidade:** Representação de publicações periódicas.
* **Atributos Adicionais:** `periodicidade` (String — ex: Semanal, Mensal).
* **Métodos Chave:** `temMesmaEditora(Revista outra)` *(Validação lógica de concorrência)* e política de desconto fixada em **2%**.

#### 5. `aplicacaoLivraria` (Classe Controladora)
* **Responsabilidade:** Centralizar as regras de negócio de venda, gerenciar o ponto de entrada do sistema e expor propriedades globais.
* **Atributos Estáticos:** `nomeLivraria` (`public static String` — Compartilhado de forma universal com todas as entidades).
* **Métodos Chave:** Métodos de fábrica (`criarRevista`, `criarLivroDidatico`) e o método polimórfico `comprar()`.

---

## 💸 Regra de Negócio: Faturamento e Polimorfismo

O método `comprar(Titulo titulo, int quantidade)` utiliza **Polimorfismo**. Ele recebe a referência genérica da superclasse `Titulo`, permitindo o faturamento de qualquer tipo de obra sem a necessidade de duplicar código ou criar múltiplos métodos específicos.

### Cálculo de Descontos Cumulativos
A precificação final na nota fiscal é calculada aplicando o percentual específico do tipo de título somado ao desconto universal configurado de **0,05%** para toda a loja:

$$\text{Desconto Total} = \text{Desconto do Tipo} + 0,05\%$$

| Categoria | Desconto Base | Desconto Global | Desconto Aplicado Final |
| :--- | :---: | :---: | :---: |
| 📘 **Livro Comum** | 3,00% | 0,05% | **3,05%** |
| 📙 **Livro Didático** | 10,00% | 0,05% | **10,05%** |
| 📕 **Revista** | 2,00% | 0,05% | **2,05%** |

---

## 🛠️ Requisitos Atendidos do Enunciado

- [x] Criação de métodos fábrica específicos para instanciar `Revista` e `LivroDidatico`.
- [x] Método para consultar de forma isolada o resumo de qualquer livro.
- [x] Método comparador para verificar a igualdade de editoras entre duas revistas distintas.
- [x] Sobrescrita do método `toString()` em todas as camadas garantindo exibição limpa dos dados.
- [x] Atributo global `nomeLivraria` acessível estaticamente por todo o ecossistema do código.
- [x] Emissão de Nota Fiscal padronizada contendo: Nome da livraria, nome do título, quantidade de itens comprados e o valor total com descontos calculados dinamicamente.

---

## 🚀 Como Executar e Testar

1. Certifique-se de ter o **JDK 8** ou superior instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
