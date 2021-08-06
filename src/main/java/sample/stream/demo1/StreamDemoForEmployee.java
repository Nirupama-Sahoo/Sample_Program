package sample.stream.demo1;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemoForEmployee {
    public static  void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

      //How many male and female employees are there in the organization?
        System.out.println("How many male and female employees are there in the organization?");
        Map<String, Long> noOfMaleAndFemaleEmployees=
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

        //Print the name of all departments in the organization?
        System.out.println("Print the name of all departments in the organization?");
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        //What is the average age of male and female employees?
        System.out.println("What is the average age of male and female employees?");
        Map<String,Double>  avgAgeOfMaleAndFemaleEmployees =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);


        //Get the details of highest paid employee in the organization?
        System.out.println("Get the details of highest paid employee in the organization?");

        Optional<Employee> highestPaidEmployeeWrapper=
                employeeList.stream()
                        .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestPaidEmployeeWrapper.get().getSalary());

        //Get the names of all employees who have joined after 2015?
        System.out.println("Get the names of all employees who have joined after 2015?");

        employeeList.stream()
                .filter(employee -> employee.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        //What is the average salary of each department?
        System.out.println("What is the average salary of each department?");
        Map<String, Double> avgSalaryOfDepartments = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // Get the details of youngest male employee in the product development department?
        System.out.println(" Get the details of youngest male employee in the product development department?");
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
                .filter(employee -> employee.getGender() == "Male" && employee.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge));

        System.out.println("youngestMaleEmployeeInProductDevelopmentWrapper  : "
              +youngestMaleEmployeeInProductDevelopmentWrapper.get().getName());
    }


}
