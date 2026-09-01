void main() {
//Задача 1
    int r = 50;
    byte c = 126;
    short n = 32767;
    long m = 9223;
    float v = 3.4f;
    double b = 1.7;

    System.out.println(r);
    System.out.println(c);
    System.out.println(n);
    System.out.println(m);
    System.out.println(v);
    System.out.println(b);
//
//Задача 2
    double firstValue = 27.123;
    long secondValue = 987_678_965_549L;
    double thirdValue = 2.786;
    short fourthValue = 569;
    int fifthValue = -159;
    short sixthValue = 27897;
    byte seventhValue = 67;

    System.out.println(firstValue);
    System.out.println(secondValue);
    System.out.println(thirdValue);
    System.out.println(fourthValue);
    System.out.println(fifthValue);
    System.out.println(sixthValue);
    System.out.println(seventhValue);

//Задача 3
    int ludmila = 23;
    int anna = 27;
    int ekaterina = 30;
    int itaAll = 480;
    int p = ludmila + anna + ekaterina;
    int q = itaAll / p;
    System.out.println(" всего учеников " + p);
    System.out.println(q + " достанется листов каждому ученику ");

//Задача 4
    // Исходные данные
    int bottlesInTwoMinutes = 16;
    int periodInMinutes = 2;

    // Находим производительность в одну минуту
    int bottlesPerMinute = bottlesInTwoMinutes / periodInMinutes; // 8 бутылок в минуту

    // 1. За 20 минут
    int minutes20 = 20;
    int result20Minutes = bottlesPerMinute * minutes20;
    System.out.println("За 20 минут машина произвела " + result20Minutes + " штук бутылок");

    // 2. В сутки (24 часа * 60 минут)
    int minutesInDay = 24 * 60;
    int result1Day = bottlesPerMinute * minutesInDay;
    System.out.println("За сутки машина произвела " + result1Day + " штук бутылок");

    // 3. За 3 дня
    int result3Days = result1Day * 3;
    System.out.println("За 3 дня machine произвела " + result3Days + " штук бутылок");

    // 4. За 1 месяц (принимаем стандартный расчетный месяц за 30 дней)
    int result1Month = result1Day * 30;
    System.out.println("За 1 месяц машина произвела " + result1Month + " штук бутылок");

//Задача 5
    int totalPaint = 120;
    int whitePerClass = 2;
    int brownPerClass = 4;

    // Всего краски на один класс
    int paintPerClass = whitePerClass + brownPerClass; // 6 банок

    // Находим количество классов в школе
    int totalClasses = totalPaint / paintPerClass;

    // Считаем общее количество банок каждого цвета
    int totalWhitePaint = totalClasses * whitePerClass;
    int totalBrownPaint = totalClasses * brownPerClass;

    System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
//Задача 6
// Ингредиенты по условию
    int bananasCount = 5;
    int bananaWeight = 80;

    int milkVolume = 200;
    int milkWeightPer100ml = 105;

    int iceCreamCount = 2;
    int iceCreamWeight = 100;

    int eggsCount = 4;
    int eggWeight = 70;

    // Подсчёт веса каждого продукта согласно условию
    int totalBananasWeight = bananasCount * bananaWeight;
    int totalMilkWeight = (milkVolume / 100) * milkWeightPer100ml;
    int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
    int totalEggsWeight = eggsCount * eggWeight;

    // Общий вес в граммах
    int totalWeightInGrams = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;

    // Перевод в килограммы (делим на 1000.0, чтобы сохранить дробную часть)
    double totalWeightInKg = totalWeightInGrams / 1000.0;

    System.out.println("Вес спортзавтрака в граммах: " + totalWeightInGrams + " г");
    System.out.println("Вес спортзавтрака в килограммах: " + totalWeightInKg + " кг");
//Задача 7
    int targetLossKg = 7;
    int minLossPerDayGrams = 250;
    int maxLossPerDayGrams = 500;

    // Переводим цель похудения из кг в граммы
    int targetLossGrams = targetLossKg * 1000;

    // Расчет дней для каждого случая
    int daysAtMinLoss = targetLossGrams /


            minLossPerDayGrams;
    int daysAtMaxLoss = targetLossGrams / maxLossPerDayGrams;

    // Среднее количество дней (среднее арифметическое между максимальным и минимальным сроком)
    int overageDays = (daysAtMinLoss + daysAtMaxLoss) / 2;

    System.out.println("При потере 250 г в день уйдет: " + daysAtMinLoss + " дней.");
    System.out.println("При потере 500 г в день уйдет: " + daysAtMaxLoss + " дней.");
    System.out.println("В среднем на похудение потребуется: " + overageDays + " дней.");

//Задача 8
    // Текущие зарплаты сотрудников
    double mashaSalary = 67760;
    double denisSalary = 83690;
    double kristinaSalary = 76230;

    // Процент повышения (10%)
    double raisePercent = 0.10;

    // Расчет для Маши
    double mashaNewSalary = mashaSalary + (mashaSalary * raisePercent);
    double mashaAnnualDifference = (mashaNewSalary - mashaSalary) * 12;
    System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualDifference + " рублей.");

    // Расчет для Дениса
    double denisNewSalary = denisSalary + (denisSalary * raisePercent);
    double denisAnnualDifference = (denisNewSalary - denisSalary) * 12;
    System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей.");

    // Расчет для Кристины
    double kristinaNewSalary = kristinaSalary + (kristinaSalary * raisePercent);
    double kristinaAnnualDifference = (kristinaNewSalary - kristinaSalary) * 12;
    System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей.");
}