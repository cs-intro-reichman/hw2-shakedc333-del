public class TimeCalc {
    public static void main(String[] args) {
	int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
	int minutesToAdd = Integer.parseInt("" + args[1]);
	int TotalMinutes = (hours*60) + minutes + minutesToAdd ;

	int Total_hours = TotalMinutes / 60 ;
	int New_hours = Total_hours % 24 ; 
	int New_minutes = TotalMinutes - (Total_hours * 60) ;
	System.out.print(New_hours<10 ? "0"+New_hours : New_hours);	
	System.out.println(":"+(New_minutes<10 ? "0"+New_minutes: New_minutes)); 


	}
}
