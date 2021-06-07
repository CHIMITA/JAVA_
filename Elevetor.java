
public class Elevetor extends Lift {

	int maxFloor = 10;
	int minFloor = -3;

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
					 try { Thread.sleep(1000); }
	                 catch (InterruptedException e) {}

					up();
					
					if (floor != 0)
						System.out.println(floor + "��");
				}	
				
			} else {
				for (int i = floor; i > choice; i--) {
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
		System.out.println("����");
	}
}
