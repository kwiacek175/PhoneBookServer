/*
 *  Komunikator sieciowy
 *   - program uruchamiajacy serwer i dwoch klientow
 *
 *  Autor: Kacper Wiącek 259378
 *   Data: styczeń 2023 r.
 */

class Tester {

    public static void main(String [] args){
        new PhoneBookServer();

        try{
            Thread.sleep(1000);
        } catch(Exception e){}

        new PhoneBookClient("Kacper", "localhost");

        new PhoneBookClient("Natalia", "localhost");
    }

}