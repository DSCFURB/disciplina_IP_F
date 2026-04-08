# 📘 Lista de Exercícios – Revisão Uni4

---

# 🧾 Uni4Rev01.java

## Enunciado

Uma empresa deseja automatizar o cálculo da folha de pagamento de seus funcionários.

Para isso, será necessário desenvolver um programa que leia as seguintes informações:

- Nome do funcionário
- Quantidade de horas trabalhadas no mês (valor inteiro)
- Valor pago por hora trabalhada (valor real)

---

## Regras de cálculo

O cálculo do salário deve obedecer às seguintes regras:

### 🔹 Salário base
- Até **160 horas trabalhadas** → pagamento normal

### 🔹 Horas extras
- De **161 até 200 horas** → horas excedentes com acréscimo de **50%**
- Acima de **200 horas** →
  - As primeiras 40 horas extras (até 200) recebem **50%**
  - As horas excedentes recebem **100%**

---

## Descontos

Após calcular o salário bruto, aplicar:

- INSS: **8% sobre o salário bruto**
- Imposto de Renda:
  - Aplicado somente se o salário bruto for **maior que R$ 3000,00**
  - Alíquota de **10%**

---

## Saída esperada

O programa deve exibir:

- Nome do funcionário
- Salário bruto
- Valor do desconto de INSS
- Valor do desconto de IR (se houver)
- Salário líquido

---

## Validações

- As horas trabalhadas não podem ser negativas
- O valor da hora deve ser maior que zero

---

## Exemplos de entrada

nome: João  
horas: 160  
valorHora: 10  

nome: Maria  
horas: 180  
valorHora: 20  

nome: Carlos  
horas: 220  
valorHora: 25  

---

## Exemplos de saída

Funcionário: João  
Salário bruto: 1600.00  
INSS: 128.00  
IR: 0.00  
Salário líquido: 1472.00  

Funcionário: Maria  
Salário bruto: 3800.00  
INSS: 304.00  
IR: 380.00  
Salário líquido: 3116.00  

---

---

# 🚗 Uni4Rev02.java

## Enunciado

Um sistema de monitoramento de trânsito precisa calcular automaticamente as infrações de velocidade.

O programa deve ler:

- Velocidade máxima permitida na via (km/h)
- Velocidade registrada do veículo (km/h)

---

## Regras

O cálculo da infração deve seguir:

- Se a velocidade for **menor ou igual ao limite** → não há infração
- Se ultrapassar o limite:

### 🔹 Classificação da infração

- Até **20% acima do limite** → Multa leve (R$ 130,00)
- De **21% até 50% acima** → Multa grave (R$ 195,00)
- Acima de **50%** → Multa gravíssima (R$ 880,00 + suspensão da CNH)

---

## Saída esperada

O programa deve mostrar:

- Situação (sem multa / leve / grave / gravíssima)
- Percentual de excesso
- Valor da multa

---

## Validações

- A velocidade limite deve ser maior que zero
- A velocidade do veículo não pode ser negativa

---

## Exemplos de entrada

limite: 60  
velocidade: 60  

limite: 60  
velocidade: 72  

limite: 60  
velocidade: 100  

limite: 60  
velocidade: 130  

---

## Exemplos de saída

Situação: Sem multa  
Excesso: 0%  
Valor: R$0,00  

Situação: Multa leve  
Excesso: 20%  
Valor: R$130,00  

Situação: Multa grave  
Excesso: 66%  
Valor: R$195,00  

Situação: Multa gravíssima (CNH suspensa)  
Excesso: 116%  
Valor: R$880,00  

---

---

# 🛒 Uni4Rev03.java

## Enunciado

Uma loja deseja automatizar o cálculo do valor final de compras com base na forma de pagamento escolhida pelo cliente.

O programa deve ler:

- Valor total da compra
- Forma de pagamento:
  - 1 → pagamento à vista
  - 2 → pagamento parcelado

Caso o pagamento seja parcelado, o programa também deve ler:

- Número de parcelas

---

## Regras

### 🔹 Pagamento à vista

- Compras de até R$ 100,00 → desconto de **5%**
- Compras acima de R$ 100,00 → desconto de **10%**

---

### 🔹 Pagamento parcelado

- Até **3 parcelas** → sem juros
- Acima de **3 parcelas** → acréscimo de **20% sobre o valor total**

---

## Saída esperada

O programa deve exibir:

- Valor final da compra
- Forma de pagamento utilizada
- Quantidade de parcelas (se houver)

---

## Validações

- O valor da compra deve ser maior que zero
- A forma de pagamento deve ser válida (1 ou 2)
- O número de parcelas deve ser maior que zero

---

## Exemplos de entrada

valor: 80  
forma: 1  

valor: 200  
forma: 1  

valor: 200  
forma: 2  
parcelas: 2  

valor: 200  
forma: 2  
parcelas: 5  

---

## Exemplos de saída

Valor final: R$76,00  
Pagamento: à vista  

Valor final: R$180,00  
Pagamento: à vista  

Valor final: R$200,00  
Pagamento: parcelado em 2x  

