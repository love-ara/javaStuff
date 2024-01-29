import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class MenstrualCycleDriver{
   	public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Welcome!");

        System.out.print("Enter the length of your menstrual cycle (in days): ");
        int cycleLength = input.nextInt();
	
 	System.out.print("How long was your period for? (in numbers): ");
        int flowDuration = input.nextInt();

	System.out.print("Enter the date you started last period (yyyy-MM-dd): ");
        String lastPeriodStartDateStr = input.next();
        LocalDate lastPeriodStartDate = LocalDate.parse(lastPeriodStartDateStr);

        System.out.print("Enter the date you ended last period (yyyy-MM-dd): ");
        String lastPeriodDateString = input.next();
        LocalDate lastPeriodEndDate = LocalDate.parse(lastPeriodDateString);
	//System.out.print(lastPeriodEndDate);
        MenstrualCycleTracker tracker = new MenstrualCycleTracker(cycleLength, flowDuration, lastPeriodStartDate, lastPeriodEndDate);

        LocalDate nextPeriodDate = tracker.predictNextPeriod();
        System.out.println("Next predicted period date: " + nextPeriodDate.format(DateTimeFormatter.ISO_DATE));
	
	System.out.println("Your ovulation date is " + tracker.ovulation());
	System.out.println("Your fertile range is" + tracker.fertileWindows());
	System.out.println("It is safe for you have sex from" + tracker.safe());

    }
}
