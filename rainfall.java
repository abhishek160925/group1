package TEST;

public class rainfall {

	public static void main(String[] args) {
		Float[] rain= {10.2f,11.9f,8.0f,11.2f,10.8f,6.9f,8.2f,11.5f,10.4f,8.7f,7.8f,7.5f};
		float sum=0;
		for(int i=0;i< 12;i++)
			sum  +=rain[i];
		float avg=sum/12;
		System.out.println("Average rainfall is"+ avg);
		for(int i=0;i<12;i++) {
			if(rain[i] > avg)
				System.out.println("RAinfall of month "+(i+1) + " is higher than average.");
		}

	}

}