class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }


    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1)) {
            return true;
        }
        if (isTeen(num2)) {
            return true;
        }
        if (isTeen(num3)) {
            return true;
        } else
            return false;
    }
}