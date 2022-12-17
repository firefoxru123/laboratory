import java.util.Scanner;
import static java.lang.Math.*;

class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		float x = sc.nextFloat();
		System.out.println("Введите y");
		float y = sc.nextFloat();
		int c1 = 0, c2 = 0;
		sc.close();
		if (x >= -4 & x <= -3) {
			if (-x - 4 >= y & x + 4 <= y) {
				c1 += 1;
			}
		}
		if (x >= -3 & x <= -2) {
			if (-x - 4 >= y & (sqrt(4 - (x + 1)) + 1 <= y)) {
				c1 += 1;
			}
		}
		if (x >= -2 & x <= -1) {
			if (x >= y & (sqrt(4 - (x + 1)) + 1 <= y)) {
				c1 += 1;
			}
		}
		if (x >= -1 & x <= 0) {
			if (((2 * x + 5 <= y) & (4 * x + 5 >= y))
					| ((pow(x + 1, 2) + pow(y - 1, 2) <= 4) & (4.0 / 5 * x + 9.0 / 5 <= y))) {
				c1 += 1;
			}
		}
		if (x >= 0 & x <= 1) {
			if ((pow(x + 1, 2) + pow(y - 1, 2) <= 4) & (4.0 / 5 * x + 9.0 / 5 <= y)) {
				c1 += 1;
			}
		}
		if (x >= 1 & x <= 2) {
			if (4.0 / 5 * x + 1.8 <= y & -x + 2 >= y) {
				c1 += 1;
			}
		}
		if (x >= 2 & x <= 3) {
			if ((1.0 / 2 * x - 5 <= y & -1.0 / 2 * x - 3 >= y) | (-x + 1 <= y & pow(x - 4, 2) + pow(y + 1, 2) <= 4)
					| (-x + 2 >= y & -2 * x + 5 <= y) | (4.0 / 5 * x + 9.0 / 5 <= y & 2 * x + 3 >= y)) {
				if ((-x + 2 >= y & -2 * x + 5 <= y) | (4.0 / 5 * x + 9.0 / 5 <= y & 2 * x + 3 >= y)) {
					c1 += 1;
				} else if ((1.0 / 2 * x - 5 <= y & -1.0 / 2 * x - 3 >= y)
						| (-x + 1 <= y & pow(x - 4, 2) + pow(y + 1, 2) <= 4)) {
					c2 += 1;
				}
			}
		}
		if (x >= 3 & x <= 4) {
			if ((4.0 / 5 * x + 9.0 / 5 <= y & 2 * x + 3 >= y) | (1.0 / 2 * x - 5 <= y & -1.0 / 2 * x - 3 >= y)
					| (x - 5 <= y & pow(x - 4, 2) + pow(y + 1, 2) <= 4)) {
				if ((4.0 / 5 * x + 9.0 / 5 <= y & 2 * x + 3 >= y)) {
					c1 += 1;
				}
				if ((1.0 / 2 * x - 5 <= y & -1.0 / 2 * x - 3 >= y)
						| (x - 5 <= y & pow(x - 4, 2) + pow(y + 1, 2) <= 4)) {
					c2 += 1;
				}
			}
		}
		if (x >= 4 & x <= 5) {
			if ((3 * x - 17 >= y & x - 5 <= y) | (-x + 5 >= y & pow(x - 4, 2) + pow(y + 1, 2) <= 4)) {
				c2 += 1;
			}
		}
		if (x >= 5 & x <= 6) {
			if (-1.0 / 2 * x + 1.0 / 2 >= y & pow(x - 4, 2) + pow(y + 1, 2) <= 4) {
				c2 += 1;
			}
		}
		if (x >= 6 & x <= 7) {
			if ((-1.0 / 2 * x + 1.0 / 2 >= y) & (-2 * x + 11 <= y)) {
				c2 += 1;
			}
		}
		if (c1 > 0) {
			System.out.println("Hit on area 1");
		}
		if (c2 > 0) {
			System.out.println("Hit on area 2");
		}
		if (c1 == 0 & c2 == 0) {
			System.out.println("Don`t hit any areas");
		}
	}
}