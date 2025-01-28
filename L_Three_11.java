import java.util.Random;
public class L_Three_11 {
public static double[][] determineSalaryAndYears(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            double salary = 10000 + (random.nextInt(90000));
            int yearsOfService = random.nextInt(20);
            
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }
	public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonus = 0;
            double newSalary = 0;
            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary;
            } else {
                bonus = 0.02 * oldSalary;
            }
            newSalary = oldSalary + bonus;
            result[i][0] = oldSalary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }
	public static void displaySalaryAndBonusReport(double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        
        for (int i = 0; i < result.length; i++) {
            double oldSalary = result[i][0];
            double newSalary = result[i][1];
            double bonus = result[i][2];
            
            System.out.println( i + 1+", "+ oldSalary+", "+ newSalary+", "+ bonus);
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        
        double[][] salaryAndYears = determineSalaryAndYears(numEmployees);
        double[][] salaryAndBonus = calculateNewSalaryAndBonus(salaryAndYears);
        displaySalaryAndBonusReport(salaryAndBonus);
    }
}
