import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      int intNumber ,intDonusum ;
      double doubleNumber, doubleDonusum;
        Scanner userInp = new Scanner(System.in);
        System.out.println("Double'a Dönüştürülecek Tam Sayiyi Giriniz ");

        intNumber = userInp.nextInt();

        System.out.println("İnteger'a Dönüştürülecek Double Sayiyi Giriniz ");

        doubleNumber= userInp.nextDouble();



        System.out.println((double)intNumber);
        System.out.print( (int)doubleNumber);



    }
}