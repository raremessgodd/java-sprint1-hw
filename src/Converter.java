public class Converter {
    public static void totalDistance(int[][] calendar, int monthNumber){
        double distance = 0;
        for (int i = 0; i < calendar[0].length; i++){
            distance += calendar[monthNumber][i] * 0.00075;
        }
        System.out.println("За этот месяц вы прошли " + distance + " километра." + "\n");
    }

    public static void burnedCalories(int[][] calendar, int monthNumber){
        int burnedCalories = 0;
        for (int i = 0; i < calendar[0].length; i++){
            burnedCalories += calendar[monthNumber][i] * 50;
        }
        System.out.println("За этот месяц вы сожгли " + burnedCalories/1000 + " килокалорий." + "\n");
    }
}
