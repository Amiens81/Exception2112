import java.util.Scanner;
//todo решение первой задачи
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите любое число!");
		int a = scanner.nextInt();
		try {
			getOdd(a);
			System.out.println("Число " + a);
		}catch (IllegalArgumentException e){
			System.out.println(e);
		}
	}
	public static void getOdd(int a) throws IllegalArgumentException{
		if(a % 2 != 0){
			throw new IllegalArgumentException("Выбрасываем исключение. Число " + a + " нечётное!");
		}
	}
}