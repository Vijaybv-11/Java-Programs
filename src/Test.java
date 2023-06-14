
public class Test {
	public static void main(String[] args) {
		
		String Time = "90h 15m 30s";
		int final_seconds = 0;
		String[] parts = null;
		try {

			if (!Time.contains("s")) {
				parts = Time.split("\\s+");
				int hours = Integer.parseInt(parts[0].replace("h", ""));
				int minutes = Integer.parseInt(parts[1].replace("m", ""));
				final_seconds = hours * 3600 + minutes * 60;
				System.out.println(final_seconds);
			} else {
				parts = Time.split("\\s+");
				int hours = Integer.parseInt(parts[0].replace("h", ""));
				int minutes = Integer.parseInt(parts[1].replace("m", ""));
				int seconds = Integer.parseInt(parts[2].replace("s", ""));
				final_seconds = hours * 3600 + minutes * 60 + seconds;
				System.out.println(final_seconds);

			}
		}

		catch (Exception e) {
			System.out.println("Exception"+e);
		}
	}

}
