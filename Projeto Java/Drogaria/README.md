# Projeto Drogaria em Java

## 📖 Descrição do Projeto
Este projeto é uma aplicação de console desenvolvida em **Java** que simula o funcionamento básico de uma drogaria.  
Ele permite o gerenciamento de **usuários**, **farmacêuticos** e o **estoque de medicamentos**.  
O sistema oferece funcionalidades para cadastrar novos usuários e farmacêuticos, listar os membros cadastrados e visualizar o estoque de medicamentos disponível.

---

## ⚙️ Funcionalidades
- **Cadastro de Usuários**: Permite registrar novos usuários com nome e CPF.  
- **Cadastro de Farmacêuticos**: Permite registrar novos farmacêuticos com nome e CRF (Conselho Regional de Farmácia).  
- **Visualização de Estoque**: Exibe a lista de todos os medicamentos disponíveis na drogaria, incluindo ID, nome, bula e se exige receita.  
- **Listagem de Usuários**: Apresenta todos os usuários cadastrados no sistema.  
- **Listagem de Farmacêuticos**: Apresenta todos os farmacêuticos cadastrados no sistema.  

Embora o menu principal não as exponha, o projeto também contém classes para gerenciar:
- **Compras**: Registro de compras de medicamentos.  
- **Pagamentos**: Detalhes sobre a forma e valor do pagamento.  
- **Histórico de Pagamentos**: Armazenamento do histórico de compras finalizadas.  

---

## 📂 Estrutura do Projeto

Projeto Java/ ├── Drogaria/ │   ├── .vscode/             # Configurações do VS Code │   ├── bin/                 # Arquivos .class compilados │   │   ├── Classes/ │   │   └── Main/ │   ├── lib/                 # Bibliotecas externas (se houver) │   ├── src/                 # Código-fonte Java │   │   ├── Classes/ │   │   │   ├── Compra.java │   │   │   ├── Drogaria.java │   │   │   ├── Estoque.java │   │   │   ├── Farmaceutico.java │   │   │   ├── HistoricoPagamento.java │   │   │   ├── Medicamento.java │   │   │   ├── Pagamento.java │   │   │   └── Usuario.java │   │   └── Main/ │   │       └── Principal.java │   └── README.md            # README original do projeto (será substituído)


---

## 🏛️ Classes Principais
- **Principal.java**: Contém o método `main` e o menu principal da aplicação, responsável pela interação com o usuário.  
- **Drogaria.java**: Representa a drogaria, gerenciando listas de usuários, farmacêuticos e o estoque de medicamentos.  
- **Medicamento.java**: Define a estrutura de um medicamento, incluindo ID, nome, bula e se exige receita.  
- **Estoque.java**: Gerencia a coleção de medicamentos disponíveis na drogaria, permitindo adicionar, remover, buscar e exibir medicamentos.  
- **Usuario.java**: Representa um usuário do sistema, com nome, CPF e um histórico de compras.  
- **Farmaceutico.java**: Representa um farmacêutico, com nome e CRF. Inclui lógica para validar a necessidade de receita para medicamentos.  
- **Compra.java**: Representa uma compra realizada, contendo uma lista de medicamentos e informações de pagamento.  
- **Pagamento.java**: Detalha o valor e a forma de pagamento de uma compra.  
- **HistoricoPagamento.java**: Armazena e gerencia o histórico de todas as compras finalizadas.  

---

## ▶️ Como Compilar e Executar
Para compilar e executar este projeto, você precisará ter o **Java Development Kit (JDK)** instalado em sua máquina.

1. Navegue até o diretório do projeto:
```bash
cd /home/ubuntu/projeto_java/Projeto\ Java/Drogaria