## Questão 03

**No projeto *lab-classes*, crie três alunos com os seguintes detalhes:**

- Branca de Neve, ID do aluno: A00234, créditos: 24

- Lisa Simpson, ID do aluno: C22044, créditos: 56

- Charlie Brown, ID de estudante: A12003, créditos: 6

**Em seguida, insira todos os três em um laboratório e imprima uma lista na tela.**

*Obs.: detalhe sua resposta e, se necessário, adicione o código-fonte produzido para explicar melhor o que fez.*

Para resolver esse exercício, criamos a classe `LabExercicio`, responsável por instanciar uma `LabClass` na váriavel de instância `labClass`, em seu construtor e matricular os 3 estudantes no laboratório, além de adicionar os seus respectivos créditos. Para criar os objetos do tipo `Student` criamos o método privado `getStudent` que retorna o estudante criado, esse método tem como parâmetro o nome completo, id e os créditos do estudante, com isso, no construtos chamamos esse métodos passando como argumento os dados do estudante e adicionamos em `labClass`, para obter o laboratório criamos o método pública `getLabClass` que retorna o objeto `labClass`, isso pode ser visto no código abaixo:



```java

public class LabExercicio
{
    LabClass labClass;

    public LabExercicio(int maxNumberOfStudents)
    {
        labClass = new LabClass(maxNumberOfStudents);

        // Definindo o nome do professor, a data e a sala do laboratório
        labClass.setInstructor("Raimundo");
        labClass.setTime("14/04/2025");
        labClass.setRoom("A-001");

        // Adicionando os dados dos estudante do exercício
        labClass.enrollStudent(getStudent("Branca de Neve", "A00234", 24));
        labClass.enrollStudent(getStudent("Lisa Simpson", "C22044", 56));
        labClass.enrollStudent(getStudent("Charlie Brown", "A12003", 6));
    }


    /* Método para criar um estudante*/ 
    private Student getStudent(String fullName, String studentID, int credits)
    {
        Student student = new Student(fullName, studentID);
        student.addCredits(credits);
        return student;
    }


    /* Retorna a instância de LabClass*/    
    public LabClass getLabClass()
    {
        return labClass;
    }

}

```

No BlueJ, criamos um objeto de `LabExercicio` passando como argumento o valor 3, que representa o número máximo de estudantes. No objeto usamos o método `getLabClass`, para obter o objeto `labClass`, nesse novo objeto, chamamos o método `printList`, que resulta na seguinte saída no console do BlueJ:



*Lab class 14/04/2025
Instructor: Raimundo   Room: A-001
Class list:
Branca de Neve, student ID: A00234, credits: 24
Lisa Simpson, student ID: C22044, credits: 56
Charlie Brown, student ID: A12003, credits: 6
Number of students: 3*


