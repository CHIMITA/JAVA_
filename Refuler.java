package CAR;

public class Refuler {

	int oilBox = 0;
	int myOilBox = 100;

	public int getOil() {

		oilBox = 10;
		myOilBox -= 10;
		
		System.out.println("오일을 충전합니다~");

		if (myOilBox == 0) {
			System.out.println("오일이 동났어요!");
			System.out.println("이제 오일 충전은 못 합니다!^^");
		}

		return oilBox;
	}
}
