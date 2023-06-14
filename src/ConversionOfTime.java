
public class ConversionOfTime {
	
	public static void main(String[] args) {
		
		String totalWorkingTime="40h 56m 58s";
		String totalOnlinetime="35h 35m 51s";
		String totalOfflineTime="05h 21m 07s";
		String TotalBreakTime="02h 05m 02s";
		
		String[] parts = totalOnlinetime.split("\\s+");
		 int hours = Integer.parseInt(parts[0].replace("h", ""));
	        int minutes = Integer.parseInt(parts[1].replace("m", ""));
	        int seconds = Integer.parseInt(parts[2].replace("s", ""));
	        int to =hours * 3600 + minutes * 60 + seconds;
	        String finald=to+"";
	        System.out.println(finald);
	}
}
