import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int systemStepsGoal = 10000;
        int [][] calendar = new int[12][30];
        while (true){
            PrintMenu();
            int userChoice = scanner.nextInt();
            if (userChoice == 1){
                int month = GetMonthNumber();
                if (month >= 0 && month < 12){
                    StepTracker.SaveSteps(scanner, calendar, month);
                }
                else{
                    System.out.println("Пожалуйста, введите корректный номер месяца.");
                }
            }
            else if (userChoice == 2){
                int month = GetMonthNumber();
                if (month >= 0 && month < 12){
                    StepTracker.printSteps(calendar, month);
                    StepTracker.SumSteps(calendar, month);
                    StepTracker.MaxSteps(calendar, month);
                    StepTracker.MeanSteps(calendar, month);
                    Converter.TotalDistance(calendar, month);
                    Converter.BurnedCalories(calendar, month);
                    StepTracker.StepsGoalsStreak(calendar, month, systemStepsGoal);
                }
                else{
                    System.out.println("Пожалуйста, введите корректный номер месяца.");
                }
            }
            else if (userChoice == 3){
                systemStepsGoal = StepTracker.ChangeStepsGoal(scanner, systemStepsGoal);
            }
            else if (userChoice == 4){
                System.out.println("Выход...");
                break;
            }
        }
    }
    public static void PrintMenu(){
        System.out.println(
                "\nВвести количество шагов за определённый день - 1.\n" +
                        "Напечатать статистику за определённый месяц - 2.\n" +
                        "Изменить цель по количеству шагов в день - 3.\n" +
                        "Выйти из приложения - 4.\n");
    }

    public static int GetMonthNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        return scanner.nextInt();
    }

}