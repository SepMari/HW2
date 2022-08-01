public class Main {
    public static void main(String[] args) {
        //Задание 1
        int apple = 20;
        byte pineapple = 4;
        short pear = 3;
        long peach = 9_157_358L;
        float plum = 2.5f;
        double apricot = 1.2;
        char bar = 35;
        boolean boxApple = apple >= 20;

        //Задание 2

        float boxer_1 = 78.2f;
        float boxer_2 = 82.7f;
        float totalWeight = boxer_1 + boxer_2;
        float differenceWeight = boxer_2 - boxer_1;
        System.out.println("Общий вес двух бойцов = " + totalWeight);
        System.out.println("Разницу между весами бойцов = " + differenceWeight);

        //Задание 3

        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int rawEggs = 4;
        int grPerKg = 1000;
        int bananasGrams = bananas * 80;
        int milkGrams = milk * 105 /100;
        int iceCreamGrams = iceCream * 100;
        int rawEggsGrams = rawEggs * 70;
        int totalGrams = bananasGrams + milkGrams + iceCreamGrams + rawEggsGrams;
        float totalKilograms = totalGrams / grPerKg;
        System.out.println("Общее количество в граммах = " + totalGrams);
        System.out.println("Общее количество в килограммах = " + totalKilograms);

        //Задание 4
        int weightLossKilogram = 7;
        int losesGram_1 = 250;
        int losesGram_2 = 500;
        float daysLosesGram_250 = weightLossKilogram * grPerKg / losesGram_1;
        float daysLosesGram_500 = weightLossKilogram * grPerKg / losesGram_2;
        float averageDays = (daysLosesGram_500 + daysLosesGram_250) / 2;
        System.out.println("Дней потрачено, если терять по 250 гр = " + daysLosesGram_250 + "; Дней потрачено, если терять по 500 гр = " + daysLosesGram_500);
        System.out.println("Среднее количество дней = " + averageDays);

        //Задание 5
        int incomeMaria = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        int monthsYear = 12;
        int plusPercentage = 10;
        double newIncomeMaria = (incomeMaria * 100) / 90;
        double newIncomeDenis = (incomeDenis * 100) / 90;
        double newIncomeKristina = (incomeKristina * 100) / 90;
        double differenceIncomeMaria = (newIncomeMaria - incomeMaria) * monthsYear;
        double differenceIncomeDenis = (newIncomeDenis - incomeDenis) * monthsYear;
        double differenceIncomeKristina = (newIncomeKristina - incomeKristina) * monthsYear;
        System.out.println("Маша теперь получает " + newIncomeMaria + " рублей. Годовой доход вырос на " + differenceIncomeMaria + " рублей");
        System.out.println("Денис теперь получает " + newIncomeDenis + " рублей. Годовой доход вырос на " + differenceIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + newIncomeKristina + " рублей. Годовой доход вырос на " + differenceIncomeKristina + " рублей");

    }
}