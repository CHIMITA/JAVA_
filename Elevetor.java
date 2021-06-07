
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
			
			System.out.println("지금 선택하신 그 층에 있습니다!");
			
		} else if (choice >= minFloor && choice <= maxFloor && choice != 0) {
			
			System.out.println("출발합니다!\n" + floor + "층");

			if (choice > floor) { // 선택한 층이 현재 층보다 높을 경우
				for (int i = floor; i < choice; i++) {
					 try { Thread.sleep(1000); }
	                 catch (InterruptedException e) {}

					up();
					
					if (floor != 0)
						System.out.println(floor + "층");
				}	
				
			} else {
				for (int i = floor; i > choice; i--) {
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
		System.out.println("도착");
	}
}
