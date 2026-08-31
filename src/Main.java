//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
//
    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);

        byte a =1 ;
        short b = 2 ;
        int c = 3 ;
        long d = 4 ;
        float e = 1f ;
        double f = 2 ;
        System.out.println( a );
        System.out.println( b );
        System.out.println( c );
        System.out.println( d );
        System.out.println( e );
        System.out.println( f );

        double weight2 = 27.12 ;
        long days = 987_678_965_549L ;
        double weight = 2.786f ;
        short monht = 569 ;
        short bananas = -159 ;
        int river = 27897 ;
        byte apple = 67 ;
        System.out.println( weight2 );
        System.out.println( days );
        System.out.println( weight );
        System.out.println( monht );
        System.out.println( bananas );
        System.out.println( river );
        System.out.println( apple );

        byte studyRoom = 23 ;
        byte studyRoom2 = 27 ;
        byte studyRoom3 = 30 ;
        int peopleAll = studyRoom + studyRoom2 + studyRoom3 ;
        short paperAll = 480 ;
        int paper = 480 / peopleAll ;
        System.out.println( " На каждого ученика рассчитано " + paper + " листов бумаги " );


        byte bottles = 16 ;
        byte minutes = 2 ;
        byte minute = 16 / 2 ;
        int time = 20 ;
        int bottle = minute * 20 ;
        System.out.println( " За " + time + " машина произвела " + bottle + " штук бутылок " );

        int day = 1440 ;
        int bottleDay = minute * 1440 ;
        System.out.println( " За " + day + " машина произвела " + bottleDay + " штук бутылок " );

        int dayTry = 1440 * 3 ;
        int bottleDayTry = minute * dayTry ;
        System.out.println( " За " + dayTry + " машина произвела " + bottleDayTry + " штук бутылок " );

        int month = 1440 * 30;
        int bottleMonth = minute * month ;
        System.out.println( " За " + month + " машина произвела " + bottleMonth + " штук бутылок " );




        byte white = 2 ;
        byte brown = 4 ;
        int room = white + brown ;
        int bottleShoole = 120 ;
        int roomAll = bottleShoole / room ;
        int bottleShooleWhite = roomAll * white ;
        System.out.println( " Всего белой " + bottleShooleWhite + " краски " ) ;
        int bottleShooleBrown = roomAll * brown ;
        System.out.println( " Всего коричневой " + bottleShooleBrown + " краски " ) ;


        byte banana = 5 ;
        byte bananaWeight = 80 ;
        int bananaWeightGr = banana * bananaWeight ;
        byte milk = 105 ;
        byte milkWeight = 2 ;
        int milkWeightGr = milk * milkWeight ;
        byte aisCream = 100 ;
        byte things = 2 ;
        int aisCreamGr = aisCream * things ;
        byte egg = 70 ;
        byte thingsEggs = 4 ;
        int thingsEggsGr = thingsEggs * things ;
        int allGr = bananaWeightGr + milkWeightGr + aisCreamGr + thingsEggsGr ;
        System.out.println( " Спортзавтрак " + allGr + " грамм ");
        int grKg= 1000 ;
        float grAllKg = allGr / (float) grKg ;
        System.out.println( " Спортзавтрак " + grAllKg + " килограмм ");

        int weightAll = 7000 ;
        int weightOne = 250 ;
        int allDays = weightAll / weightOne ;
        System.out.println( " Понадобиться дней " + allDays + " , что бы терять вес по " + weightOne + " грамм в день" );


        int weightOneGr = 500 ;
        int allDaysAll = weightAll / weightOneGr ;
        System.out.println( " Понадобиться дней " + allDaysAll + " , что бы терять вес по " + weightOneGr + " грамм в день " );

        /*текущая зарплата*/
        int masha = 67760 ;
        int denis = 83690 ;
        int kris = 76230 ;
        /*процент*/
        double percent = 0.10 ;
        double newMasha = masha + ( masha * percent ) ;
        double newMasha12 = newMasha * 12 ;
        double newMashaDifference = newMasha - masha ;
        System.out.println( " Маша теперь получает " + newMasha + " рублей ");
        System.out.println( " Машина зарплата увеличилась на " + newMashaDifference + " рублей ");

        double newDenis = denis + ( denis * percent ) ;
        double newDenis12 = newDenis * 12 ;
        double newDenisDifference = newDenis - denis ;
        System.out.println( " Денис теперь получает " + newDenis + " рублей ");
        System.out.println( " Дениса зарплата увеличилась на " + newDenisDifference + " рублей ");

        double newKris = kris + ( kris * percent ) ;
        double newKris12 = newKris * 12 ;
        double newKrisDifference = newKris - kris ;
        System.out.println( " Кристина теперь получает " + newKris + " рублей ");
        System.out.println( " Кристинина зарплата увеличилась на " + newKrisDifference + " рублей ");






    }
}