Valor final: R$240,00  
Pagamento: parcelado em 5x  

---

# 📌 Instruções Gerais

- O aluno deve obrigatoriamente:
  - Separar o código em **Entrada / Processo / Saída**
  - Utilizar **estrutura condicional (if/else)**
  - Criar **testes no final do código**
  - Comentar o código adequadamente

- Não é permitido:
  - Código sem organização
  - Falta de testes
  - Valores fixos (hardcoded)

---


---

# 🏦 Uni4Rev04.java

## Enunciado

Um banco deseja simular operações básicas de uma conta corrente.

O programa deve ler:

- Saldo inicial da conta
- Uma opção de operação escolhida pelo usuário

---

## Menu de opções:

1 → Depósito  
2 → Saque  
3 → Consulta de saldo  
4 → Aplicar rendimento  

---

## Regras das operações

### 🔹 Depósito
- O usuário informa o valor
- O valor deve ser positivo
- O valor é somado ao saldo

---

### 🔹 Saque
- O usuário informa o valor
- O valor deve ser positivo
- Só pode realizar o saque se houver saldo suficiente
- Caso contrário, exibir: **"Saldo insuficiente"**

---

### 🔹 Consulta
- Exibir o saldo atual

---

### 🔹 Rendimento
- Aplicar 5% de rendimento sobre o saldo atual

---

## Regras importantes

- O programa deve executar **apenas uma operação**
- Utilizar `switch-case` para controlar a escolha
- Validar valores negativos

---

## Saída esperada

- Mensagens claras informando a operação realizada
- Saldo final atualizado

---

## Exemplos de entrada

saldo: 1000  
opção: 1  
valor: 500  

saldo: 1000  
opção: 2  
valor: 1200  

---

## Exemplos de saída

Depósito realizado!  
Saldo final: R$1500  

Saldo insuficiente  
Saldo final: R$1000  

---

---

# 🎓 Uni4Rev05.java

## Enunciado

Uma instituição de ensino deseja calcular a situação final de um aluno.

O programa deve ler:

- Nome do aluno
- Nota 1
- Nota 2
- Nota 3
- Frequência (%)

---

## Regras

### 🔹 Validação

- Notas devem estar entre **0 e 10**
- Frequência deve estar entre **0 e 100**

---

### 🔹 Cálculo da média

- Média aritmética das 3 notas

---

### 🔹 Situação do aluno

- Frequência < 75% → **Reprovado por falta**
- Média ≥ 7 → **Aprovado**
- Média entre 5 e 6.9 → **Recuperação**
- Média < 5 → **Reprovado por nota**

---

## Regras importantes

- A verificação de **falta deve ser feita primeiro**
- Utilizar `if/else` encadeado

---

## Saída esperada

- Nome do aluno
- Média final
- Situação

---

## Exemplos de entrada

nome: João  
notas: 7, 7, 7  
freq: 80  

nome: Ana  
notas: 9, 9, 9  
freq: 60  

---

## Exemplos de saída

Aluno: João  
Média: 7.0  
Situação: Aprovado  

Aluno: Ana  
Média: 9.0  
Situação: Reprovado por falta  

---

---

# 🏨 Uni4Rev06.java

## Enunciado

Um hotel deseja calcular o valor da hospedagem de um cliente.

O programa deve ler:

- Nome do cliente
- Tipo de quarto:
  - S → Standard
  - D → Deluxe
  - L → Luxo
- Número de diárias
- Forma de pagamento:
  - 1 → À vista
  - 2 → Cartão

---

## Valores das diárias

- Standard → R$ 100  
- Deluxe → R$ 180  
- Luxo → R$ 250  

---

## Regras

### 🔹 Tipo de quarto
- Deve ser validado usando `switch-case`
- Caso inválido → encerrar o programa

---

### 🔹 Cálculo base
- valor total = diária × quantidade de dias

---

### 🔹 Taxa adicional
- Se ficar mais de 5 dias → adicionar R$ 50

---

### 🔹 Forma de pagamento

- À vista → 10% de desconto
- Cartão → sem desconto

---

## Validações

- Tipo de quarto válido (S, D ou L)
- Número de diárias maior que zero
- Forma de pagamento válida (1 ou 2)

---

## Saída esperada

- Nome do cliente
- Tipo de quarto (por extenso)
- Valor da diária
- Valor total da hospedagem
- Forma de pagamento

---

## Exemplos de entrada

nome: Carlos  
tipo: S  
dias: 3  
pagamento: 1  

nome: Maria  
tipo: D  
dias: 6  
pagamento: 2  

---

## Exemplos de saída

Cliente: Carlos  
Quarto: Standard  
Total: R$270  

Cliente: Maria  
Quarto: Deluxe  
Total: R$1130  

---

# 📌 Instruções Gerais

- O aluno deve obrigatoriamente:
  - Separar o código em **Entrada / Processo / Saída**
  - Utilizar `if/else` e `switch-case`
  - Criar **casos de teste comentados**
  - Validar entradas

- Não é permitido:
  - Uso de laços (`for`, `while`, `do-while`)
  - Código sem organização
  - Valores fixos no código (hardcoded)

---
