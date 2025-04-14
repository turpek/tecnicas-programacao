## Questão 03

No projeto `naive-ticket-machine`, adicione um método `showPrice` à classe `TicketMachine` Isso deve ter um tipo de retorno *void* e não aceitar parâmetros. O corpo do método deve imprimir:

*The price of a ticket is xyz cents.*

Onde xyz deve ser substituído pelo valor mantido no campo de preço quando o método for chamado.

*Obs.: detalhe sua resposta e, se necessário, adicione o código-fonte produzido para explicar melhor o que fez.*



Para resolver esse exercício criamos o método `showPrice` com o seguinte cabeçalho, `public void showPrice()`, de forma que o mesmo possa ser usado fora da classe, dentro do mesmo mostramos a mensagem requerida, com mostra o código abaixo:



```java
    public void showPrice()
    {
        System.out.println("The price of a ticket is " + price + " cents.");
    }
```


