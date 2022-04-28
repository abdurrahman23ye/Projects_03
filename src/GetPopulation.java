import java.util.Scanner;

public class GetPopulation {

    public static void main(String[] args) {
        /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    Method adı populationOfCountry
    Bu method  String array(countryNames) ,  int array (countryPopulations) ve   String (str) alacak

     countryNames : Ülke isimleri

     countryPopulations: Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */
        Scanner scan=new Scanner(System.in);

        String[] countryNames = {"USA" ,"Mexico" ,"Canada"};

        int countryPopulations[] = {100000 , 120000 , 130000};

        int input= scan.nextInt();

        if(input<=countryNames.length && input>0){
            System.out.println(countryPopulations[input]);
        }else {
            System.out.println(-1);
        }





    }
}
