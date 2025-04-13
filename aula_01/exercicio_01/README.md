## Questão 01

1. **No código-fonte da classe Picture do projeto house encontre a parte que realmente desenha a imagem. Mude-a para que o sol seja azul em vez de amarelo.**
   
   *Obs.: detalhe sua resposta e, se necessário, adicione o código-fonte produzido para explicar melhor o que fez*
   
   - A imagem é desenhada no método `draw` da classe `Picture`, para mudar o sol da cor amarelo para a cor azul, basta passar como argumento a string "blue" no método `changeColor` do objeto `sun`, ficando como o exemplo abaixo:

```java
public void draw() {
    if(!drawn) {
         // Configuração dos outros objetos

         sun.changeColor("blue");
         sun.moveHorizontal(100);
         sun.moveVertical(-40);
         sun.changeSize(80);
         sun.makeVisible();
         drawn = true;
     }
}
```
