package Application;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Program
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary= sc.nextDouble();

        sc.close();
    }
}
