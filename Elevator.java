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

			System.out.println("지금 선택하신 그 층에 있습니다!");

		} else if (choice >= minFloor && choice <= maxFloor && choice != 0) {

			System.out.println("출발합니다!\n" + floor + "층");

			if (choice > floor) { // 선택한 층이 현재 층보다 높을 경우
				for (int i = floor; i < choice; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					up();

					if (floor != 0)
						System.out.println(floor + "층");
				}

			} else {
				for (int i = floor; i > choice; i--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					
					down();

					if (floor != 0)
						System.out.println(floor + "층");
				}
			}

			stop();

			return true;

		} else
			System.out.println("선택하신 층은 존재하지 않습니다!");

		return false;
	}

	@Override
	void stop() {
		System.out.println("도착하셨습니다!");
	}

	@Override
	void go() {

		int choice = 0;
		String msg = "층수를 입력하세요! \n현재층: " + floor + ")\n층 입력: ";
		while (true) {
			System.out.print(msg);
			choice = sc.nextInt();
			if (start(choice))
				break;
		}
	}
	
	void human() {
		System.out.println("성함을 입력해주세용 :");
		human = sc.next();
		
		
		System.out.println(human);
	}

}