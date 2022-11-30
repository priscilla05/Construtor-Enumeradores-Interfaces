package threads;

public class ThreadsTeste {

    static int i = 0;

    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();
    }

    private static void contador(String name) {
        i++;
        System.out.println("O valor do contador atual é:" + i + ", thread:" + name);
    }

    private static Runnable t1 = new Runnable() { // Runnable é uma interface q permite implementar Threads

        public void run() {
            try {
                for (int j = 0; j < 5; j++) {
                    contador("t1");

                }
            } catch (Exception e) {

            }
        }
    };
    private static Runnable t2 = new Runnable() {
        public void run() {
            try {
                for (int j = 0; j < 5; j++) {
                    contador("t2");

                }
            } catch (Exception e) {

            }
        }
    };
}
