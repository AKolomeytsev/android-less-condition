public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Не распознанная операционная система");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if(clientOS == 0){
            System.out.println(clientDeviceYear>=2015?"Установите версию приложения для iOS по ссылке":"Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientOS == 1){
            System.out.println(clientDeviceYear>=2015?"Установите версию приложения для Android по ссылке":"Установите облегченную версию приложения для Android по ссылке");
        }else{
            System.out.println("Не распознанная операционная система");
        }

        System.out.println("Задание 3");
        int year = 1700;
        if(year%400 == 0){
            System.out.println("Год высокосный");
        }else if(year%4 == 0 && year%100!=0){
            System.out.println("Год высокосный");
        }else{
            System.out.println("Год не высокосный");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 50;
        int countDay = 1;
        if(deliveryDistance<20){
            System.out.println("Срок доставки карты - " + countDay);
        }else if(deliveryDistance>=20 && deliveryDistance<60){
            countDay++;
            System.out.println("Срок доставки карты - " + countDay);
        }else{
            countDay+=2;
            System.out.println("Срок доставки карты - " + countDay);
        }

        System.out.println("Задание 5");
        int season  = 0;
        int month = 11;
        if((month>0 && month<3) || month==12){
            season = 1;
        }else if(month>=3 && month<6){
            season = 2;
        }else if (month>=6 && month<9){
            season = 3;
        } else if (month>=9 && month<12) {
            season = 4;
        }

        switch (season){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не верный номер месяца");
        }

        System.out.println("Задание 6");
        int age = 19;
        int countSalary = age<23?2:3;
        double salary = 58_000;
        double coefficient = 1;
        if(salary>=50_000 && salary<80_000){
            coefficient = 1.2;
        }else if(salary>=80_000){
            coefficient = 1.5;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary*countSalary*coefficient) + " рублей.");
    }
}
