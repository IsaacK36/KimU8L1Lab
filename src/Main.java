public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"},
                                    {"Brian", "Elenor", "Harry", "Lenny"},
                                    {"Cathy", "Fred", "Jill", "Matt"}};
        seatingChart[1][2] = "Paul";
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;
        for (String[] row : seatingChart) {
            System.out.println(row.toString());
        }
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] row : arr1) {
            System.out.println(arr1.toString(row));
        }

    }
}
