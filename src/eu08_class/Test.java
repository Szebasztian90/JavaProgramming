package eu08_class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

      boolean isTall = scan.nextBoolean();
      boolean isFast = scan.hasNextBoolean();
      boolean isFlexible = scan.hasNextBoolean();
      String sport = "";

      if (isTall){

          if(isFast){
              sport = "basketball";
          }else if (isFlexible){
              sport = "gimas";
          }else{
              sport = "voley";
          }
      }else{

          if (isFast){
              sport = "scoore";
          }else{
              sport = "tess";
          }
      }

        System.out.println(sport);
    }
}