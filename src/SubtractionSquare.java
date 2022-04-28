public class SubtractionSquare {
    public static void main(String[] args) {
          /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare: bu method parametre olara iki int alır ve  parametreleri getSumOfSquares methodu ile
    return edilen degerlerin toplamını  return eder.

  Örnek:
    int 1 = 10;
    int 2 = 5;
    3025 + 225 = 3250
    return 3250

   getSumOfSquares methodunu kullanarak Parametre sayıya kadar sayıları toplar ve toplamın karesini return eder.
   Örnek:
      int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir

  parametreleri kullanıcıdan alınız
    */
        int input1=2;
        int input2=2;
        getSumOfSquares(input1,input2);
    }

    private static void getSumOfSquares(int input1, int input2) {

      int  getSum1=0;
       int getSum2=0;

        for (int i = 0; i <=input1 ; i++) {

            getSum1+=(int)Math.pow(i,2);

        }


        for (int i = 0; i <=input2; i++) {

            getSum2+=(i*i);

        }


        System.out.println("getSumSquares= " + (getSum1+getSum2));


    }
}
