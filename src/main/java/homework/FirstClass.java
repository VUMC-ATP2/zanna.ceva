package homework;

public class FirstClass {
     public static void main(String[] args) {
          String CountryName = "Portugal";
          /*System.out.println("This country is" + CountryName);*/
          System.out.printf("This country is %s.", CountryName);
          int CountryPopulation = 10344802;
          /*System.out.printf(" The population of the " + CountryName + " is " + CountryPopulation + ".");*/
          System.out.printf("The population of the %s is %d.", CountryName, CountryPopulation);
          double CountryArea = 92.212;
          System.out.println(CountryName + " territory is " + CountryArea + " \u33A2.");
          String CapitalName = "Lisbon";
          System.out.println("The capital of " + CountryName + " is " + CapitalName + ".");
          String CountryLanguage = "Portuguese";
          System.out.println(CountryLanguage + " is the official language of " + CountryName + ".");
          String EurUnion = "Europian Union";
          String CurrencyEuro = "\u20AC";
          System.out.println(CountryName + " is a part of the " + EurUnion + "," + " as a result the official currency of the country is " + CurrencyEuro + " (Euro).");
          System.out.println("Let's calculate:");
          int a = 10;
          int b = 2;
          int c = a + b;
          int d = a - b;
          int Result = (Math.max(a, b));
          System.out.println(Result);

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
          int e = a/b + Result;
          System.out.println("Result is " + e);
          int ResultMin = (Math.min(a, b));
          int f = a*b + ResultMin;
          System.out.println("Result is " + f);
          System.out.println("Home task about " + CountryName + " is finished!");
     }
}


