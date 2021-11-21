import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    question();
    System.exit(0);
  }

  public static void question ()
  {
    String station;
    String earlyStation = "";
    int mostPunctual = 999;
    int newLate;
    int total = 0;
    boolean end = false;

    while (end == false) {
      station = getString("What is the destination of the train that just departed?");
      if (station.equalsIgnoreCase("xxx")) {
        System.out.println(" ");
        end = true;
      } else {

        newLate = getInt("How many minutes late was it?");
        
        total = total + newLate;
        System.out.println("");

        if (newLate < mostPunctual) 
        {
          mostPunctual = newLate;
          earlyStation = station;
        }

      }

    }

    message(total, earlyStation, mostPunctual);
  }

  public static void message (int total, String station, int late) 
  {
    System.out.println("The trains were in total "+ total +" minutes late. ");
    System.out.println("The most punctual train was to "+ station +". It was "+ late +" minute late.");
  }

  public static String getString (String x)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print(x + " ");
    String station = scanner.nextLine();
    return station;

  }

  public static int getInt (String x)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print(x + " ");
    int newLate = scanner.nextInt();
    return newLate;
  }

}
