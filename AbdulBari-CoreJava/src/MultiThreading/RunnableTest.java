package MultiThreading;

public class RunnableTest implements Runnable {


        public void run() {
            int i = 1;
            while (true) {
                System.out.println(i + "hello");
                i++;
            }
        }
        public static void main(String[] args) {
            MultiThreading.ThreadTest m = new MultiThreading.ThreadTest();
            m.start();
            int i = 1;
            while (true) {
                System.out.println(i + "world");
                i++;
            }
        }
    }


