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
        //Take the users first name
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");

        String first_name = kbd.nextLine();

        //Take the users last name
        Scanner kbd1 = new Scanner(System.in);
        System.out.print("Enter Your Last Name: ");

        String last_name =kbd.nextLine();

        //Take the race distance in miles as a double
        Scanner kbd2 =new Scanner(System.in);
        System.out.print("Enter Race Distance in Miles: ");

        Double race_distance_miles = kbd.nextDouble();

        //Take the time to finish in minutes as a double
        Scanner kbd3 =new Scanner(System.in);
        System.out.print("Enter Finish Time in Whole Minutes: ");

        Double finish_time_min =kbd.nextDouble();

        //Convert the race distance from miles to kilometers
        Double race_distance_km = race_distance_miles * KM_PER_MILE;

        //Convert the finish time as a double to an int
        int finish_time_min_i =finish_time_min.intValue();

        //Convert the int value for minutes to an int of hours and minutes
        int finish_time_hr = finish_time_min_i / 60;
        int finish_time_mins = finish_time_min_i % 60;

        //Find the double hours value for the input minutes
        Double finish_time_hr_d = finish_time_min /60;

        //find the pace of the runner using
        Double pace = finish_time_min / race_distance_miles;

        //Find the speed of the runner using the double hours value
        Double speed = race_distance_miles / finish_time_hr_d;

        //Add spaces to make it look neater
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //Print out all the data input and calculated
        System.out.println("Race Distace : " + race_distance_miles + " miles " + "(or " + race_distance_km + " kilometers)");
        System.out.println("Runner       : " + last_name +", " + first_name);
        System.out.println("Finish Time  : " + finish_time_hr + " hours and " + finish_time_mins + " minutes");
        System.out.println("Avg Pace     : " + pace + " minutes/mile");
        System.out.println("Avg Speed    : " + speed + " miles/hour");

        //More spaces
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        kbd.close();
    }
}
