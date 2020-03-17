package jp.ekata.oplossingen_noel;
import static jp.ekata.oplossingen_noel.Coin.*;

public class CoinApp {
   public static void main(String[] args) {

      Coin[] wallet = { FIFTY_CENTS, TWO_EURO, ONE_EUR,
         TEN_CENTS };

      int total = 0;

      for (Coin c : wallet) {
         total += c.getValue();
         System.out.println(c);
      }

      System.out.println(total);
   }
}
