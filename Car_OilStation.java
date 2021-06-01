import java.util.Random;

public class Car_OilStation {

	int speed = 0;
	String id = "����";
	int oil = 5;
	boolean engineState = false;

	public void startEngine() {
		if (engineState) { // ���� ���°� ������ ���
			System.out.println("�õ��� �ɸ��� �ʽ��ϴ�!");
		} else {
			if (oil > 0) { // �⸧�� 0���� ���� ���
				engineState = true; // �������� ��
				System.out.println("�θ��θ�~ �õ��� �ɷȽ��ϴ�!");
				--oil;
			} else { // �⸧�� �������
				System.out.println("�⸧�� ���� �õ��� �ɸ��� �ʽ��ϴ�!");
				System.out.println("�����ҿ� ���� �⸧�� �����ϼ���!");
			}
		}
	}

	public void oilState() {
		System.out.println("���� ���Ͼ� :" + oil);
	}

	public void speedUP() {
		if (engineState) {
			if (oil > 0) {
				System.out.println("�ӵ��� �÷����ô�!");
				speed += 10;
				--oil;
				System.out.println("����ӵ� :" + speed);
			}
		} else { // �⸧�� ���� ���
			endEngine();
		}
	}

	public void endEngine() {
		engineState = false;
		System.out.println("�õ��� �������ϴ�!");
	}

	public void oiling() {
		System.out.println("������ �����մϴ�!");
		System.out.println("CAR ID :" + id + " ������");
		oil++;
		System.out.println("CAR ID :" + id + " ���� �Ϸ�");
	}

	public void oil_check() {
		if (oil > 0) {
			System.out.println("�⸧�� �ֳ׿�!");
		} else {
			System.out.println("�⸧�� �����ϴ�!");
		}
	}
	
	public void inputOil(RefuelCar refuelCar) {
		oil = refuelCar.getOil();
	}

	public void none_oil() {
		if (oil <= 0) {
			System.out.println("�⸧�� ������ ������ �����ϰڽ��ϴ�!");
			System.out.println("�� �����Ͻ÷��� ������ ���ּ���!");
		}
	}
}
