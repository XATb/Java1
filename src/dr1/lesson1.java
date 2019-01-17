package dr1;

public class lesson1  {

        public static void main(String[] args) {
            System.out.println(calculate(2, 2, 2, 2));
            System.out.println(task10and20(5, 6));
            isPositiveOrNegative(-30);
            greetings("Sancho");

        }

        /**
         * Задание 2
         * Создать переменные всех пройденных типов данных, и инициализировать их значения;
         */
        public static void task2() {
            byte b = 127;
            short st = 12419;
            char ch = 'A';
            int integer = 24;
            long lg = 124124L;
            float fl = 12.345949f;
            double dl = 4323.45345;
            boolean bool = true;
        }

        /**
         * Задание 3
         * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
         * где a, b, c, d – входные параметры этого метода;
         */
        public static int calculate(int a, int b, int c, int d) {
            return a * (b + (c / d));
        }

        /**
         * Задание 4
         * Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
         * пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
         */
        public static boolean task10and20(int x1, int x2) {
            int sum = x1 + x2;
            return sum > 9 && sum < 21;
        }

        /**
         * Задание 5
         * Написать метод, которому в качестве параметра передается целое число, метод должен
         * напечатать в консоль положительное ли число передали, или отрицательное;
         * Замечание: ноль считаем положительным числом
         */
        public static void isPositiveOrNegative(int num) {
            String word = "Положительное";
            if (num < 0) word = "Отрицательное";

            System.out.println(word);
        }

        /**
         * Задание 6
         * Написать метод, которому в качестве параметра передается целое число, метод должен
         * вернуть true, если число отрицательное;
         */
        public static boolean isNegative(int num) {
            return num < 0;
        }

        /**
         * Задание 7
         * Написать метод, которому в качестве параметра передается строка, обозначающая имя,
         * метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
         */
        public static void greetings(String name) {
            System.out.printf("Привет, %s!\n", name);
        }

        /**
         * Задание 8 *
         * Написать метод, который определяет является ли год високосным, и выводит сообщение в
         * консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
         * високосный.
         */
        public static void printYear(int year) {
            if (isLeapYear(year)) {
                System.out.println("Високосный");
            } else {
                System.out.println("Не високосный");
            }
        }

        public static boolean isLeapYear(int year) {
            if (((year % 4) == 0) && !((year % 100) == 0)) {
                return true;
            } else if ((year % 400) == 0) {
                return true;
            }
            return false;
        }
    }



