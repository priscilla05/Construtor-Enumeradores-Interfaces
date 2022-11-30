package construtores;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    STATUS situacaoAluno; // Esse status é o enumerador (crio dentro da classe e atribuo valor)
    MATRICULA situacaoMatricula;

    public Aluno(double nota1, double nota2, double nota3){ // construtor c sebrecarga pq estou mandando varios parametros de uma vez so
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3= nota3;
    }
    public enum MATRICULA{
        MATRICULADO,
        PENDENTE,
        RECUSADO
    }
     // Definindo um enumerador
    public enum STATUS{
        APROVADO,
         REPROVADO
     }
     //Método para calcular média do aluno
    public double calcularMediaAluno(){
        double mediaAluno = 0;
        //calculo da media
        mediaAluno= (this.nota1+ this.nota2 + this.nota3)/3;
        return mediaAluno;

    }

}
