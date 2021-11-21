import java.util.Scanner;

class Main {
  //main function which executes the main method
  public static void main(String[] args) {
    question();
    System.exit(0);
  } // END of main

  //this method questions the user about train details
  public static void question ()
  {
    //declaring variables needed for loop
    String station;
    String earlyStation = "";
    int mostPunctual = 999;
    int newLate;
    int total = 0;
    boolean end = false;

    //loop asks questions until end is true
    while (end == false) {

      //aks questions and returns strings
      station = getString("What is the destination of the train that just departed?");

      //if xxx is entered then end becomes true
      if (station.equalsIgnoreCase("xxx")) {
        System.out.println(" ");
        end = true; // ends the while loop
      } else {

        //asks question and returns int
        newLate = getInt("How many minutes late was it?");
        
        total = total + newLate; // tracker for cumlative minutes late
        System.out.println("");

        //compares new late value, if smaller...
        if (newLate < mostPunctual) 
        {
          //replaces mostPunctual and earlyStation variables with more recent newLate and station
          mostPunctual = newLate;
          earlyStation = station;
        }

      }

    }

    //message emthod to produce message with variables retreived from questions
    message(total, earlyStation, mostPunctual);
  } // END of question

  //outputs message using variables
  public static void message (int total, String station, int late) 
  {
    System.out.println("The trains were in total "+ total +" minutes late. ");
    System.out.println("The most punctual train was to "+ station +". It was "+ late +" minute late.");
  }//END of message

  //outputs argument and takes in String which is returned
  public static String getString (String x)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print(x + " ");
    String station = scanner.nextLine();
    return station;

  }//END of getString

  //outputs argument and takes in value which is returned
  public static int getInt (String x)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print(x + " ");
    int newLate = scanner.nextInt();
    return newLate;
  }//END of getInt

}
