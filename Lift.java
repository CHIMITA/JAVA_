package ELE;
public abstract class Lift {

	static int floor = 1;
	
	//�߻� Ŭ���� 
	abstract void up(); //�ö�
	abstract void down(); //������
	abstract boolean start(int choice); //�� ����
	abstract void stop(); //����
	abstract void go(); //�̵�
	
}