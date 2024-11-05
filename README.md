## 🛠 Serviço de Envio de E-mails

Este projeto visa criar um serviço especializado para envio de e-mails, integrando-se com o serviço de login por meio de RabbitMQ para uma comunicação eficaz e escalável entre os microsserviços.

### 📋 Objetivos e Funcionalidades

- **Envio de E-mails Personalizados**: Implementa o envio de e-mails para diferentes destinatários, suportando mensagens customizadas para diversas finalidades, como validação de conta, notificações, entre outros.
- **Receptor de Mensageria**: Atua como um receptor passivo, processando e-mails apenas quando recebe uma solicitação via RabbitMQ, o que otimiza recursos e facilita a escalabilidade.

### 🧩 Tecnologias Utilizadas

- **Jakarta E-mail**: Biblioteca eficiente para envio de e-mails de forma rápida e prática.
- **RabbitMQ**: Mensageria que integra o serviço de login e o serviço de e-mail, assegurando uma comunicação assíncrona e desacoplada.

### 💡 Ideação

A imagem abaixo ilustra o fluxo de login e a validação do usuário, incluindo o envio de e-mails de verificação para assegurar que os usuários confirmem suas contas de forma automatizada e segura.

![Ideação](https://drive.google.com/uc?id=15MUrrGqOUIxM1uFra-VWud8h_A21QXYd)

### 🎯 Aprendizado

Este projeto foi uma excelente oportunidade para aprofundar conhecimentos em:

- **Mensageria com RabbitMQ**: Entendimento dos padrões de comunicação entre microsserviços, promovendo um sistema robusto e preparado para escalar.
- **Envio de E-mails com Jakarta**: Familiarização com a configuração e o uso prático de e-mails para diversas finalidades dentro de um sistema de autenticação.
