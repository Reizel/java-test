public class Calculate{
	
	public static void main(String[] args){
		System.out.print("Calculate...");
		Calculator calc = new Calculator();
		for(int i=0; i<args.lenght; i++){
			calc.add(Integer.valueOf(args[i]));
		}
		int summ = calc.getResult();
		System.out.println("Summ " + summ);
		calc.cleanResult();
	}
}