// importing java.time for date objects and functionality
import java.time.*;

// importing java.util for Scanner to take in user input
import java.util.*;



public class AgeCalc {

// setting up instance variables for class    
LocalDate currentDate = LocalDate.now();
String birthDay;
LocalDate birthDate;
Scanner scan = new Scanner(System.in);
Period totalDays;


public void birthdayInput(){

    // This is the prompt to gather user's birthday info
    System.out.println("please enter your birthday in this format (yyyy-mm-dd)");
    String birthDay = scan.next();
    scan.close();

    //converting string to LocalDate object
    LocalDate birthDate = LocalDate.parse(birthDay);
    System.out.println("Thank you for your input");
    System.out.println("Current Date is " + currentDate);
    System.out.println("You were born on " + birthDate);
    System.out.println("Calculating age....");

    //Assiging period object by confirming interval between birthDate and currentDate LocalDate objects
    Period totalDays = Period.between(birthDate, currentDate);

    //Using getYears and getDays methods on totalDays object to display the age values for user
    System.out.println("You are " + totalDays.getYears() + " years and " + totalDays.getDays() + " days old.");
}




        public static void main(String[] args){
            
            //Instantiating Age Calculator object
            AgeCalc ageTest = new AgeCalc();

            System.out.println("-----------------");
            ageTest.birthdayInput();
            System.out.println("-----------------");

        }

}