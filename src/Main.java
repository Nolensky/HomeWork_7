public class Main {
    public static void main(String[] args) {
        {
            // Критерии оценки задачи немного не сходятся с условиями, поэтму сделал так
            System.out.println("Задача 1");
            float salary = (float) 0;
            float percentPerMonth = (float) 0.01;
            int numberOfMonth = 0;
            while (salary < 2_459_000){
                salary = (salary + 15000) + salary * percentPerMonth;
                numberOfMonth = numberOfMonth +1;
                System.out.println("Месяц " + numberOfMonth + " сумма накоплений равна " + salary + " рублей");

            }
        }
        {
            System.out.println("Задача 2");
            int number = 0;
            while (number < 10){
                number++;
                System.out.print(number + " ");
            }
            System.out.println(" ");
            for (number = 10; number > 0; number--){
                System.out.print(number + " ");
            }
        }
        System.out.println("");
        {
            System.out.println("Задача 3");
            int birthRatePerYear = 17;
            int mortalityRatePerYear = 8;
            int totalPopulation = 12_000_000;
            for (int year = 1; year <= 10; year++){
              int populationGrowthPerYear = 12_000_000 / 1000 * (birthRatePerYear - mortalityRatePerYear);
              totalPopulation = totalPopulation + populationGrowthPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
            }
        }
        {
            System.out.println("Задача 4");
            int totalSum = 15000;
            int month = 0;
            while (totalSum <= 12_000_000){
                totalSum = totalSum + (totalSum / 100 * 7);
                month++;
                System.out.println("За месяц " + month + " сумма накоплений ровна " + totalSum);
            }
        }
        {
            System.out.println("Задача 5");
            int totalSum = 15000;
            int month = 0;
            while (totalSum <= 12_000_000){
                totalSum = totalSum + (totalSum / 100 * 7);
                month++;
                if (month % 6 == 0){
                    System.out.println("Мемяц " + month + " сумма накоплений ровна " + totalSum);
                } else {
                    System.out.println("Месяц " + month);
                }
            }
        }
        {
            System.out.println("Задача 6");
            int totalSum = 15000;
            for (int month = 1; month <= 9 * 12; month++){
                totalSum = totalSum + (totalSum / 100 * 7);
                if (month % 6 == 0){
                    System.out.println("Мемяц " + month + " сумма накоплений ровна " + totalSum);
                } else {
                    System.out.println("Месяц " + month);
                }
            }
        }
        {
            System.out.println("Задача 7");
            for (int numberFriday = 3; numberFriday <= 31; numberFriday += 7){
                System.out.println("Сегодня пятница, " + numberFriday + "-е число. Необходимо подготовить отчет.");
            }

        }
        {
            System.out.println("Задача 8");
            int startYear = 2024 - 200;
            int finishYear = 2024 + 100;
            for (int year = 0; year <= finishYear; year += 79){
                if (year >= startYear && year <= finishYear){
                    System.out.println(year);
                }
            }
        }
    }
}