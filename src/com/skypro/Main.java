package com.skypro;

public class Main {

    public static void main(String[] args) {

        //Task 1
        byte num1 = 120;
        short num2 = 1200;
        int num3 = 1200000;
        long num4 = 120000000000000L;

        float floatValue = 12.2f;
        double doubleValue = 12.5;

        char characterValue = 'a';

        boolean isActive = false;

        //Task 2
        double weightOfTheFirstBoxer = 78.2; // kg
        double weightOfTheSecondBoxer = 82.7; // kg
        double totalWeightOfTwoBoxers = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        double differenceBetweenTwoBoxers = Math.abs(weightOfTheFirstBoxer - weightOfTheSecondBoxer);
        System.out.println("Task 2:");
        System.out.println("The total weight is: " + totalWeightOfTwoBoxers + " kg");
        System.out.println("The difference is: " + differenceBetweenTwoBoxers + " kg");
        System.out.println("-------------------------------------------");

        //Task 3
        //The breakfast recipe:
        int bananas = 5; // items
        int milk = 200; // ml
        int iceCream = 2; // boxes
        int eggs = 4; // items
        //The value in gr for 1 item/box/100ml
        int weightOfOneBanana = 80; // gr
        int weightOfEachHundredMlOfMilk = 105; // gr per each 100 ml
        int weightOfOneBoxOfIceCream = 100; // gr
        int weightOfOneEgg = 70; // gr
        //Total weight of the breakfast in gr
        int totalWeightOfBreakfastInGrams = (bananas * weightOfOneBanana) +
                (milk / 100 * weightOfEachHundredMlOfMilk) +
                (iceCream * weightOfOneBoxOfIceCream) +
                (eggs * weightOfOneEgg);
        //Total weight of the breakfast in kg
        double totalWeightOfBreakfastInKilos = (double) totalWeightOfBreakfastInGrams / 1000;
        System.out.println("Task 3");
        System.out.println("Total weight of the breakfast in kg is: " + totalWeightOfBreakfastInKilos + " kg");
        System.out.println("-------------------------------------------");

        //Task 4
        int weightWhichTheSportsmanShouldLoseInKilos = 7; // kg
        int weightTheSportsmanShouldLosePerDayInFirstCase = 250; // gr
        int weightTheSportsmanShouldLosePerDayInSecondCase = 500; // gr
        int daysForLosingWeightInFirstCase = (weightWhichTheSportsmanShouldLoseInKilos * 1000) / weightTheSportsmanShouldLosePerDayInFirstCase;
        System.out.println("Task 4");
        System.out.println("The number of days for diet in case of 250 gr per day: " + daysForLosingWeightInFirstCase);
        int daysForLosingWeightInSecondCase = (weightWhichTheSportsmanShouldLoseInKilos * 1000) / weightTheSportsmanShouldLosePerDayInSecondCase;
        System.out.println("The number of days for diet in case of 500 gr per day: " + daysForLosingWeightInSecondCase);
        int averageNumberOfDays =  (daysForLosingWeightInFirstCase + daysForLosingWeightInSecondCase) / 2;
        System.out.println("Average number of days for 7kg diet is: " + averageNumberOfDays);
        System.out.println("-------------------------------------------");

        //Task 5
        int salaryOfMasha = 67760; // in rubles
        int salaryOfDenis = 83690; // in rubles
        int salaryOfKristina = 76230; // in rubles

        double incrementOfSalaryPerYear = 1.1;

        int newSalaryOfMasha = (int) (salaryOfMasha * incrementOfSalaryPerYear);
        int newSalaryOfDenis = (int) (salaryOfDenis * incrementOfSalaryPerYear);
        int newSalaryOfKristina = (int) (salaryOfKristina * incrementOfSalaryPerYear);

        int incrementOfMashaSalary = (newSalaryOfMasha - salaryOfMasha) * 12;
        int incrementOfDenisSalary = (newSalaryOfDenis - salaryOfDenis) * 12;
        int incrementOfKristinaSalary = (newSalaryOfKristina - salaryOfKristina) * 12;

        System.out.println("Task 5");
        System.out.println("Маша теперь получает " + newSalaryOfMasha + " рублей. Годовой доход вырос на " + incrementOfMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + newSalaryOfDenis + " рублей. Годовой доход вырос на " + incrementOfDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryOfKristina + " рублей. Годовой доход вырос на " + incrementOfKristinaSalary + " рублей");
        System.out.println("--------------------------------------");










    }
}
