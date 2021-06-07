package ELE;
public abstract class Lift {

	static int floor = 1;
	
	//추상 클래스 
	abstract void up(); //올라감
	abstract void down(); //내려감
	abstract boolean start(int choice); //층 선택
	abstract void stop(); //도착
	abstract void go(); //이동
	
}