package CAR;

public class Car {

	int oil = 10;
	int speed = 0;
	boolean enginState = false;
	
	

	public void startEngin() {
		if (enginState) { // 엔진이 꺼져있거나 켜져있는 경우
			System.out.println("시동이 걸리지 않습니다!");
		} else {
			if (oil > 0) {
				enginState = true;
				--oil;
				System.out.println("시동이 걸렸습니다!");
			} else { // 오일이 없을 경우
				System.out.println("오일이 없어 시동이 걸리지 않습니다!");
				System.out.println("주유소에 가서 오일을 충전하세요!");
			}
		}
	}

	public void speedUp() {
		if (enginState == true) {
			if (oil > 0) { // 오일이 있을 경우
				System.out.println("속도를 올려볼까요!!!");
				speed += 10;
				oil--;

			} else { // 오일이 없을 경우
				System.out.println("오일이 없네용 ㅎ");
				endEngin();
			}
		} else if (enginState == false) {
			System.out.println("엔진을 먼저 켜주세요!");
		}
	}

	public void endEngin() {
		enginState = false;
		System.out.println("시동이 꺼졌습니다!");
	}

	public void carState() {
		System.out.println("자동차의 상태  오일양 : " + oil + " 속도 : " + speed + " 엔진상태 : " + enginState);
		
	}

	public void inputOil(Refuler refuler) {
		oil += refuler.getOil();

	}


	

}
