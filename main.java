import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    question();
    System.exit(0);
  }

  public static void question ()
  {
    String station = "";
    String earlyStation = "";
    int mostPunctual = 999;
    int newLate;
    int total = 0;
    boolean end = false;

    while (end == false) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("What is the destination of the train that just departed? ");
      station = scanner.nextLine();

      if (station.equalsIgnoreCase("xxx")) {
        System.out.println(" ");
        end = true;
      } else {
        System.out.print("How many minutes late was it? ");
        newLate = scanner.nextInt();
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

}
