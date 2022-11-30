package trabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {
//UNIDIRECIONAIS
    public static void main(String[]args){
        //declarando o array de paises
        String[] paises = new String[4];

        //declarando o array de numeros
        int[] numeros= new int [10];

        //abastecendo o array de paises
        for (int i = 0; i < 4 ; i++) {
            paises[i]= JOptionPane.showInputDialog("Informe um país");

        }
        //listando o array de paises
        for (String listaPaises:paises) {
            System.out.println(listaPaises);

        }

        //Abastecendo o array de numeros
        for (int i = 0; i < 10 ; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        }

        //listando o array de numeros antes do calculo
        for (Integer listaNumeros:numeros) {
            System.out.println(listaNumeros);

        }

        int novoValor =11;
        numeros[8] = novoValor +4;
        //listando o array de numeros depois do calculo
        for (Integer listaNumeros:numeros) {
            System.out.println(listaNumeros);

        }
    }
}
