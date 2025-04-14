## Questão 05

**No projeto `naive-ticket-machine`, implemente um método `empty` que simule o efeito de remover todo o dinheiro da máquina. Este método deve ter um tipo de retorno *void*, e seu corpo deve simplesmente definir o campo `total` como zero. Este método precisa receber algum parâmetro? Teste seu 
método criando uma máquina de bilhetagem, inserindo algum dinheiro, 
imprimindo alguns bilhetes, verificando o total e, em seguida, 
esvaziando a máquina. O método `empty` é modificador ou acessador?**


*Obs.: detalhe sua resposta e, se necessário, adicione o código-fonte produzido para explicar melhor o que fez.*




Primeiramente para a variável `total` funcionar minimamente, devemos corrigir a seguinte linha no método `printTicket`,

```
java
total = total + balance;
```

para

```
java
total = total + price;
```

após essa mudança criamos o método `empty` da seguinte forma:

```
java
    public void empty()
    {
        total = 0;
    }
```

Como o método `empty` modifica o estado interno do objeto ele é um método **modificador**!
