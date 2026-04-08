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
