public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //задача 1
        System.out.println("Задача 1");
        int max=2000000;
        byte tip=100;
        short rip=15000;
        long mix=50000000L;
        float chest =3.55f;
        double chastChasti=12.589525621;
        System.out.println("Значение переменной " + "max" + " с типом int" + " равно "+max) ;// tip rip mix chest chastChasti);
        System.out.println("Значение переменной " + "tip" + " с типом byte" + " равно "+tip);
        System.out.println("Значение переменной " + "rip" + " с типом short" + " равно "+rip);
        System.out.println("Значение переменной " + "mix" + " с типом long" + " равно "+mix);
        System.out.println("Значение переменной " + "chest" + " с типом float" + " равно "+chest);
        System.out.println("Значение переменной " + "chastChasti" + " с типом double" + " равно "+chastChasti);

        //Задача 2
        float a =27.12f;
        long s = 987678965549L;
        float f=2.786f;
        short e= 569;
        short t=-159;
        short h=27897;
        byte b=67;


        //Задача 3
        System.out.println("Задача 3");
        byte lP=23, aS=27, eA=30; //lP- Людмила Павловна, aS- Анна Сергеевна, eA - Екатерина Андреевна
       int paperList=480;
       int allStudent=lP+aS+eA;
       int paperListForStudy= paperList/allStudent;
        System.out.println("На каждого ученика рассчитано "+paperListForStudy+" листов бумаги.");

        //Задача 4
        System.out.println("Задача 4");
        int time=20; //время в минутах
        int bottleItog=(time/2)*16;
        System.out.println("За "+time+" минут, машина произвела "+bottleItog+" штук бутылок.");
        time=24*60;
        bottleItog=(time/2)*16;
        System.out.println("За "+time+" минут, 1 сутки, машина произвела "+bottleItog+" штук бутылок.");
        time=time*3;
        bottleItog=(time/2)*16;
        System.out.println("За "+time+" минут, 3 суток,  машина произвела "+bottleItog+" штук бутылок.");
        time=time*10;
        bottleItog=(time/2)*16;
        System.out.println("За "+time+" минут, 1 месяц(30 суток), машина произвела "+bottleItog+" штук бутылок.");

        //Задача 5
        System.out.println("Задача 5");
        byte shoolDye =120, classDye=4+2;
        int classInShool=shoolDye/classDye;
        int whiteDye= shoolDye/classDye*2,brownDye=shoolDye/classDye*4 ;
        System.out.println("В школе, где "+classInShool+" классов, нужно "+whiteDye+" банок белой краски и "+brownDye+" банок коричневой краски.");
        //Задача 6
        System.out.println("Задача 6");
        int bananas=5*80, milk=2*105, acecream=2*100, eggs = 4*70;
        int weightGramm=bananas+milk+acecream+eggs;
        System.out.println("Вес завтрака спортсмена в граммах "+weightGramm);
        float weightKg=weightGramm/1000;
        System.out.println("Вес завтрака спортсмена в килограммах "+weightKg);
        //Задача 7
        System.out.println("Задача7");
        int sportsMan=7*1000;
        int daySportsMan250=sportsMan/250;
        int daySportsMan500=sportsMan/500;
        System.out.println("Если спортсмен будет терять 250 грамм в день ему понадобится "+daySportsMan250+" дней, а если 500 грамм в день то "+daySportsMan500+" дней.");
        //Задача 8
        System.out.println("Задача 8");
        int zpMasha=67760, zpDenis=83690, zpKristina=76230;
        double newZpMasha=zpMasha*1.1;
        double newZpDenis=zpDenis*1.1;
        double newZpKristina=zpKristina*1.1;
        double yearZpMasha=(newZpMasha*12)-(zpMasha*12);
        double yearZpDenis=(newZpDenis*12)-(zpDenis*12);
        double yearZpKristina=(newZpKristina*12)-(zpKristina*12);
        System.out.println("Маша теперь получает "+newZpMasha+" рублей. Годовой доход вырос на "+yearZpMasha+" рублей");
        System.out.println("Денис теперь получает "+newZpDenis+" рублей. Годовой доход вырос на "+yearZpDenis+" рублей");
        System.out.println("Кристина теперь получает "+newZpKristina+" рублей. Годовой доход вырос на "+yearZpKristina+" рублей");

    }

}