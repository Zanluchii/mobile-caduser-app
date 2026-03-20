# Cadastro de Usuário 📱

Este é um projeto Android desenvolvido para fins de aprendizado em Desenvolvimento Mobile. O aplicativo permite o cadastro simples de usuários (nome e e-mail) e a visualização desses dados em uma lista.

## 🚀 Funcionalidades

- **Tela Principal**: Exibe uma lista de usuários cadastrados utilizando `RecyclerView`.
- **Cadastro de Usuário**: Interface para inserir nome completo e e-mail.
- **Persistência Temporária**: Os dados são adicionados a uma lista compartilhada entre as Activities.

## 🛠️ Tecnologias Utilizadas no Projeto

- **Linguagem**: Java
- **Android SDK**: Componentes modernos como `ConstraintLayout` e `LinearLayout`.
- **Material Design**: Uso de `TextInputLayout` e `TextInputEditText` para uma melhor experiência de entrada de dados.
- **Componentes de UI**: `RecyclerView` para listagem eficiente.

## 📂 Estrutura do Projeto

- `MainActivity`: Tela principal que gerencia a lista de usuários.
- `CreateUser`: Tela responsável pelo formulário de cadastro.
- `UserAdapter`: Componente em desenvolvimento para vincular os dados à `RecyclerView`.
- `layouts`: Arquivos XML definindo a interface visual (`activity_main.xml` e `create_user.xml`).

## 📝 Como executamos

1. Clone o repositório.
2. Abra o projeto no **Android Studio**.
3. Sincronize o Gradle.
4. Execute em um emulador ou dispositivo físico com Android 5.0 (API 21) ou superior.

---
*Projeto desenvolvido durante as aulas de Desenvolvimento Mobile.*