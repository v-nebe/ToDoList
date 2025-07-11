import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true){
            System.out.println("\n--- Список задач ---");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Отметить задачу как выполненную");
            System.out.println("4. Показать список задач");
            System.out.println("5. Выход");
            System.out.print("Введите номер действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Введите задачу, которую хотите добавить: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Введите индекс задачи, которую хотите удалить: ");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.print("Введите индекс задачи, которую хотите отметить выполненной: ");
                    int completedIndex = scanner.nextInt();
                    taskManager.completeTask(completedIndex);
                    break;
                case 4:
                    taskManager.showTasks();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}