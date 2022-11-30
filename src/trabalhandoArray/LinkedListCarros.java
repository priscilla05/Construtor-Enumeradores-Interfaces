package trabalhandoArray;

import java.util.LinkedList;

public class LinkedListCarros {
    public static void main(String[] args) {

        /*addFirst()
        addLast()
        getFirst()
        getLast()
        removeFirst()
        removeLast()

         */

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Honda");
        System.out.println(cars);

        //incluindo Corola no inicio
        cars.addFirst("Corola");
        System.out.println(cars);

        //incluindo HB20 no final
        cars.addLast("HB20");
        System.out.println(cars);

         String carro;
        carro = cars.get(3);
        System.out.println(carro);

        //removendo o primeiro
        cars.removeFirst();
        System.out.println(cars);

        //removendo o ultimo
        cars.removeLast();
        System.out.println(cars);

        //obtem  o primeiro
        System.out.println(cars.getFirst());
        System.out.println(cars);

        //obtem o ultimo
        System.out.println(cars.getLast());
        System.out.println(cars);

        cars.clear();
        if (cars.isEmpty()){
            System.out.println("LinkedList vazio");

        }

    }


    }
