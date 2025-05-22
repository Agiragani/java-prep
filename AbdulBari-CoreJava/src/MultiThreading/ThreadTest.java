package MultiThreading;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }
}

public class Thread {
    public static void main(String[] args) {
        MyThread m = new MyThread();

    }
}
