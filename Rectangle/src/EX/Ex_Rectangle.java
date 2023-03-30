package EX;

class Rectangle {
	int width;
	int height;

	int getArea() {
		return width * height;
	}
}

public class Ex_Rectangle {

	public static int solution(int w, int h) {
		Rectangle rectangle = new Rectangle();
		rectangle.width = w;
		rectangle.height = h;

		int answer = 0;
		answer = rectangle.getArea();

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(6, 2));
	}
}
