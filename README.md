# PaymentAPI Simulator 💳

## 📌 Descrição
O **PaymentAPI Simulator** é um projeto simples desenvolvido em **Java** que simula o funcionamento de um sistema de processamento de pagamentos.  
O objetivo do projeto é demonstrar, de forma prática, a aplicação de **Design Patterns (Padrões de Projeto)** para organizar melhor o código e tornar o sistema mais modular e escalável.

Este projeto foi criado como parte de um desafio para consolidar conhecimentos sobre padrões de projeto em Java.

---

## ⚙️ Funcionalidades

- Simulação de processamento de pagamentos
- Suporte a múltiplos métodos de pagamento
- Estrutura modular utilizando padrões de projeto
- Código simples e fácil de expandir para novos métodos de pagamento

Atualmente o sistema suporta:

- 💸 Pagamento via **PIX**
- 💳 Pagamento via **Cartão de Crédito**

---

## 🧠 Padrões de Projeto Utilizados

### 🔹 Strategy
O padrão **:contentReference[oaicite:0]{index=0}** permite definir diferentes estratégias de pagamento.  
Cada forma de pagamento possui sua própria implementação.

Exemplos:
- `PixPayment`
- `CreditCardPayment`

Isso permite adicionar novos métodos de pagamento no futuro sem alterar o código principal.

---

### 🔹 Singleton
O padrão **:contentReference[oaicite:1]{index=1}** garante que exista apenas **uma instância do processador de pagamentos** durante toda a execução da aplicação.

Isso simula o comportamento de serviços centralizados em sistemas reais.

---

### 🔹 Facade
O padrão **:contentReference[oaicite:2]{index=2}** fornece uma interface simples para interação com o sistema.

Dessa forma, o usuário pode executar pagamentos chamando métodos simples como:

```java
payWithPix()
payWithCreditCard()
