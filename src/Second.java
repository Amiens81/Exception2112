import java.util.Scanner;
//todo решение второй задачи
public class Second {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строковое значение!");
		String str = scanner.nextLine();
		try{
			inputStr(str);
			System.out.println("Строка без числового значения : " + str);
		}catch (IllegalArgumentException e){
			System.out.println(e);
		}
	}
	public static void inputStr(String str) throws IllegalArgumentException{
		if(str == null || str == ""){
			throw new IllegalArgumentException("Строка не может быть пустой или иметь значение nill!");
		}
		for(char i:  str.toCharArray()) {
			if(Character.isDigit(i)){
				throw new IllegalArgumentException("Выбрасываем исключение. В строке содержится числовое значение: " + str);
		}
		}
	}
}
