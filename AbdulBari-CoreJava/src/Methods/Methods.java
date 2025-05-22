public class Methods {
    static boolean prime(int num) {
        int num1 = num / 2;
        for (int i = 2; i < num1; i++) {
            if (num1 / i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(19));

    }
}

