package CAR;

public class Car {

	int oil = 10;
	int speed = 0;
	boolean enginState = false;
	
	

	public void startEngin() {
		if (enginState) { // ������ �����ְų� �����ִ� ���
			System.out.println("�õ��� �ɸ��� �ʽ��ϴ�!");
		} else {
			if (oil > 0) {
				enginState = true;
				--oil;
				System.out.println("�õ��� �ɷȽ��ϴ�!");
			} else { // ������ ���� ���
				System.out.println("������ ���� �õ��� �ɸ��� �ʽ��ϴ�!");
				System.out.println("�����ҿ� ���� ������ �����ϼ���!");
			}
		}
	}

	public void speedUp() {
		if (enginState == true) {
			if (oil > 0) { // ������ ���� ���
				System.out.println("�ӵ��� �÷������!!!");
				speed += 10;
				oil--;

			} else { // ������ ���� ���
				System.out.println("������ ���׿� ��");
				endEngin();
			}
		} else if (enginState == false) {
			System.out.println("������ ���� ���ּ���!");
		}
	}

	public void endEngin() {
		enginState = false;
		System.out.println("�õ��� �������ϴ�!");
	}

	public void carState() {
		System.out.println("�ڵ����� ����  ���Ͼ� : " + oil + " �ӵ� : " + speed + " �������� : " + enginState);
		
	}

	public void inputOil(Refuler refuler) {
		oil += refuler.getOil();

	}


	

}
