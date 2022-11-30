package trabalhandoArray;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        //construindo um arrayList para os carros

        ArrayList<String> carros = new ArrayList<>();


        //adicionando Carros ao arraylist
        carros.add("Siena");
        carros.add("Jaguar");
        carros.add("Celta");
        carros.add("BMW");
        carros.add("Ka");
        carros.add("Sandero");

        //mostra array
        System.out.println(carros);

        //substituir BMW por Tesla
        carros.set(3,"Tesla");

        //mostrar array
        System.out.println(carros);
        //obs: altera com base na posição e remove com base no conteúdo
        //remover Celta
        carros.remove("Celta");
        System.out.println(carros);

        //adicionando Carros ao arraylist com JOptionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        System.out.println(carros);

        /*esvaziando o array
        carros.clear();
        System.out.println(carros);

        //verificar se o array está vazio
        if(carros.isEmpty()){
            System.out.println("O vetor está vazio");
        }*/
        System.out.println(carros.size());
        boolean encontrado = false;
        if(carros.contains("Siena")){
            //substituindo quando nao se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if("Siena".equals(carros.get(i))){
                    carros.set(i,"Fiesta");
                    encontrado= true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("O argumento pesquisado não foi encontrado");
            }else{
                System.out.println("Argumento pesquisado encontrado na posição"+ carros.indexOf("Jaguar"));
            }
            System.out.println(carros);
        }

    }
}
