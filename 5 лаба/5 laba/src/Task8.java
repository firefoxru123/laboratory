import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write number from 1 to 12");
		int x = sc.nextInt();
		switch (x) {
			case 1:
				System.out.println("Русский медвежонок");
				break;
			case 2:
				System.out.println("конкурс «Хороводы»");
				break;
			case 3:
				System.out.println("конкурс Веревочка");
				break;
			case 4:
				System.out.println("конкурс Смотай шнур");
				break;
			case 5:
				System.out.println("конкурс Достань яблоко");
				break;
			case 6:
				System.out.println("конкурс Укуси его ...");
				break;
			case 7:
				System.out.println("конкурс Кто это?");
				break;
			case 8:
				System.out.println("конкурс Бага-Яга");
				break;
			case 9:
				System.out.println("конкурс Переливалки");
				break;
			case 10:
				System.out.println("конкурс Лучший шофер");
				break;
			case 11:
				System.out.println("конкурс Взломщики");
				break;
			case 12:
				System.out.println("конкурс Взломщики");
				break;
			default:
				System.out.println("Vvedeno slishkom bolshoe chislo");
				break;
		}
	}

}
