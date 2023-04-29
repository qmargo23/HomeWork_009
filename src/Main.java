import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_01();
        task_02();
        task_03();
        task_04();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;//  тестовая версия...
        }
        return arr;
    }
    /*Бухгалтеры попросили посчитать сумму всех выплат за месяц.
           Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
            «Сумма трат за месяц составила … рублей».*/
    public static void task_01() {
        System.out.println("Задача 1");

        int[ ] arr = generateRandomArray();
//        System.out.println(Arrays.toString(arr));
        int payments = 0; // начальная сумма выплат
        for (int j : arr) {
            payments = payments + j;
        }
        System.out.println("Сумма трат за месяц составила  "+payments+" рублей");
        System.out.println("_____________________________________");
    }
    /*Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
         «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».*/
    public static void task_02() {
        System.out.println("Задача 2");

        int[ ] arr = generateRandomArray();
//        System.out.println(Arrays.toString(arr));

        int paymentsMax = arr[0];
        for (final int current : arr) {
            if (current >= paymentsMax) {
                paymentsMax = current;
            }
        }

        int paymentsMin = arr[0];
        for (final int current : arr) {
            if (current <= paymentsMin) {
                paymentsMin = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + paymentsMin + "  рублей. Максимальная сумма трат за день составила "+ paymentsMax +"  рублей».");
        System.out.println("_____________________________________");
    }

    /*Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
    Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
     и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
     */
    public static void task_03() {
        System.out.println("Задача 3");

        int[ ] arr = generateRandomArray();
//        System.out.println(Arrays.toString(arr));
        float payments = 0f; // сумма выплат

        for (int j : arr) {
            payments = payments + j;
        }

        System.out.println("Средняя сумма трат за месяц составила "+payments/arr.length+" рублей");

        System.out.println("_____________________________________");
    }
    /*В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться
     в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся
     в виде массива символов — char[ ].
     Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
      В качестве данных для массива используйте: char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
      В результате в консоль должно быть выведено: Ivanov Ivan.
     */
    public static void task_04() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

//        System.out.println(reverseFullName.length/2);
        for (int i = reverseFullName.length - 1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
//            System.out.println(Arrays.toString(reverseFullName));
        }
    }
}