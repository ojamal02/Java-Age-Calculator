import java.time.*;
import java.util.*;



public class AgeCalc {
    
LocalDate currentDate = LocalDate.now();
String birthDay;
LocalDate birthDate;
Scanner scan = new Scanner(System.in);
Period totalDays;


public void birthdayInput(){

    System.out.println("please enter your birthday in this format (yyyy-mm-dd)");
    String birthDay = scan.next();
    scan.close();
    LocalDate birthDate = LocalDate.parse(birthDay);
    System.out.println("Thank you for your input");
    System.out.println("Current Date is " + currentDate);
    System.out.println("You were born on " + birthDate);
    System.out.println("Calculating age....");
    Period totalDays = Period.between(birthDate, currentDate);
    System.out.println("You are " + totalDays.getYears() + " years and " + totalDays.getDays() + " days old.");
}




        public static void main(String[] args){
            
            AgeCalc ageTest = new AgeCalc();

            System.out.println("-----------------");
            ageTest.birthdayInput();
            System.out.println("-----------------");

        }

}