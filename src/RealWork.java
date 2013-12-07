import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RealWork{

	//private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Scanner scanner = new Scanner(System.in);
	private int cases;
	public RealWork(String[] args) {
		super();
	}
	public void run(){
		cases = scanner.nextInt();
		for (int i = 1;i <= cases; i++){
			runCase(i);
		}
/*		try {
			cases = scanner.nextInt();
			for (int i = 1;i <= cases; i++){
				runCase(i);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	private String[] runCase(int caseNumber){
		int creditAmount, itemsNumber;
		creditAmount = scanner.nextInt();
		itemsNumber = scanner.nextInt();
		int prices [] = new int[itemsNumber]; 
		// read inputs
		for (int i = 0; i < itemsNumber; i++){
			prices[i] = scanner.nextInt();
		}
		for (int i = 0; i < itemsNumber; i++){
			for (int j = i+1; j < itemsNumber; j++){
				if ( creditAmount == prices[i] + prices[j]){
					System.out.println("Case #" + caseNumber + ": " + (i+1) + " " + (j+1));
					break;
				}
			}
		}
		return null;
	}
	
}