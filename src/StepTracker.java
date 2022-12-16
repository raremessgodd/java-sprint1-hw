import java.util.Scanner;

public class StepTracker {

    public static void printSteps(int[][] calendar, int monthNumber){
        for (int i = 0; i < calendar[0].length; i++){
            if (i == calendar[0].length - 1){
                System.out.print(i +" день " + ": " + calendar[monthNumber][i] + ".\n");
            }
            else if ((i+1) % 10 == 0){
                System.out.print(i +" день " + ": " + calendar[monthNumber][i] + ",\n");
            }
            else{
                System.out.print(i +" день " + ": " + calendar[monthNumber][i] + ",  ");
            }
        }
    }

    public static void saveSteps(Scanner scanner, int[][] calendar, int monthNumber){
        System.out.println("Введите номер дня: ");
        int dayNumber = scanner.nextInt();
        if (dayNumber >= 0 && dayNumber < 30){
            System.out.println("Введите количество шагов: ");
            int stepsNumber = scanner.nextInt();
            if (stepsNumber >= 0){
                calendar[monthNumber][dayNumber] = stepsNumber;
                System.out.println("Сохранено!");
            }
            else{
                System.out.println("Пожалуйста, введите неотрицательное количество шагов.");
            }
        }
        else{
            System.out.println("Пожалуйста, введите корректный номер дня.");
        }
    }

    public  static void sumSteps(int[][] calendar, int monthNumber){
        int sumSteps = 0;
        for (int i = 0; i < calendar[0].length; i++){
            sumSteps += calendar[monthNumber][i];
        }
        System.out.println("\nЗа этот месяц пройдено шагов: " + sumSteps + "\n");
    }

    public static void meanSteps(int[][] calendar, int monthNumber){
        int sumSteps = 0;
        for (int i = 0; i < calendar[0].length; i++){
            sumSteps += calendar[monthNumber][i];
        }
        System.out.println("За этот месяц в среднем пройдено шагов: " + sumSteps/calendar[0].length + "\n");
    }

    public  static void maxSteps(int[][] calendar, int monthNumber){
        int maxSteps = 0;
        for (int i = 0; i < calendar[0].length; i++){
            if (calendar[monthNumber][i] > maxSteps){
                maxSteps = calendar[monthNumber][i];
            }
        }
        System.out.println("Ваш дневной рекорд по шагам в этом месяце: " + maxSteps + "\n");
    }

    public static void stepsGoalsStreak(int[][] calendar, int monthNumber, int stepsGoal){
        int streak = 0;
        int maxStreak = 0;
        for (int i = 0; i < calendar[0].length; i++){
            if (calendar[monthNumber][i] >= stepsGoal){
                streak++;
                if (streak > maxStreak){
                    maxStreak = streak;
                }
            }
            else{
                streak = 0;
            }
        }
        System.out.println("Ваша лучшая серия в этом месяце: " + maxStreak + "\n");
    }

    public static int changeStepsGoal(Scanner scanner, int stepsGoal){
        System.out.println("Ваша текущая цель: " + stepsGoal);
        System.out.println("Введите вашу новую дневную цель: ");
        int newStepsGoal = scanner.nextInt();
        if (newStepsGoal >= 0){
            stepsGoal = newStepsGoal;
            System.out.println("Ваша новая цель: " + stepsGoal);
        }
        else{
            System.out.println("Пожалуйста, введите положительное число.");
        }
        return stepsGoal;
    }
}
