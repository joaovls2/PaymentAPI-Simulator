# PaymentAPI Simulator 💳

## 📌 Descrição
O **PaymentAPI Simulator** é um projeto desenvolvido em **Java** que simula o funcionamento de um sistema simples de processamento de pagamentos.

O objetivo do projeto é demonstrar na prática a aplicação de **Design Patterns (Padrões de Projeto)** para organizar melhor o código, melhorar a manutenção e facilitar a expansão do sistema.

Este projeto foi desenvolvido como parte de um desafio do **Bootcamp Java e Cloud Developer**, promovido pela **DIO** em parceria com a **Accenture**.

---

## ⚙️ Funcionalidades

- Simulação de processamento de pagamentos
- Suporte a diferentes métodos de pagamento
- Estrutura baseada em padrões de projeto
- Código simples e extensível

Atualmente o sistema suporta:

- 💸 Pagamento via **PIX**
- 💳 Pagamento via **Cartão de Crédito**

---

## 🧠 Padrões de Projeto Utilizados

### 🔹 Strategy
O padrão **:contentReference[oaicite:2]{index=2}** permite definir diferentes estratégias de pagamento.

Cada forma de pagamento possui sua própria implementação, como:

- `PixPayment`
- `CreditCardPayment`

Isso permite adicionar novos métodos de pagamento futuramente sem alterar o código principal.

---

### 🔹 Singleton
O padrão **:contentReference[oaicite:3]{index=3}** garante que exista apenas **uma instância do processador de pagamentos** durante toda a execução da aplicação.

---

### 🔹 Facade
O padrão **:contentReference[oaicite:4]{index=4}** fornece uma interface simples para interação com o sistema.

Assim, o usuário pode executar pagamentos através de métodos simplificados como:

```java
payWithPix()
payWithCreditCard()
