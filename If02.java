import java.util.Scanner;
public class If02 {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if (age >= 18) {
			System.out.println("您的年龄大于18，要对自己的行为负责，送进监狱");
		} else {
			System.out.println("您的年龄小于18，这次放过你了");
		}
		System.out.println("程序继续...");
	}
}