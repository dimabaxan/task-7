import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        calculator.addCommand("1", new AddCommand());
        calculator.addCommand("2", new SubtractCommand());
        calculator.addCommand("3", new MultiplyCommand());
        calculator.addCommand("4", new DivideCommand());

        while (true) {
            System.out.print("Введите первый номер (a): ");
            double a = scanner.nextDouble();

            System.out.print("Введите второй номер (b): ");
            double b = scanner.nextDouble();

            System.out.println("Выберите операцию: ");
            System.out.println("1:Добавление");
            System.out.println("2: Уменьшение");
            System.out.println("3: Умножение");
            System.out.println("4:Разделение");

            System.out.print("Твой выбор: ");
            String choice = scanner.next();

            try {
                double result = calculator.executeCommand(choice, a, b);
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            System.out.println("Вы хотите выполнить еще одну операцию? (Да/Нет): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("Да")) {
                break;
            }
        }

        scanner.close();
    }
}


