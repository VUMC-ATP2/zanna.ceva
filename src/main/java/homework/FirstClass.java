package homework;

public class FirstClass {
     public static void main(String[] args) {
          String countryName = "Portugal";
          /*System.out.println("This country is" + countryName);*/
          System.out.printf("This country is %s.", countryName);
          int countryPopulation = 10344802;
          /*System.out.printf(" The population of the " + countryName + " is " + countryPopulation + ".");*/
          System.out.printf("The population of the %s is %d.", countryName, countryPopulation);
          double countryArea = 92.212;
          System.out.println(countryName + " territory is " + countryArea + " \u33A2.");
          String capitalName = "Lisbon";
          System.out.println("The capital of " + countryName + " is " + capitalName + ".");
          String countryLanguage = "Portuguese";
          System.out.println(countryLanguage + " is the official language of " + countryName + ".");
          String eurUnion = "Europian Union";
          String currencyEuro = "\u20AC";
          System.out.println(countryName + " is a part of the " + eurUnion + "," + " as a result the official currency of the country is " + currencyEuro + " (Euro).");
          System.out.println("Let's calculate:");
          int a = 10;
          int b = 2;
          int c = a + b;
          int d = a - b;
          int result = (Math.max(a, b));
          System.out.println(result);

          if (a > 5) {
               System.out.println("Result is " + c);
          } else {
               System.out.println("Condition not met");
          }
          if (a > 10) {
               System.out.println("Result is " + d);
          } else {
               System.out.println("Condition not met!");
               if (b < 5) {
                    System.out.println("Result is " + d);
               } else {
                    System.out.println("Condition not met!");}
          }
          int e = a/b + result;
          System.out.println("Result is " + e);
          int resultMin = (Math.min(a, b));
          int f = a*b + resultMin;
          System.out.println("Result is " + f);
          System.out.println("Home task about " + countryName + " is finished!");
     }
}


