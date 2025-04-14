## Questão 02

**No projeto `house`, adicione um segundo sol à imagem. Para fazer isso, preste atenção às definições de campo próximas ao topo da classe. Você encontrará este código:**

```java
private Square wall;
private Square window;
private Triangle roof;
private Circle sun;
```

**Você precisa adicionar uma linha aqui para o segundo sol. Por exemplo:**

```java
private Circle sun2;
```

**Em seguida, escreva o código apropriado para criar o segundo sol e torná-lo visível quando a imagem for desenhada.**

*Obs.: detalhe sua resposta e, se necessário, adicione o código-fonte produzido para explicar melhor o que fez.*

Adicionando a variável de instância `sun2` no topo da classe `Picture` da seguinte forma:

```java
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private boolean drawn;

    // Resto da classe
}
```

No construtor `public Picture()`, devemos instanciar o segundo sol, como se segue:

```java
    public Picture()
    {
        // Inicializando as outras variáveis

        sun = new Circle();
        sun2 = new Circle();
        drawn = false;
    }
```

Agora devemos configurar as caracteristicas do segundo sol, para isso devemos usar os seguintes métodos do objeto `sun2`:

1. `changeColor` passando como argumento `"blue"` para criar um sol azul

2. `moveHorizontal`  passando como argumento `-200` para colocar o sol a esquerda da tela

3. `moveVertical` passando como argumento o valor `-40` para ficar na mesma altura do primeiro sol

4. `changeSize` passando como argumento `80` para ter o mesmo tamanho do primeiro sol

5. Para tornar o `sol2` visível usamos o método `makeVisible`

Todos os passos anteriores devem ser executados no método `draw` na classe `Picture`, como é mostrado abaixo:

```java
    public void draw()
    {
        if(!drawn) {
            // Configurações dos outros objetos...

            sun2.changeColor("blue");
            sun2.moveHorizontal(-200);
            sun2.moveVertical(-40);
            sun2.changeSize(80);
            sun2.makeVisible();
            drawn = true;
        }
    }
```

para manter a classe consistente devemos adicionar as seguintes linhas nos métodos `setBlackAndWhite` e `setColor`

```java
    public void setBlackAndWhite()
    {
        // Configurações dos outros objetos
        sun2.changeColor("black");
    }

    public void setColor()
    {
        // Configuraç
        sun2.changeColor("blue");
    }
```

isso faz com que quando `setBlackAndWhite` seja chamado, o segundo sol se torne preto, ja `setColor`, restaura a cor original do mesmo.
