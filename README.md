# Projeto App de Login e Cálculo de IMC (Jetpack Compose)

Este é um projeto de aplicativo Android simples, desenvolvido 100% com Kotlin e Jetpack Compose. O app demonstra um fluxo de múltiplas telas, navegação e lógica de UI, servindo como um exemplo prático de uma arquitetura moderna de UI para Android.

O fluxo do aplicativo consiste em:

 1. Uma Tela de Login que valida credenciais.
 2. Uma Tela de Menu que serve como um hub de navegação.
 3. Uma Tela de Cálculo de IMC que realiza o cálculo e exibe o resultado.
 4. Uma tela que mostra as informações dos membros da equipe


## 1. Tela de Login

Validação: A tela exige que o usuário insira "admin" e a senha "123456".

Feedback de Erro: Exibe uma mensagem de "Usuário ou senha inválidos!" caso as credenciais estejam incorretas.

Navegação Segura: Após o login bem-sucedido, o usuário é levado ao Menu e a tela de Login é removida da pilha de navegação (o usuário não pode "voltar" para o login).

UI Customizada: O botão de "Entrar" foi customizado com a cor Verde.

<img width="256" height="560" alt="image" src="https://github.com/user-attachments/assets/02cc757f-f754-4524-aaa1-86a326fa0d92" />
<img width="260" height="558" alt="image" src="https://github.com/user-attachments/assets/884d35f2-5622-4c46-98bb-77874155dd7f" />

## 2. Tela de Menu

Serve como um hub central.

Contém botões para navegar até "Cálculo de IMC" e "Equipe".

Inclui um botão "Sair" que navega de volta para a tela de Login, limpando a pilha de navegação (simulando um logout).

<img width="252" height="555" alt="image" src="https://github.com/user-attachments/assets/fdeff4b7-2c7f-482b-b0c2-49e0d200d654" />

## 3. Tela de Cálculo de IMC

Coleta três entradas do usuário: Nome, Peso (kg) e Altura (m).

Os campos de Peso e Altura utilizam o teclado numérico para facilitar a digitação.

Correção de Input: O cálculo trata entradas decimais com vírgula (,) ou ponto (.), substituindo a vírgula por ponto antes de converter para Double.

Exibe o resultado formatado (ex: "24.69") e a classificação correspondente (ex: "Peso normal") dentro de um Card.

Possui um botão "Voltar" que utiliza navController.popBackStack() para retornar à tela anterior (Menu).

<img width="250" height="559" alt="image" src="https://github.com/user-attachments/assets/6106fb37-5cdb-4688-a10a-50301ade525f" />

## 4. Tela de Informações da equipe
<img width="254" height="564" alt="image" src="https://github.com/user-attachments/assets/1bb011fe-c86d-4453-8171-2b410c5dcac6" />


https://github.com/bailooon/GS2_2025_RM98656_RM98627
