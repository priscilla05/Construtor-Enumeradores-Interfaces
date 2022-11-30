package forEach;

public class ComandoForEach {
    public static void main(String[] args) {
        /*
    Criar um vetor, carregá-lo ja inicializado e em seguida lerei os
    elementos do vetor usando forEach
     */

        int[] vetorNumeros = new int[]{1,2,3,4,5,6,7,8,9,10};
        // varrendo o vetor SEM uso do forEach

        System.out.println("Varrendo o vetor sem o forEach");
        for (int i  = 0; i < vetorNumeros.length ; i++) {
            System.out.println("Numero:" + vetorNumeros[i]);

        }
        //varrendo o vetor usando o forEach
        System.out.println("COM FOREACH");
        for (int listaNumeros: vetorNumeros) {
            System.out.println("Numero:" + listaNumeros);

        }
    }


}
