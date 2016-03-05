import java.util.Scanner;

public class InteructRunner{
	public static void main(String[] args){
		System.out.println("Calculaor...");
		Scanner scn = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")) {
				System.out.println("¬ведите первое число");
				String firs = scn.next();
				System.out.println("¬ведите второе число");
				String second = scn.next();
				calc.add(Integer.valueOf(firs), Integer.valueOf(second));
				System.out.println("Result: "+ calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit = scn.next();
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			scn.close();
		}	
	}
}