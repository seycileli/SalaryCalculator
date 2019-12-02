# SalaryCalculator

Scenario:
=========

In a company there are employees with two designations Manager and Trainee. 

Both employees share the same set of attributes and basic salary calculation logic is same but the basic salary of Trainee and Manager are different. 

The Manager has a travel allowance equal to 15% of the basic salary, whereas all the other employees the travel allowance is 10% of the basic salary. 

Write a program to maintain the entities using inheritance. 

PROBLEM 1)
==========

1. Create a class Employee with the following instance variables

	static long employeeId;
	static String employeeName;
	static String employeeAddress;
	static long employeePhone;
	static double basicSalary;
	static double specialAllowance = 250.80; //default value
	static double hra = 1000.50; //default value
  
 2. Create an overloaded constructor in the employee class, which takes the below constructor parameters and initializes them to their respective instance variables.

setEmployeeId(long Id)
setEmployeeName(String Name)
setEmployeeAddress(String address)
setEmployeePhone(long phone)

3. Create a method calculateSalary in which the basic salary needs to be calculated as below.
salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);

PROBLEM 2)
==========

1. Create the sub classes Manager and Trainee with base class Employee. Create overloaded constructors which takes the below parameters and initializes them to their respective variables in the super class

setEmployeeId(long Id)
setEmployeeName(String Name)
setEmployeeAddress(String address)
setEmployeePhone(long phone)
setBasicSalary(double basicSalary) 

PROBLEM 3)
==========

Create a class “InheritanceActivity.java” with a main method which performs the below functions

TestCase1)
=========

Create an instance of Manager class by calling the overloaded constructor with the below parameters:

id = 126534
name = Peter
address = Chennai India
phone# = 237844
basic salary = 65k

Invoke the calculateSalary method of the manager object.  The salary calculated should be printed in the console.

TestCase2)
==========

Create an instance of Trainee class by calling the overloaded constructor with the below parameters:

id = 29846
name = Jack
address = Mumbai India
phone# = 442085
basic salary = 45k

Invoke the calculateSalary method of the trainee object.  The salary calculated should be printed in the console

PROBLEM 4)
==========

1. Add a method called calculateTransportAllowance in Employee class which should calculate the transport allowance by calculating 10% (default allowance) of the salary. Print the salary after calculating.  transportAllowance = 10 * basicSalary / 100 
 
2. For a manager, the transportation allowance is 15% of the basic salary. So override the calculateTransportAllowance method in Manager class which should calculate the transport allowance as 15% of the base salary. Print the salary after calculating.  
 
transportAllowance = 15 * basicSalary /100. 
 
3. For a trainee, the transport allowance is same as the default allowance; the method calculateTransportAllowance in the base class can be used.  
 
4. Invoke the calculateTransportAllowance for the manager and trainee class in the main method of  InheritanceActivity.java
