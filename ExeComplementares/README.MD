# 🚀 Lista de Exercícios: Fundamentos de Java

Este repositório contém uma série de exercícios práticos para o aprendizado de Java, focando em tipos de dados, manipulação de strings, saída no console e entrada de dados via teclado.

---

## 🟢 Tópico 01: Variáveis & Tipos de Dados

### 01) Meus Dados Primitivos
Crie variáveis com os seus próprios dados e imprima-os no console:
* `String`: Seu nome completo.
* `int`: Sua idade.
* `char`: A inicial do seu nome.
* `boolean`: Uma variável dizendo se você gosta de café (`true`/`false`).
* **Saída:** Use `System.out.println` para cada uma.

### 02) Ficha de Personagem
Crie variáveis para representar um personagem fictício (pode ser você, um herói, atleta ou mago):
* **Idade** (`int`)
* **Altura** (`float`)
* **Classe** (`char` - use a primeira letra da função)
* **Status** (`boolean` - está em missão?)
* **Saída:** Imprima todas as informações detalhadamente.

### 03) Gerenciamento de Estoque (Loja de Jogos)
Uma loja de jogos precisa armazenar a quantidade de cópias vendidas. Escolha o tipo de dado mais adequado entre (`byte`, `short`, `int` ou `long`) para cada variável:
* **Jogo Indie:** Vende no máximo 100 cópias.
* **Jogo Popular Nacional:** Vende até 40.000 cópias.
* **Jogo AAA Internacional:** Pode vender mais de 2 bilhões de cópias.
* **Total Histórico:** Projeção para dezenas de bilhões de cópias somadas.
* **Ação:** Crie as variáveis e imprima seus valores.

### 04) Simulador de Pedido de Pizza
Crie um programa que armazene as seguintes informações de um pedido:
* Nome da pizzaria (`String`), Sabor (`String`) e Tamanho (`char` - 'P', 'M' ou 'G').
* Valor da pizza (`float`) e Taxa de entrega (`float`).
* **Cálculo:** Crie uma variável `valorTotal` (`float`) somando a pizza e a taxa.
* **Status:** A pizza tem borda recheada? (`boolean`).
* **Saída:** Imprima o resumo completo do pedido.

### 05) Frase de Efeito
Crie uma `String` com uma frase motivacional ou engraçada que você goste (Ex: *"Sem prática, até o Batman apanha."*) e exiba-a.

---

## 🔵 Tópico 02: Impressão no Console e Strings

### 01) Ficha Técnica de Filme
Crie variáveis para um filme: Nome (`String`), Ano (`int`), Duração em minutos (`int`), Nota da crítica (`float`), Inicial do título (`char`) e Sucesso de bilheteria (`boolean`).
* **Ação:** Imprima cada variável separadamente, uma por linha.

### 02) Relatório Estruturado
Utilizando as variáveis do exercício anterior, imprima as informações em frases completas.
* **Exemplo:** `O filme Vingadores foi lançado em 2015 com nota 8.7.`

### 03) Concatenação Simples
Crie as variáveis `String nome`, `int idade` e `String hobby`. Imprima uma frase única usando o operador de concatenação (`+`).

### 04) Formatação Profissional
Refaça o exercício anterior, mas utilize o método `System.out.format` (ou `printf`) para organizar a saída.

### 05) Substituição Dinâmica
Crie a String: `"Eu ALUNO XXXXX, vou aprender Java! Java não é difícil!"`.
* **Ação:** Substitua `"ALUNO XXXXX"` pelo seu nome de forma programática e imprima.

### 06) Letra de Música (Escape Characters)
Crie 4 ou mais Strings, cada uma com uma linha de uma música.
* **Ação:** Junte tudo em uma variável `letraCompleta` usando `\n` para quebrar as linhas corretamente na impressão.

### 07) String Builder (Format)
Crie variáveis para seu `nome`, `horasPorDia` de estudo, `motivo` e se `acreditaQueVaiConseguir`. Use `String.format` para montar a frase final antes de imprimir.

### 08) Diálogo de Cinema
Crie uma mensagem divertida inspirada em um filme (ex: Harry Potter), adaptada para programação. Use `\n` para organizar as falas no console.

### 09) Fluxo de Erro
Faça uma impressão proposital usando `System.err.println()` para exibir uma mensagem de erro fictícia (ex: *"Erro: Conexão com o banco de dados falhou!"*).

---

## ⌨️ Tópico 03: Leitura de Dados (Scanner)

### 01) Entrada de Inteiros
Peça ao usuário para digitar um número inteiro, armazene e exiba: `O número digitado foi: X`.

### 02) Precisão Decimal
Peça um número decimal (`float`) e exiba-o com apenas **uma casa** após a vírgula.

### 03) Ficha de Personagem Interativa
Peça para o usuário digitar seu **Nome**, **Idade** e **Profissão**.
* **Atenção:** Use `nextLine()` para textos e `nextInt()` para números. Cuidado com o "lixo" de memória ao trocar os tipos de leitura!

### 04) Gerador de Histórias
Peça o `nome`, `cidade` e `comida favorita` do usuário. Exiba uma frase engraçada combinando esses elementos.

---
_Elaborado por Guilherme Legal de Oliveira para fins educacionais._
