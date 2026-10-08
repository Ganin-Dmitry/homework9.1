import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {

        int expenseBook[] = generateRandomArray();
        System.out.println(Arrays.toString(expenseBook));
        int sum = 0;
        for (int element : expenseBook) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2 () {

        int expenseBook[] = generateRandomArray();
        System.out.println(Arrays.toString(expenseBook));
        int maxElement = 0;
        int minElement = 999999999;
        for (int element : expenseBook) {
            if (element > maxElement) {
                maxElement = element;
            } else if (element < minElement) {
                minElement = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minElement + " рублей. Максимальная сумма трат за неделю составила " + maxElement + " рублей");

    }

    public static void task3 () {

        int expenseBook[] = generateRandomArray();
        System.out.println(Arrays.toString(expenseBook));
        int sum = 0;
        for (int element : expenseBook) {
            sum = sum + element;
        }
        float averageValue = sum / expenseBook.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

    }

    public static void task4 () {

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char simbol;
        int halfLength;
        if (reverseFullName.length % 2 != 0) {
            halfLength = (reverseFullName.length + 1) / 2;
        } else {
            halfLength = reverseFullName.length / 2;
        }
        for (int sign = 1; sign < halfLength + 1; sign++) {
            simbol = reverseFullName[sign-1];
            reverseFullName[sign-1] = reverseFullName[reverseFullName.length - sign];
            reverseFullName[reverseFullName.length - sign] = simbol;
        }
        for (int sign = 0; sign < reverseFullName.length; sign++) {
            System.out.print(reverseFullName[sign]);
        }
        System.out.println();

    }

}