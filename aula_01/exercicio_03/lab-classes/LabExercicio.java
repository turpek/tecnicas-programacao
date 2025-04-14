
/**
 * Classe usada para resolver o exercicio 3 do laboratorio 1.
 * 
 * @author Guilherme Teixeira de Faria
 * @version 2025.05.13
 */
public class LabExercicio
{
    LabClass labClass;

    /**
     * Construtor para objetos da classe LabExcercicio
     */
    public LabExercicio(int maxNumberOfStudents)
    {
        labClass = new LabClass(maxNumberOfStudents);
        labClass.setInstructor("Raimundo");
        labClass.setTime("14/04/2025");
        labClass.setRoom("A-001");
        labClass.enrollStudent(getStudent("Branca de Neve", "A00234", 24));
        labClass.enrollStudent(getStudent("Lisa Simpson", "C22044", 56));
        labClass.enrollStudent(getStudent("Charlie Brown", "A12003", 6));
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    private Student getStudent(String fullName, String studentID, int credits)
    {
        Student student = new Student(fullName, studentID);
        student.addCredits(credits);
        return student;
    }
    
    public LabClass getLabClass()
    {
        return labClass;
    }

}
