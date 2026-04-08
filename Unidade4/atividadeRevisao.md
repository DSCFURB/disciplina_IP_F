# 📘 Lista de Exercícios – Revisão Uni4

---

# 🧾 Uni4Rev01.java

## Enunciado

Uma empresa deseja automatizar o cálculo da folha de pagamento de seus funcionários.

O programa deve ler:

- Nome do funcionário
- Quantidade de horas trabalhadas no mês
- Valor pago por hora

---

## Regras

- Até 160 horas → pagamento normal  
- De 161 até 200 → horas extras com acréscimo de 50%  
- Acima de 200 → horas extras com acréscimo de 100%  

### Descontos:
- INSS: 8%
- IR: 10% (se salário > 3000)

---

## Exemplos de entrada

| Nome   | Horas | Valor Hora |
|--------|------|------------|
| João   | 160  | 10         |
| Maria  | 180  | 20         |
| Carlos | 220  | 25         |

---

## Exemplos de saída

| Funcionário | Salário Bruto | INSS  | IR    | Salário Líquido |
|------------|--------------|------|------|----------------|
| João       | 1600.00      | 128  | 0    | 1472.00        |
| Maria      | 3800.00      | 304  | 380  | 3116.00        |

---

---

# 🚗 Uni4Rev02.java

## Enunciado

Um sistema de trânsito deve calcular multas com base na velocidade.

O programa deve ler:

- Velocidade permitida
- Velocidade do veículo

---

## Regras

- Até o limite → sem multa  
- Até 20% acima → leve (R$130)  
- Até 50% acima → grave (R$195)  
- Acima → gravíssima (R$880 + suspensão)

---

## Exemplos de entrada

| Limite | Velocidade |
|--------|------------|
| 60     | 60         |
| 60     | 72         |
| 60     | 100        |
| 60     | 130        |

---

## Exemplos de saída

| Situação                          | Excesso | Multa |
|----------------------------------|--------|------|
| Sem multa                        | 0%     | 0    |
| Multa leve                       | 20%    | 130  |
| Multa grave                      | 66%    | 195  |
| Multa gravíssima (CNH suspensa)  | 116%   | 880  |

---

---

# 🛒 Uni4Rev03.java

## Enunciado

Uma loja deseja calcular o valor final da compra com base na forma de pagamento.

O programa deve ler:

- Valor da compra
- Forma de pagamento (1 = à vista, 2 = parcelado)

Se parcelado, ler número de parcelas.

---

## Regras

### À vista:
- Até 100 → 5% desconto
- Acima → 10%

### Parcelado:
- Até 3x → sem juros
- Acima → +20%

---

## Exemplos de entrada

| Valor | Forma | Parcelas |
|------|------|----------|
| 80   | 1    | -        |
| 200  | 1    | -        |
| 200  | 2    | 2        |
| 200  | 2    | 5        |

---

## Exemplos de saída

| Valor Final | Forma de Pagamento |
|------------|-------------------|
| 76.00      | À vista           |
| 180.00     | À vista           |
| 200.00     | Parcelado 2x      |
| 240.00     | Parcelado 5x      |

---

---

# 🏦 Uni4Rev04.java

## Enunciado

Um banco deseja simular operações em conta corrente.

O programa deve ler:

- Saldo inicial
- Opção de operação

---

## Opções

1 → Depósito  
2 → Saque  
3 → Consulta  
4 → Rendimento  

---

## Regras

- Depósito: valor positivo soma ao saldo  
- Saque: verificar saldo disponível  
- Consulta: mostrar saldo  
- Rendimento: +5%  

---

## Exemplos de entrada

| Saldo Inicial | Opção | Valor |
|--------------|------|------|
| 1000         | 1    | 500  |
| 1000         | 2    | 1200 |

---

## Exemplos de saída

| Operação | Resultado           | Saldo Final |
|----------|--------------------|------------|
| Depósito | Sucesso            | 1500       |
| Saque    | Saldo insuficiente | 1000       |

---

---

# 🎓 Uni4Rev05.java

## Enunciado

Um sistema deve calcular a situação de um aluno.

O programa deve ler:

- Nome
- 3 notas
- Frequência

---

## Regras

