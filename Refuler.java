package CAR;

public class Refuler {

	int oilBox = 0;
	int myOilBox = 100;

	public int getOil() {

		oilBox = 10;
		myOilBox -= 10;
		
		System.out.println("������ �����մϴ�~");

		if (myOilBox == 0) {
			System.out.println("������ �������!");
			System.out.println("���� ���� ������ �� �մϴ�!^^");
		}

		return oilBox;
	}
}
