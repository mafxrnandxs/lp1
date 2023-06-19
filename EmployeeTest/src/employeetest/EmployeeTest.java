/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;

public class EmployeeTest {

    public static void main(String[] args) {
        // Criando os objetos Employee
        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);

        // Exibindo o salário anual de cada objeto Employee
        System.out.println("Salário anual do Employee 1: " + employee1.getAnnualSalary());
        System.out.println("Salário anual do Employee 2: " + employee2.getAnnualSalary());

        // Aplicando aumento de 10% aos salários mensais dos Employee
        employee1.applySalaryIncrease(10.0);
        employee2.applySalaryIncrease(10.0);

        // Exibindo o salário anual atualizado de cada objeto Employee
        System.out.println("Salário anual do Employee 1 após aumento: " + employee1.getAnnualSalary());
        System.out.println("Salário anual do Employee 2 após aumento: " + employee2.getAnnualSalary());
    }
}