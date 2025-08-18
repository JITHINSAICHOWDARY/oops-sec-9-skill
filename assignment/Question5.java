package assignment;

public class Question5 {
    public static void main(String[] args) {
        // 2 salespersons, 4 months (for simplicity)
        int[][] sales = {
            {40000, 50000, 60000, 70000},
            {80000, 90000, 75000, 85000}
        };

        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            System.out.print("Salesperson " + (i + 1) + " -> ");
            
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
                total += sales[i][j];
            }

            double avg = total / (double) sales[i].length;
            String performance;
            if (avg >= 80000) performance = "Excellent";
            else if (avg >= 50000) performance = "Good";
            else if (avg >= 30000) performance = "Average";
            else performance = "Poor";

            System.out.println("\nTotal: " + total +
                               " | Average: " + avg +
                               " | Performance: " + performance + "\n");
        }
    }
}
