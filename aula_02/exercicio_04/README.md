## Questão 04

**No projeto `naive-ticket-machine`, dê à classe `TicketMachine` dois construtores. Um deve pegar um único parâmetro que especifica o  preço, e o outro não deve pegar nenhum parâmetro e definir o preço para  ser um valor padrão de sua escolha. Teste sua implementação criando máquinas de bilhetagem através dos dois construtores diferentes.**



*Obs.: detalhe sua resposta e, se necessário, adicione o código-fonte produzido para explicar melhor o que fez.*



Para o costrutor com parâmetro, passamos o preço do ticket como argumento na instanciação do `TicketMachine`, com isso, devemos inicializar a variável de instância `price` com o valor passado, fazemos isso da seguinte forma:



```java
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
```

Já para o construto sem parâmetro, não devemos passar nenhum argumento, na instanciação do `TicketMachine`, o preço do ticket é definido na inicialização de `price`dentro do construtor, como mostra o código abaixo:



```java
    public TicketMachine()
    {
        price = 900;
        balance = 0;
        total = 0;
    }
```










