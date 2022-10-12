package inheritance;

public abstract class abstractrecipe {

	public void execute(){
		getready();
		dothedish();
		cleanup();
	}
	
	abstract void getready();
	abstract void dothedish();
	abstract void cleanup();

}
