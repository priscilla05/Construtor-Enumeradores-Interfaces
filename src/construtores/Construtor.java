package construtores;
public class Construtor {

    public static void main(String[]args){
        //passando os dados atra,vés do construtor com sobreposição
        Aluno aluno = new Aluno(8,8,8);
        //calculando a média
        double mediaAlunoFinal= aluno.calcularMediaAluno();

        //definindo situação do aluno
        if(mediaAlunoFinal<6){
            aluno.situacaoAluno = Aluno.STATUS.REPROVADO;
        }else{
            aluno.situacaoAluno = Aluno.STATUS.APROVADO;
        }
        //imprimindo situação do aluno
        System.out.println("A média do aluno é:" + aluno.calcularMediaAluno()+ "e o aluno é"+ aluno.situacaoAluno);

        //Usa enum MATRICULA
        aluno.situacaoMatricula =Aluno.MATRICULA.MATRICULADO;
        System.out.println("O aluno está: "+ aluno.situacaoMatricula);

    }



}


