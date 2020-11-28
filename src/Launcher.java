public class Launcher  {

    public void run() throws InterruptedException {
        while (true) {
//            System.out.println(LanguageManager.INSTANCE.getLanguage());
            System.out.println("zmenit jazyk?");

            /**
             * TODO
             * 1) posunte kod nize, tak aby zmena jazyka probihala v LanguageManageru
             * 2) upravte kod tak, aby nacitani vstupu probihalo v InputManager
             *      - ten vytvorte, pouzijte navrhovy vzor singleton, implementujte pomoci enumu
             */

            InputManager.INSTANCE.getScanner();
//            LanguageManager.INSTANCE.setLanguage();
            System.out.println(LanguageManager.INSTANCE.getLanguage());



        }
    }
}
