import java.util.Random;

public class Car_OilStation {

	int speed = 0;
	String id = "벤츠";
	int oil = 5;
	boolean engineState = false;

	public void startEngine() {
		if (engineState) { // 엔진 상태가 거짓일 경우
			System.out.println("시동이 걸리지 않습니다!");
		} else {
			if (oil > 0) { // 기름이 0보다 많을 경우
				engineState = true; // 엔진상태 참
				System.out.println("부릉부릉~ 시동이 걸렸습니다!");
				--oil;
			} else { // 기름이 없을경우
				System.out.println("기름이 없어 시동이 걸리지 않습니다!");
				System.out.println("주유소에 가서 기름을 충전하세요!");
			}
		}
	}

	public void oilState() {
		System.out.println("현재 오일양 :" + oil);
	}

	public void speedUP() {
		if (engineState) {
			if (oil > 0) {
				System.out.println("속도를 올려봅시다!");
				speed += 10;
				--oil;
				System.out.println("현재속도 :" + speed);
			}
		} else { // 기름이 없을 경우
			endEngine();
		}
	}

	public void endEngine() {
		engineState = false;
		System.out.println("시동이 꺼졌습니다!");
	}

	public void oiling() {
		System.out.println("주유를 시작합니다!");
		System.out.println("CAR ID :" + id + " 주유중");
		oil++;
		System.out.println("CAR ID :" + id + " 주유 완료");
	}

	public void oil_check() {
		if (oil > 0) {
			System.out.println("기름이 있네요!");
		} else {
			System.out.println("기름이 없습니다!");
		}
	}
	
	public void inputOil(RefuelCar refuelCar) {
		oil = refuelCar.getOil();
	}

	public void none_oil() {
		if (oil <= 0) {
			System.out.println("기름이 없으니 주행을 종료하겠습니다!");
			System.out.println("더 주행하시려면 주유를 해주세요!");
		}
	}
}