- Frequência < 75 → reprovado por falta  
- Média ≥ 7 → aprovado  
- Média ≥ 5 → recuperação  
- Senão → reprovado  

---

## Exemplos de entrada

| Nome | Nota 1 | Nota 2 | Nota 3 | Frequência |
|------|-------|-------|-------|-----------|
| João | 7     | 7     | 7     | 80        |
| Ana  | 9     | 9     | 9     | 60        |

---

## Exemplos de saída

| Aluno | Média | Situação              |
|------|------|----------------------|
| João | 7.0  | Aprovado             |
| Ana  | 9.0  | Reprovado por falta  |

---

---

# 🏨 Uni4Rev06.java

## Enunciado

Um hotel deseja calcular o valor da hospedagem.

O programa deve ler:

- Nome
- Tipo de quarto (S/D/L)
- Diárias
- Forma de pagamento

---

## Regras

- S = 100 | D = 180 | L = 250  
- Mais de 5 dias → +50  
- À vista → -10%  

---

## Exemplos de entrada

| Nome   | Tipo | Diárias | Pagamento |
|--------|------|--------|----------|
| Carlos | S    | 3      | 1        |
| Maria  | D    | 6      | 2        |

---

## Exemplos de saída

| Cliente | Quarto   | Total |
|--------|---------|------|
| Carlos | Standard | 270  |
| Maria  | Deluxe   | 1130 |

---

Putz, você tem razão! Quando o texto é colado diretamente de um bloco de código ou sem a formatação correta de Markdown para o GitHub, ele acaba perdendo as quebras de linha e virando esse "blocão" de texto ilegível que apareceu no seu print.

Para resolver isso, vou te passar agora o código Raw (puro). No GitHub, certifique-se de que o arquivo tenha a extensão .md e cole exatamente o conteúdo abaixo:

Markdown
# 🏨 Exercício de Revisão: Uni4Rev07.java

## 📝 Enunciado
O **"Blumenau Tech Hotel"** precisa de um sistema para calcular o fechamento de conta (*Checkout*). O programa deve processar e validar as informações de estadia, aplicando taxas progressivas e descontos de fidelidade.

### O programa deve ler:
1. **Identificação:** Nome do hóspede e Categoria de Fidelidade (String: `"VIP"`, `"COMUM"` ou `"NOVO"`).
2. **Hospedagem:** Tipo de Aposento (Char: `'S'` para Standard, `'D'` para Duplo, `'L'` para Luxo) e a quantidade de diárias (int).
3. **Consumo:** Valor total gasto com frigobar (double).
4. **Pagamento:** Forma de pagamento (int: `1` para Dinheiro/PIX, `2` para Cartão).

---

## ⚖️ Regras de Negócio

### 1. Valor da Diária (Baseado no Tipo)
| Sigla | Tipo | Valor |
|:---:|:---:|:---:|
| **S** | Standard | R$ 150,00 |
| **D** | Duplo | R$ 220,00 |
| **L** | Luxo | R$ 350,00 |

> **Nota:** Caso o usuário digite qualquer outro caractere, o sistema deve assumir **Standard** e exibir um aviso de "Tipo Inválido".

### 2. Taxa de Serviço (Sobre o valor total das diárias)
- **Até 4 diárias:** taxa de 15%.
- **De 5 até 10 diárias:** taxa de 10%.
- **Acima de 10 diárias:** taxa de 5%.

### 3. Desconto de Fidelidade (Sobre a soma: Diárias + Taxa + Frigobar)
- **VIP:** 15% de desconto.
- **COMUM:** 5% de desconto.
- **NOVO:** Sem desconto.

### 4. Condição de Pagamento (Final)
- **Dinheiro/PIX (Opção 1):** Aplica **5% de desconto** sobre o valor acumulado após o desconto de fidelidade.
- **Cartão (Opção 2):** Não há desconto adicional.









# 📌 Instruções Gerais

- Separar:
  - Entrada
  - Processo
  - Saída

- Usar:
  - `if/else`
  - `switch-case`

- Obrigatório:
  - Testes comentados
  - Validação
  - Comentários explicando:
    - algoritmo
    - entradas
    - processamento
    - saídas
    - testes de mesa
