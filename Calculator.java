
public class Calculator{
	private int result;
	
	public void add(int... args){
		for(Integer arg:args){
			this.result+=arg;
		}
	}
	public int getResult(){
		return this.result;
	}
	public void cleanResult(){
		this.result = 0;
	}
}