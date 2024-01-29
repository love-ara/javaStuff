import java.time.LocalDate;

public class MenstrualCycleTracker{
    private int cycleLength;
    private int flowDuration;
    private LocalDate lastPeriodStartDate;
    private LocalDate lastPeriodEndDate;

    public MenstrualCycleTracker(int cycleLength, int flowDuration, LocalDate lastPeriodStartDate, LocalDate lastPeriodEndDate) {
        this.cycleLength = cycleLength;
	this.flowDuration = flowDuration;
	this.lastPeriodStartDate = lastPeriodStartDate;
        this.lastPeriodEndDate = lastPeriodEndDate;
    }

    public LocalDate predictNextPeriod() {
        return lastPeriodEndDate.plusDays(cycleLength);
    }

    public LocalDate ovulation(){
	LocalDate ovulationDate = lastPeriodStartDate.plusDays(cycleLength /2);
	return ovulationDate;
	}

    public String fertileWindows(){
	LocalDate firstWindow = lastPeriodStartDate.plusDays(9);
	LocalDate secondWindow = lastPeriodStartDate.plusDays(15);
	String fertileRange = " from  " + firstWindow + " to " +secondWindow;
	return fertileRange;
	}

   public String safe(){
	LocalDate safePeriod1 = lastPeriodStartDate.plusDays(flowDuration);
	LocalDate safePeriod2 = lastPeriodStartDate.plusDays(8);
	LocalDate safePeriod3 = lastPeriodStartDate.plusDays(16);
	LocalDate safePeriod4 = lastPeriodStartDate.plusDays(cycleLength);
	String safePeriod = " "+ safePeriod1 +" - " + safePeriod2 +" and " + safePeriod3 + " - "+ safePeriod4;
	return safePeriod;
	}


}

  
