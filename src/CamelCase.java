public class CamelCase {
    public static void main(String[] args) {
         /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

        String input="I lIVe in uSa";

  String camelCase= camelCase(input);
        System.out.println("camelCase = " + camelCase);
    }

    private static String camelCase(String input) {
       String input1=input.substring(0,1).toUpperCase();




        for (int i = 1; i <input.length(); i++) {

            if(input.substring(i-1,i).equals(" ")){input1+=input.substring(i,i+1).replace(input.substring(i,i+1),input.substring(i,i+1).toUpperCase());}

            else{input1+=input.substring(i,i+1);}


            }

       return input1;  }


  }

