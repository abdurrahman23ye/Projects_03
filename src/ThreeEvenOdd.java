public class ThreeEvenOdd {

    public static void main(String[] args) {
        /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
        int[] array={2, 1, 3, 5};
        int tekSayac=0;
        int ciftSayac=0;

        for (int i = 0; i <array.length ; i++) {

            if(array[i]%2==0){ciftSayac++;}else{tekSayac++;}

        }
        boolean threeEvenOdd=false;
        if(ciftSayac>=3 || tekSayac>=3){threeEvenOdd=true;}

        System.out.println("threeEvenOdd = " + threeEvenOdd);



    }
}
