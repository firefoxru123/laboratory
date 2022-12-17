import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число от 1 до 5");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("вы ввели число 1 теперь введите число от 1 до 3");
            int y = sc.nextInt();
            switch (y) {
                case 1: {
                    System.out.println("вариант 1");
                    break;
                }
                case 2: {
                    System.out.println("вариант 2");
                    break;
                }
                case 3: {
                    System.out.println("вариант 3");
                    break;
                }
                default: {
                    System.out.println("Введенно неверное число");
                    break;
                }
            }
        } else {
            if (x == 2) {
                System.out.println("вы ввели число 2 теперь введите число от 1 до 3");
                int z = sc.nextInt();
                switch (z) {
                    case 1: {
                        System.out.println("вариант 1");
                        break;
                    }
                    case 2: {
                        System.out.println("вариант 2");
                        break;
                    }
                    case 3: {
                        System.out.println("вариант 3");
                        break;
                    }
                    default: {
                        System.out.println("Введенно неверное число");
                        break;
                    }
                }
            } else {
                if (x == 3) {
                    System.out.println("вы ввели число 3 теперь введите число от 1 до 3");
                    int c = sc.nextInt();
                    switch (c) {
                        case 1: {
                            System.out.println("вариант 1");
                            break;
                        }
                        case 2: {
                            System.out.println("вариант 2");
                            break;
                        }
                        case 3: {
                            System.out.println("вариант 3");
                            break;
                        }
                        default: {
                            System.out.println("Введенно неверное число");
                            break;
                        }
                    }
                } else {
                    if (x == 4) {
                        System.out.println("вы ввели число 4 теперь введите число от 1 до 3");
                        int v = sc.nextInt();
                        switch (v) {
                            case 1: {
                                System.out.println("вариант 1");
                                break;
                            }
                            case 2: {
                                System.out.println("вариант 2");
                                break;
                            }
                            case 3: {
                                System.out.println("вариант 3");
                                break;
                            }
                            default: {
                                System.out.println("Введенно неверное число");
                                break;
                            }
                        }
                    } else {
                        if (x > 4) {
                            System.out.println("введено слишком большое число");
                        }
                    }
                }
            }
        }
    }
}