import java.util.*;

public class InteructRunner{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(){
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
		}finaly{
			scn.close();
		}	
	}
}