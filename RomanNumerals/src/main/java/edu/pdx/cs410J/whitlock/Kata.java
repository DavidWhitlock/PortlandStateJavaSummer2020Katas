package edu.pdx.cs410J.whitlock;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  static String romanNumeralFor(int number) {
    if (number > 10) {
      return "X" + romanNumeralFor(number - 10);

    } else {
      return romanNumeralBetween1And10(number);
    }
  }

  private static String romanNumeralBetween1And10(int number) {
    switch (number) {
      case 1:
        return "I";

      case 2:
        return "II";

      case 3:
        return "III";

      case 4:
        return "IV";

      case 5:
        return "V";

      case 6:
        return "VI";

      case 7:
        return "VII";

      case 8:
        return "VIII";

      case 9:
        return "IX";

      case 10:
        return "X";

      default:
        return null;
    }
  }
}