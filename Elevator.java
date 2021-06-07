package ELE;

import java.util.Scanner;

public class Elevator extends Lift {

	int maxFloor = 10;
	int minFloor = -3;
	int maxHuman = 7;
	int maxWeight = 700;
	int weight;

	String human;

	
	Scanner sc = new Scanner(System.in);
	
	@Override
	void up() {
		floor++;
	}

	@Override
	void down() {
		floor--;
	}

	@Override
	boolean start(int choice) {
		if (choice == floor) {

			System.out.println("���� �����Ͻ� �� ���� �ֽ��ϴ�!");

		} else if (choice >= minFloor && choice <= maxFloor && choice != 0) {

			System.out.println("����մϴ�!\n" + floor + "��");

			if (choice > floor) { // ������ ���� ���� ������ ���� ���
				for (int i = floor; i < choice; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					up();

					if (floor != 0)
						System.out.println(floor + "��");
				}

			} else {
				for (int i = floor; i > choice; i--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					
					down();

					if (floor != 0)
						System.out.println(floor + "��");
				}
			}

			stop();

			return true;

		} else
			System.out.println("�����Ͻ� ���� �������� �ʽ��ϴ�!");

		return false;
	}

	@Override
	void stop() {
		System.out.println("�����ϼ̽��ϴ�!");
	}

	@Override
	void go() {

		int choice = 0;
		String msg = "������ �Է��ϼ���! \n������: " + floor + ")\n�� �Է�: ";
		while (true) {
			System.out.print(msg);
			choice = sc.nextInt();
			if (start(choice))
				break;
		}
	}
	
	void human() {
		System.out.println("������ �Է����ּ��� :");
		human = sc.next();
		
		
		System.out.println(human);
	}

}