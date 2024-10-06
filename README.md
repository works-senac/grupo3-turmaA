# RPG Adventure Game

### Descrição

**A Lenda de Silverhollow** é um jogo de RPG baseado em texto desenvolvido em Java. Neste jogo, os jogadores criam
personagens, exploram mundos fictícios, enfrentam inimigos, encontram itens mágicos ao longo da
jornada. O jogo é jogado por meio de comandos no terminal.

---

## Funcionalidades

- Criação de personagens personalizados
- Sistema de combate por turnos

---

## Pré-requisitos

Antes de iniciar o jogo, certifique-se de que você tenha os seguintes itens instalados:

- [Java JDK 21+](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)

---

## Clonando o repositório

Você pode clonar este repositório em seu ambiente local com o seguinte comando:

```bash
git clone https://github.com/works-senac/grupo3-turmaA.git
```

## Execução Local

1. Entre na pasta do projeto:
   ```bash
   cd grupo3-turmaA
   ```

2. Compile o código com o seguinte comando:
    1. Disponível apenas em sistema Unix por conta de uma dificuldade do Windows:
          ```shell
          javac -d bin src/**/*.java
          ```

3. Execute o jogo com:
    ```bash
    javac -d bin $(find src -name "*.java")
    ```

## Executando com .jar

1. Baixe o zip que contem o .jar do jogo que se encontra na
   última [release](https://github.com/works-senac/grupo3-turmaA/releases/latest) com o nome de "
   a-lenda-de-silverhollow.jar":
2. Entre na sua pasta de downloads usando o terminal:
    1. (Windows)
       ```shell
       cd %USERPROFILE%\Downloads 
       ```    
    2. (Linux/Mac)
       ```shell
       cd ~/Downloads 
       ```
3. Após isso basta executar o programa usando o próprio terminal:
   ````shell
   java -jar a-lenda-de-silverhollow.jar
   ````

## Última Release

Veja a [última release](https://github.com/works-senac/grupo3-turmaA/releases/latest) do projeto.

