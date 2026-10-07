import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] expenseBook = {546000, 347050, 247040, 634700, 1050350};

        //задача 1
        int sum = 0;
        for (int element : expenseBook) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        int maxElement = 0;
        int minElement = 999999999;
        for (int element : expenseBook) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        for (int element : expenseBook) {
            if (element < minElement) {
                minElement = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minElement + " рублей. Максимальная сумма трат за неделю составила " + maxElement + " рублей");

        //Задача 3
        float averageValue = sum / expenseBook.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char simbol;
        int halfLength;
        if (reverseFullName.length % 2 != 0) {
            halfLength = (reverseFullName.length + 1) / 2;
        } else {
            halfLength = reverseFullName.length / 2;
        }
        for (int sign = 0; sign < halfLength; sign++) {
            simbol = reverseFullName[sign];
            reverseFullName[sign] = reverseFullName[reverseFullName.length - sign -1];
            reverseFullName[reverseFullName.length - sign - 1] = simbol;
        }
        for (int sign = 0; sign < reverseFullName.length; sign++) {
            System.out.print(reverseFullName[sign]);
        }
        System.out.println();

    }
}