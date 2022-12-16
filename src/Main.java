import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int myYear =1989; // загаданый год, для проверки метода. Задача 1.
        leapYear(myYear); // метод - решение первого задания
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear(); // параметр для задания 2
        int clientOS = 1; //(0 — iOS, 1 — Android)
        System.out.println(currentYear);
        deviceApp(clientOS,currentYear); // Объявили метод «задача2»
    }

    public static void leapYear(int year) { // Вызвали метод «задача1»

        int leapYearRule1 =year%4;//первое правило високосного года.
        int leapYearRule2 =year%100;//второе правило високосного года.
        int leapYearRule3 =year%400;//третие правило високосного года.
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        // Также високосным является каждый четырехсотый год.
        if(leapYearRule1==0&&leapYearRule2>0||leapYearRule3==0)
            System.out.println(year+" год - является високосным");
        else
            System.out.println(year+" год - является обычным");
    }

    public static void deviceApp(int clientOS,int clientDeviceYear) { // Вызвали метод «задача2»

        if (clientDeviceYear<2015&&clientOS!=1){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
        else if (clientDeviceYear<2015&&clientOS==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else if(clientDeviceYear>=2015&&clientOS!=1) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
}