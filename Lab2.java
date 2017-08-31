/**
 Harrison Zickler
 Lab 2 Skeleton

 */
import java.util.*;

public class Lab2
{
    static final double KM_PER_MILE = 1.609;

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");

        String first_name = kbd.nextLine();

        Scanner kbd1 = new Scanner(System.in);
        System.out.print("Enter Your Last Name: ");

        String last_name =kbd.nextLine();

        Scanner kbd2 =new Scanner(System.in);
        System.out.print("Enter Race Distance in Miles: ");

        Double race_distance_miles = kbd.nextDouble();

        Scanner kbd3 =new Scanner(System.in);
        System.out.print("Enter Finish Time in Whole Minutes: ");

        int finish_time_min =kbd.nextInt();

        Double race_distance_km = race_distance_miles * KM_PER_MILE;


        int finish_time_hr = finish_time_min / 60;
        int finish_time_mins = finish_time_min % 60;


        Double pace = finish_time_min / race_distance_miles;

        Double speed = race_distance_miles / finish_time_hr;

        System.out.println(finish_time_hr);


        System.out.println("Race Distace : " + race_distance_miles + " miles " + "(or " + race_distance_km + " kilometers)");
        System.out.println("Runner       : " + last_name +", " + first_name);
        System.out.println("Finish Time  : " + finish_time_hr + " hours and " + finish_time_mins + " minutes");
        System.out.println("Avg Pace     : " + pace + " minutes/mile");
        System.out.println("Avg Speed    : " + speed + " miles/hour");



        // ERASE COMMENTS AFTER YOU GET YOUR PROGRAM WORKING

        // declare any variables that you need

        // prompt the user with this message: "Enter your first name: "
        // use the assignment operator '=' to store the result of the scan into an appropriate variable

        // prompt the user with this message: "Enter your last name: "
        // use the assignment operator '=' to store the result of the scan into an appropriate variable

        // prompt the user with this message: "Enter race distance in miles: "
        // use the assignment operator '=' to store the result of the scan into an appropriate variable
        // the race distance can include a fraction of a mile, e.g. 3.1 miles.

        // prompt the user with this message: "Enter finish time in minutes: "
        // use the assignment operator '=' to store the result of the scan into an appropriate variable
        // the finish time must be whole minutes, e.g. 32 is a legal input, 32.5 is not legal

        // compute and store the total kilometers, this should be stored as a double
        // convert the total number of minutes into hours and minutes using the
        // the division (/) operator and the modulo (%) operator

        /* print the formatted output exactly as below.
           The runner name in this case was Joan Benoit and the distance entered in this case was 26.2 (the
           length of a marathon) and the finish time was 141.

            Race Distance : 26.2 miles (or 42.1558 kilometers).
            Runner        : Benoit, Joan
            Finish time   : 2 hours and 21 minutes
            Avg Pace      : 5.3816793893129775 minutes/mile
            Avg Speed     : 11.148936170212766 miles/hour

         */

        // END COMMENTS

        kbd.close();
    }
}
